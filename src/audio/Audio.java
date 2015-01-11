package audio;

import log.Log;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import java.io.File;

/**
 * Created by Free on 2015/01/10.
 */
public class Audio {
    public static final String CLASS = Thread.currentThread().getStackTrace()[1].getClassName();
    private static final int THREAD_SLEEP_MILLISECOND = 100;
    private static Clip clipBGM = null;

    private Audio() {
    }

    public static void play(String FROM_CLASS, String FROM_METHOD, final String audioPathname) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);
        Log.write("play(" + audioPathname + ");");
        try {
            new Thread(new Runnable() {
                public void run() {
                    Clip clip = null;
                    try {
                        clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
                        clip.open(AudioSystem.getAudioInputStream(new File(audioPathname)));
                        clip.start();
                        do {
                            Thread.sleep(THREAD_SLEEP_MILLISECOND);
                        } while (clip != null && clip.isRunning());
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        if (clip != null) {
                            clip.close();
                        }
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    public static void playBGM(String FROM_CLASS, String FROM_METHOD, final String audioPathname) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);
        Log.write("playBGM(" + audioPathname + ");");
        try {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        closeBGM();
                        clipBGM = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
                        clipBGM.open(AudioSystem.getAudioInputStream(new File(audioPathname)));
                        clipBGM.loop(Clip.LOOP_CONTINUOUSLY);
                        do {
                            Thread.sleep(THREAD_SLEEP_MILLISECOND);
                        } while (clipBGM != null && clipBGM.isRunning());
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        closeBGM();
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    public static boolean isBGMPlaying() {
        return clipBGM != null;
    }

    public static void stopBGM(String FROM_CLASS, String FROM_METHOD) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);
        Log.write("stopBGM(" + ");");
        try {
            if (isBGMPlaying()) {
                clipBGM.stop();
            }
            closeBGM();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    private static void closeBGM() {
        try {
            if (clipBGM != null) {
                clipBGM.close();
                clipBGM = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
