package game;

/**
 * Created by Free on 2014/12/30.
 */
public enum OperateTime {
    UNLIMITED(0, "无限制", 0),
    TEN_SECOND(1, "10秒", 10),
    FIFTEEN_SECOND(2, "15秒", 15),
    TWENTY_SECOND(3, "20秒", 20);
    public static final String CAPTION = "操作时间";
    public final int index;
    public final String text;
    public static final String[] itemArray = {
            UNLIMITED.text,
            TEN_SECOND.text,
            FIFTEEN_SECOND.text,
            TWENTY_SECOND.text,
    };
    public final int value;

    private OperateTime(int index, String text, int value) {
        this.index = index;
        this.text = text;
        this.value = value;
    }
}
