package util;

public final class WaitUtils {

    public static void sleep(int timeout) {
        CustomLogger.info("Sleeping");
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
