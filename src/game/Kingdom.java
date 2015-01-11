package game;

import image.ImageDefine;
import log.Log;

/**
 * Created by Free on 2014/12/30.
 */
public enum Kingdom {
    RANDOM(0, "势力随机"),
    WEI(1, "魏"),
    SHU(2, "蜀"),
    WU(3, "吴"),
    QUN(4, "群");

    public static final String CLASS = Thread.currentThread().getStackTrace()[1].getClassName();

    public final int index;
    public final String text;

    private Kingdom(int index, String text) {
        this.index = index;
        this.text = text;
    }

    public static String getBGImagePathname(String FROM_CLASS, String FROM_METHOD, int index) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();

        final String[] BGImagePathnameArray = {
                ImageDefine.SYSTEM_BACKGROUND_SELECT,
                ImageDefine.SYSTEM_BACKGROUND_WEI,
                ImageDefine.SYSTEM_BACKGROUND_SHU,
                ImageDefine.SYSTEM_BACKGROUND_WU,
                ImageDefine.SYSTEM_BACKGROUND_QUN,
                ImageDefine.SYSTEM_BACKGROUND_FENG,
                ImageDefine.SYSTEM_BACKGROUND_HUO,
                ImageDefine.SYSTEM_BACKGROUND_LIN,
                ImageDefine.SYSTEM_BACKGROUND_SHAN,
                ImageDefine.SYSTEM_BACKGROUND_SHEN,
                ImageDefine.SYSTEM_BACKGROUND_SP,
                ImageDefine.SYSTEM_BACKGROUND_YIJIANG,
                ImageDefine.SYSTEM_BACKGROUND_NAN,
                ImageDefine.SYSTEM_BACKGROUND_NV,
        };

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        String returnValue = "";
        if (WEI.index <= index && index <= QUN.index) {
            returnValue = BGImagePathnameArray[index];
        } else {
            returnValue = BGImagePathnameArray[SGS.random(QUN.index + 1, BGImagePathnameArray.length - 1)];
        }

        Log.write(METHOD + "(" + index + ")" + " returns " + returnValue);
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
        return returnValue;
    }
}
