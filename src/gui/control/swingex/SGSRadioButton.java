package gui.control.swingex;

import log.Log;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Free on 2014/12/30.
 */
public class SGSRadioButton extends JRadioButton {
    public static final String CLASS = Thread.currentThread().getStackTrace()[1].getClassName();

    public SGSRadioButton(String FROM_CLASS, String FROM_METHOD, int x, int y, int width, int height, String text, Color color) {
        String METHOD = CLASS; // Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        setBoundsEx(FROM_CLASS, FROM_METHOD, x, y, width, height);
        setForegroundEx(FROM_CLASS, FROM_METHOD, color);
        setOpaqueEx(FROM_CLASS, FROM_METHOD, false);
        setTextEx(FROM_CLASS, FROM_METHOD, text);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    public void setBoundsEx(String FROM_CLASS, String FROM_METHOD, int x, int y, int width, int height) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        Log.write("setBounds(" + x + ", " + y + ", " + width + ", " + height + ");");
        setBounds(x, y, width, height);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    public void setForegroundEx(String FROM_CLASS, String FROM_METHOD, Color color) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        Log.write("setForeground(" + color + ");");
        setForeground(color);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    public void setOpaqueEx(String FROM_CLASS, String FROM_METHOD, boolean isOpaque) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        Log.write("setOpaque(" + isOpaque + ");");
        setOpaque(isOpaque);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    public void setTextEx(String FROM_CLASS, String FROM_METHOD, String text) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        Log.write("setText(" + text + ");");
        setText(text);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }
}
