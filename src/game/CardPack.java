package game;

/**
 * Created by Free on 2014/12/30.
 */
public enum CardPack {
    STANDARD(0, "标准版"),
    BATTLE(1, "军争包");

    public static final String CAPTION = "卡牌包";

    public final int index;
    public final String text;

    private CardPack(int index, String text) {
        this.index = index;
        this.text = text;
    }
}
