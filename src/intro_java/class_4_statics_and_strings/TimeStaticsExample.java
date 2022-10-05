package intro_java.class_4_statics_and_strings;

public class TimeStaticsExample {
    public static void main(String[] args) {
        // calling a static method from TimeUtils class instead of defining it in each class

        // converting 5 days to seconds
        int days = 5;
        int fiveDays = TimeUtils.daysToSeconds(days);
        System.out.println(days + " days in seconds: " + fiveDays);

        // converting 90 seconds to minutes
        int seconds = 90;
        float minutes = TimeUtils.secondsToMinutes(seconds);
        System.out.println(seconds + " seconds in minutes: " + minutes);
    }
}
