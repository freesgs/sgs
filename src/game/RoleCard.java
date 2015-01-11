package game;

import gui.control.swingex.SGSImageLabel;
import image.ImageDefine;

import javax.swing.*;

/**
 * Created by Free on 2014/12/30.
 */
public enum RoleCard {
    RANDOM(0, "随机", ImageDefine.ROLECARD_BACK),
    MONARCH(1, "主公", ImageDefine.ROLECARD_MONARCH),
    MINISTER(2, "忠臣", ImageDefine.ROLECARD_MINISTER),
    REBEL(3, "反贼", ImageDefine.ROLECARD_REBEL),
    TURNCOAT(4, "内奸", ImageDefine.ROLECARD_TURNCOAT);
    public static final String CAPTION = "身份牌";
    public static final int IMAGE_WIDTH = 42;
    public static final int IMAGE_HEIGHT = 57;
    public final int index;
    public final String text;
    public static final String[] itemArray = {
            RANDOM.text,
            MONARCH.text,
            MINISTER.text,
            REBEL.text,
            TURNCOAT.text,
    };
    public final ImageIcon image;

    private RoleCard(int index, String text, String imagePath) {
        String CLASS = "RoleCard"; // Thread.currentThread().getStackTrace()[1].getClassName();
        String METHOD = CLASS; // Thread.currentThread().getStackTrace()[1].getMethodName();
        this.index = index;
        this.text = text;
        this.image = SGSImageLabel.getImageIcon(CLASS, METHOD, IMAGE_WIDTH, IMAGE_HEIGHT, imagePath);
    }
}
