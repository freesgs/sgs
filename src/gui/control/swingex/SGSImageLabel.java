package gui.control.swingex;

import log.Log;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Free on 2014/12/30.
 */
public class SGSImageLabel extends JLabel {
    public static final String CLASS = Thread.currentThread().getStackTrace()[1].getClassName();

    public SGSImageLabel(String FROM_CLASS, String FROM_METHOD, int x, int y, int width, int height, String imagePathname) {
        String METHOD = CLASS; // Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        setBoundsEx(FROM_CLASS, FROM_METHOD, x, y, width, height);
        setIconEx(FROM_CLASS, FROM_METHOD, width, height, imagePathname);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    public static ImageIcon getImageIcon(String FROM_CLASS, String FROM_METHOD, int imageWidth, int imageHeight, String imagePathname) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        // Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        // Log.write("getImageIcon(" + imageWidth + ", " + imageHeight + ", " + imagePathname + ");");
        ImageIcon imageIcon = new ImageIcon(imagePathname);
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT));

        // Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
        return imageIcon;
    }

    public void setBoundsEx(String FROM_CLASS, String FROM_METHOD, int x, int y, int width, int height) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        Log.write("setBounds(" + x + ", " + y + ", " + width + ", " + height + ");");
        setBounds(x, y, width, height);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }

    public void setIconEx(String FROM_CLASS, String FROM_METHOD, int imageWidth, int imageHeight, String imagePathname) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        Log.write("setIcon(getImageIcon(" + imageWidth + ", " + imageHeight + ", " + imagePathname + "));");
        setIcon(getImageIcon(FROM_CLASS, FROM_METHOD, imageWidth, imageHeight, imagePathname));

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }
}
