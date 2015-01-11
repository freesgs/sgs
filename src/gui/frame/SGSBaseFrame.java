package gui.frame;

import audio.Audio;
import audio.AudioDefine;
import gui.control.swingex.SGSImageLabel;
import icon.IconDefine;
import image.ImageDefine;
import log.Log;

import javax.swing.*;
import java.awt.event.*;

import static gui.control.swingex.SGSImageLabel.getImageIcon;

/**
 * Created by Free on 2014/12/31.
 */
public abstract class SGSBaseFrame extends JFrame {
    public static final String CLASS = SGSBaseFrame.class.getSimpleName(); // Thread.currentThread().getStackTrace()[1].getClassName();
    public static final String METHOD = CLASS;

    public static final String FRAME_TITLE = "飞雨三国杀"; // If you want to change this line,
    // you should obtain the consent by
    // mail to lihongyu19781114@hotmail.com
    public static final int FRAME_WIDTH = 640;
    public static final int FRAME_HEIGHT = 400;
    public static final int BGM_SIZE = 20;
    public static final int EXIT_SIZE = 18;
    public static final int ICON_SIZE = 512;

    protected SGSImageLabel lblFrameBG = new SGSImageLabel(CLASS, METHOD, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, ImageDefine.SYSTEM_BACKGROUND_SELECT);
    protected SGSImageLabel lblBGM = new SGSImageLabel(CLASS, METHOD, 0, 0, BGM_SIZE, BGM_SIZE, ImageDefine.SYSTEM_BUTTON_REPLAY_PAUSE_DOWN);
    protected SGSImageLabel lblEXIT = new SGSImageLabel(CLASS, METHOD, FRAME_WIDTH - EXIT_SIZE, 0, EXIT_SIZE, EXIT_SIZE, ImageDefine.SYSTEM_CLOSE2);

    private boolean mouseDragged = false;
    private int mouseDragToX = 0;
    private int mouseDragToY = 0;

    public SGSBaseFrame() {
        String FROM_CLASS = CLASS;
        String FROM_METHOD = METHOD;

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        Log.write("getRootPane().setWindowDecorationStyle(JRootPane.NONE);");
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);

        Log.write("setAlwaysOnTop(true);");
        setAlwaysOnTop(true);

        Log.write("setBounds(0, 0, " + FRAME_WIDTH + ", " + FRAME_HEIGHT + ");");
        setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        Log.write("setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Log.write("setIconImage(getImageIcon(" + ICON_SIZE + ", " + ICON_SIZE + ", " + IconDefine.SCORPIO_ROBOT_512X512 + ").getImage());");
        setIconImage(getImageIcon(CLASS, METHOD, ICON_SIZE, ICON_SIZE, IconDefine.SCORPIO_ROBOT_512X512).getImage());

        Log.write("setLocationRelativeTo(null);");
        setLocationRelativeTo(null);

        Log.write("setResizable(false);");
        setResizable(false);

        Log.write("setTitle(" + FRAME_TITLE + ");");
        setTitle(FRAME_TITLE);

        Log.write("setUndecorated(true);");
        setUndecorated(true);

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent event) {
                String FROM_CLASS = "KeyAdapter";
                String FROM_METHOD = "keyPressed";
                String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
                Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);
                Log.write("KeyCode = [" + event.getKeyCode() + "]");

                if (event.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    Log.write("System.exit(0);");
                    Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
                    System.exit(0);
                } else {
                    Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
                }
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                mouseDragged = true;
                mouseDragToX = e.getX();
                mouseDragToY = e.getY();
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                mouseDragged = false;
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (mouseDragged) {
                    setLocation(getLocation().x + e.getX() - mouseDragToX, getLocation().y + e.getY() - mouseDragToY);
                }
            }
        });

        Log.write("getLayeredPane().add(lblFrameBG, -1);");
        getLayeredPane().add(lblFrameBG, -1);

        Log.write("getLayeredPane().add(lblBGM, 0);");
        getLayeredPane().add(lblBGM, 0);
        lblBGM.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String FROM_CLASS = "MouseAdapter";
                String FROM_METHOD = "mouseClicked";
                String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
                Log.write(FROM_CLASS, FROM_METHOD, CLASS + "." + lblBGM.getClass().getName(), METHOD, Log.S);
                Log.write("MouseBUTTON = [" + e.getButton() + "]");

                if (e.getButton() == MouseEvent.BUTTON1) {
                    if (Audio.isBGMPlaying()) {
                        Audio.stopBGM(CLASS + "." + lblBGM.getClass().getName(), METHOD);
                        lblBGM.setIconEx(CLASS + "." + lblBGM.getClass().getName(), METHOD, BGM_SIZE, BGM_SIZE, ImageDefine.SYSTEM_BUTTON_REPLAY_PAUSE_DOWN);
                    } else {
                        Audio.playBGM(CLASS + "." + lblBGM.getClass().getName(), METHOD, AudioDefine.SYSTEM_BACKGROUND);
                        lblBGM.setIconEx(CLASS + "." + lblBGM.getClass().getName(), METHOD, BGM_SIZE, BGM_SIZE, ImageDefine.SYSTEM_BUTTON_REPLAY_PAUSE_DISABLED);
                    }
                }

                Log.write(FROM_CLASS, FROM_METHOD, CLASS + "." + lblBGM.getClass().getName(), METHOD, Log.E);
            }
        });

        Log.write("getLayeredPane().add(lblEXIT, 0);");
        getLayeredPane().add(lblEXIT, 0);
        lblEXIT.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
                String FROM_CLASS = "MouseAdapter";
                String FROM_METHOD = "mouseClicked";
                Log.write(FROM_CLASS, FROM_METHOD, CLASS + "." + lblEXIT.getClass().getName(), METHOD, Log.S);
                Log.write("MouseBUTTON = [" + e.getButton() + "]");

                if (e.getButton() == MouseEvent.BUTTON1) {
                    Log.write("System.exit(0);");
                    Log.write(FROM_CLASS, FROM_METHOD, CLASS + "." + lblEXIT.getClass().getName(), METHOD, Log.E);
                    System.exit(0);
                }

                Log.write(FROM_CLASS, FROM_METHOD, CLASS + "." + lblEXIT.getClass().getName(), METHOD, Log.E);
            }
        });

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    abstract public void displayFrame(String FROM_CLASS, String FROM_METHOD);

    public void setBoundsEx(String FROM_CLASS, String FROM_METHOD, int x, int y, int width, int height) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        Log.write("setBounds(" + x + ", " + y + ", " + width + ", " + height + ");");
        setBounds(x, y, width, height);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    public void setVisibleEx(String FROM_CLASS, String FROM_METHOD, boolean visible) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        if (Audio.isBGMPlaying()) {
            lblBGM.setIconEx(CLASS, METHOD, BGM_SIZE, BGM_SIZE, ImageDefine.SYSTEM_BUTTON_REPLAY_PAUSE_DISABLED);
        } else {
            lblBGM.setIconEx(CLASS, METHOD, BGM_SIZE, BGM_SIZE, ImageDefine.SYSTEM_BUTTON_REPLAY_PAUSE_DOWN);
        }

        Log.write("setVisible(" + visible + ");");
        setVisible(visible);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }
}
