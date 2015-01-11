package game;

/**
 * Created by Free on 2014/12/30.
 */
public enum HeroPack {
    STANDARD(0, "标准版"),
    WIND(1, "风"),
    FIRE(2, "火"),
    WOOD(3, "林"),
    HILL(4, "山"),
    SP(5, "SP"),
    SP2(6, "☆SP"),
    OVER_KNIGHT_FAME(7, "一将成名"),
    OVER_KNIGHT_FAME_2012(8, "一将2012"),
    OVER_KNIGHT_FAME_2013(9, "一将2013");

    public static final String CAPTION = "武将包";

    public final int index;
    public final String text;

    private HeroPack(int index, String text) {
        this.index = index;
        this.text = text;
    }
}
