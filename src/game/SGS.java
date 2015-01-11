package game;

/**
 * Created by Free on 2014/12/30.
 */
public class SGS {
    public static final String CLASS = Thread.currentThread().getStackTrace()[1].getClassName();

    private SGS() {
    }

    public static int random(int lowerBound, int upperBound) {
        return (int) ((upperBound - lowerBound + 1) * Math.random() + lowerBound);
    }
}
