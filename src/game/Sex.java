package game;

/**
 * Created by Free on 2015/01/03.
 */
public enum Sex {
    female(0, "女"),
    male(1, "男");

    public final int index;
    public final String text;

    private Sex(int index, String text) {
        this.index = index;
        this.text = text;
    }
}
