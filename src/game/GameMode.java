package game;

import log.Log;

/**
 * Created by Free on 2014/12/30.
 */
public enum GameMode {
    RANDOM(0, "随机", 0, 0, 0, 0, 0),
    MR(1, "2人局 [主反]", 2, 1, 0, 1, 0),
    MT(2, "2人局 [主内]", 2, 1, 0, 0, 1),
    MRR(3, "3人局 [主反反]", 3, 1, 0, 2, 0),
    MTT(4, "3人局 [主内内]", 3, 1, 0, 0, 2),
    MRT(5, "3人局 [主反内]", 3, 1, 0, 1, 1),
    MMT(6, "3人局 [主忠内]", 3, 1, 1, 0, 1),
    MMR(7, "3人局 [主忠反]", 3, 1, 1, 1, 0),
    MMRT(8, "4人局 [主忠反内]", 4, 1, 1, 1, 1),
    MMRRT(9, "5人局 [主忠反反内]", 5, 1, 1, 2, 1),
    MMRRRT(10, "6人局 [主忠反反反内][单内]", 6, 1, 1, 3, 1),
    MMRRTT(11, "6人局 [主忠反反内内][双内]", 6, 1, 1, 2, 2),
    MMMRRRT(12, "7人局 [主忠忠反反反内]", 7, 1, 2, 3, 1),
    MMMRRRRT(13, "8人局 [主忠忠反反反反内][单内]", 8, 1, 2, 4, 1),
    MMMRRRTT(14, "8人局 [主忠忠反反反内内][双内]", 8, 1, 2, 3, 2),;
    public static final String CLASS = Thread.currentThread().getStackTrace()[1].getClassName();
    public static final String CAPTION = "游戏模式";
    public final int index;
    public final String text;
    public static final String[] itemArray = {
            RANDOM.text,
            MR.text,
            MT.text,
            MRR.text,
            MTT.text,
            MRT.text,
            MMT.text,
            MMR.text,
            MMRT.text,
            MMRRT.text,
            MMRRRT.text,
            MMRRTT.text,
            MMMRRRT.text,
            MMMRRRRT.text,
            MMMRRRTT.text,};
    private final int _playerNumbers;
    private final int _monarchNumbers;
    private final int _ministerNumbers;
    private final int _rebelNumbers;
    private final int _turncoatNumbers;

    private GameMode(int index, String text, int playerNumbers, int monarchNumbers, int ministerNumbers, int rebelNumbers, int turncoatNumbers) {
        this.index = index;
        this.text = text;
        this._playerNumbers = playerNumbers;
        this._monarchNumbers = monarchNumbers;
        this._ministerNumbers = ministerNumbers;
        this._rebelNumbers = rebelNumbers;
        this._turncoatNumbers = turncoatNumbers;
        if (playerNumbers != monarchNumbers + ministerNumbers + rebelNumbers + turncoatNumbers) {
            try {
                throw new Exception("playerNumbers != monarchNumbers + ministerNumbers + rebelNumbers + turncoatNumbers");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static int getPlayerNumbers(String FROM_CLASS, String FROM_METHOD, int index) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        int returnValue = 0;
        for (GameMode gameMode : GameMode.values()) {
            if (index == gameMode.index) {
                returnValue = gameMode._playerNumbers;
                break;
            }
        }

        Log.write(METHOD + "(" + index + ")" + " returns " + returnValue);
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
        return returnValue;
    }

    public static int getMonarchNumbers(String FROM_CLASS, String FROM_METHOD, int index) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        int returnValue = 0;
        for (GameMode gameMode : GameMode.values()) {
            if (index == gameMode.index) {
                returnValue = gameMode._monarchNumbers;
                break;
            }
        }

        Log.write(METHOD + "(" + index + ")" + " returns " + returnValue);
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
        return returnValue;
    }

    public static int getMinisterNumbers(String FROM_CLASS, String FROM_METHOD, int index) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        int returnValue = 0;
        for (GameMode gameMode : GameMode.values()) {
            if (index == gameMode.index) {
                returnValue = gameMode._ministerNumbers;
                break;
            }
        }

        Log.write(METHOD + "(" + index + ")" + " returns " + returnValue);
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
        return returnValue;
    }

    public static int getRebelNumbers(String FROM_CLASS, String FROM_METHOD, int index) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        int returnValue = 0;
        for (GameMode gameMode : GameMode.values()) {
            if (index == gameMode.index) {
                returnValue = gameMode._rebelNumbers;
                break;
            }
        }

        Log.write(METHOD + "(" + index + ")" + " returns " + returnValue);
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
        return returnValue;
    }

    public static int getTurncoatNumbers(String FROM_CLASS, String FROM_METHOD, int index) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        int returnValue = 0;
        for (GameMode gameMode : GameMode.values()) {
            if (index == gameMode.index) {
                returnValue = gameMode._turncoatNumbers;
                break;
            }
        }

        Log.write(METHOD + "(" + index + ")" + " returns " + returnValue);
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
        return returnValue;
    }
}
