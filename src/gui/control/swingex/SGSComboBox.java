package gui.control.swingex;

import log.Log;

import javax.swing.*;

/**
 * Created by Free on 2014/12/30.
 */
public class SGSComboBox extends JComboBox {
    public static final String CLASS = Thread.currentThread().getStackTrace()[1].getClassName();

    public SGSComboBox(String FROM_CLASS, String FROM_METHOD, int x, int y, int width, int height, String[] itemArray) {
        String METHOD = CLASS; // Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        setBoundsEx(FROM_CLASS, FROM_METHOD, x, y, width, height);
        addItemEx(FROM_CLASS, FROM_METHOD, itemArray);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    public void setBoundsEx(String FROM_CLASS, String FROM_METHOD, int x, int y, int width, int height) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        Log.write("setBounds(" + x + ", " + y + ", " + width + ", " + height + ");");
        setBounds(x, y, width, height);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    public void addItemEx(String FROM_CLASS, String FROM_METHOD, String[] itemArray) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        StringBuffer log = new StringBuffer();
        int index = 0;
        for (String item : itemArray) {
            log.append("[" + index + ":" + item + "]");
            addItem(item);
            index++;
        }
        Log.write("addItem(" + log + ")");

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }
}
