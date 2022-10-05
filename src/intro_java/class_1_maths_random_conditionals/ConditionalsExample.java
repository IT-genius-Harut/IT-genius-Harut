package intro_java.class_1_maths_random_conditionals;

import java.util.Random;

public class ConditionalsExample {
    public static void main(String[] args) {
        ifStatementExample();
        switchExample();
        mergedSwitchExample(6);
        switchStatementWithString("Monday");
        ternaryOperatorExample();
        complicatedTernaryExample();
    }

    public static String getRandomMonth() {
        return getMonth(new Random().nextInt(12) + 1);
//        return getMonth((int) (Math.random() * 12 + 1));
    }

    public static void switchExample() {
        int month = 4;
        String monthName = getMonth(month);
        System.out.println("The month is " + monthName);
    }

    public static void mergedSwitchExample(int number) {

        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Number is between 1 and 4");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Number is between 5 and 7");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Number is between 8 and 11");
                break;
            default:
                System.out.println("Number is not between 1 and 11");
        }
    }

    public static void switchStatementWithString(String day) {
        switch (day) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Today is not a valid day");
        }
    }

    public static void ifStatementExample() {
        int a = 40;
        int b = 20;
        if (a > b) {
            System.out.println("a is greater than b");
            if (a == 2 * b) {
                System.out.println("a is twice as big as b");
            }
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }
    }

    public static void ternaryOperatorExample() {
        int a = 10;
        int b = 20;
        String result = (a > b && a == 2 * b) ? "aaaaa" : "bbbb";
        if (a > b && a == 2 * b) {
            result = "aaaa";
        } else {
            result = "bbbb";
        }
        System.out.println(result);
    }

    public static void complicatedTernaryExample() {
        int a = 10;
        int b = 20;
        String result = (a > b) ? "a is greater than b" : (a < b) ? "a is less than b" : "a is equal to b";
        System.out.println(result);
    }

    public static String getMonth(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month";
                break;
        }
        return monthName;
    }
}
