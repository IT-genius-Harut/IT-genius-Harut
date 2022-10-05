package intro_java.class_4_statics_and_strings;

/**
 * util class for static methods for time conversions
 */
public class TimeUtils {
    /**
     * amount of seconds in a day
     */
    public static int SECONDS_IN_DAY = 60 * 60 * 24;
    /**
     * amount of seconds in a minute
     */
    public static int SECONDS_IN_MINUTE = 60;

    /**
     * @param day amount of days
     * @return the amount of seconds in the provided amount of days
     */
    public static int daysToSeconds(int day) {
        return day * SECONDS_IN_DAY;
    }

    /**
     * @param seconds amount of seconds
     * @return the amount of minutes in the provided amount of seconds
     */
    public static float secondsToMinutes(int seconds) {
//        return (seconds * 1f) / SECONDS_IN_MINUTE;
        return (float) seconds / SECONDS_IN_MINUTE;
    }
}
