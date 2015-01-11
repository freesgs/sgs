package log;

import java.text.SimpleDateFormat;

/**
 * Created by Free on 2015/01/10.
 */
public class Log {
    public static final String S = "▼";
    public static final String E = "▲";

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final String SPACE = " ";
    private static final int NUMBER_OF_PADDING_SPACE = 2;
    private static int numberOfPaddingSpace = 0;

    private Log() {
    }

    public static void write(String fromClass, String fromMethod, String toClass, String toMethod, String startEnd) {
        try {
            System.out.print(simpleDateFormat.format(System.currentTimeMillis()));
            if (S.equals(startEnd)) {
                numberOfPaddingSpace += NUMBER_OF_PADDING_SPACE;
            }
            System.out.printf("%" + (numberOfPaddingSpace) + "s", SPACE);
            if (E.equals(startEnd)) {
                numberOfPaddingSpace -= NUMBER_OF_PADDING_SPACE;
            }
            System.out.println(
                    (fromClass != null && fromClass.length() > 0 ? fromClass + "." : "") +
                            (fromMethod != null && fromMethod.length() > 0 ? fromMethod + "()" : "") + "->" +
                            (toClass != null && toClass.length() > 0 ? toClass + "." : "") +
                            (toMethod != null && toMethod.length() > 0 ? toMethod + "()" : "") +
                            startEnd
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void write(Object log) {
        try {
            System.out.print(simpleDateFormat.format(System.currentTimeMillis()));
            System.out.printf("%" + (numberOfPaddingSpace + NUMBER_OF_PADDING_SPACE) + "s", SPACE);
            System.out.println(log);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}