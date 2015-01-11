import gui.frame.SGSBeforeGameFrame;
import log.Log;

/**
 * Created by Free on 2015/01/11.
 */
public class Main {
    public static final String CLASS = Thread.currentThread().getStackTrace()[1].getClassName();

    public static void main(String[] args) {
        String METHOD = Thread.currentThread().getStackTrace()[1].getMethodName();
        String FROM_CLASS = CLASS;
        String FROM_METHOD = METHOD;
        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.S);

        SGSBeforeGameFrame.getInstance().displayFrame(CLASS, METHOD);

        Log.write(FROM_CLASS, FROM_METHOD, CLASS, METHOD, Log.E);
    }
}
