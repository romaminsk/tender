package util;

import org.apache.log4j.Logger;


public final class CustomLogger {

    private CustomLogger() {
        throw new IllegalStateException("Utility class");
    }

    private static Logger log = Logger.getLogger(CustomLogger.class.getName());


    public static void info (final String message) {
        log.info(message);
    }

    public static void warn (final String message) {
        log.warn(message);
    }

    public static void error (final String message) {
        log.error(message);
    }

    public static void fatal (final String message) {
        log.fatal(message);
    }

    public static void debug (final String message) {
        log.debug(message);
    }

}
