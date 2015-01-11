package game;

/**
 * Created by Free on 2014/12/30.
 */
public enum SeatNo {
    RANDOM(0, "座位随机"),
    NO1(1, "1号"),
    NO2(2, "2号"),
    NO3(3, "3号"),
    NO4(4, "4号"),
    NO5(5, "5号"),
    NO6(6, "6号"),
    NO7(7, "7号"),
    NO8(8, "8号");

    public final int index;
    public final String text;

    private SeatNo(int index, String text) {
        this.index = index;
        this.text = text;
    }
}
