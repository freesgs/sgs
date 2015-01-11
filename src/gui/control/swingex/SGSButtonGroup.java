package gui.control.swingex;

import log.Log;

import javax.swing.*;

/**
 * Created by Free on 2014/12/30.
 */
public class SGSButtonGroup extends ButtonGroup {
    public static final String CLASS = Thread.currentThread().getStackTrace()[1].getClassName();

    public SGSButtonGroup(String FROM_CLASS, String FROM_METHOD) {
        String METHOD = CLASS; // Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }
}
