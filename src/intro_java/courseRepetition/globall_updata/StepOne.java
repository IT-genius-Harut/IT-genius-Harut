package intro_java.courseRepetition.globall_updata;

import java.util.Random;

public class StepOne {
    public static void main(String[] args) {
        /* class 1 primitive type */
        //type 1
        int a = 7;
        int b = 2;

        //type 2
        byte a1 = 8;
        byte b1 = 3;

        //type 3
        short a2 = 38;
        short b2 = 176;

        //type 4
        long a3 = 123548;
        long b3 = 781644;

        //type 5
        float a4 = 45.7f;
        float b4 = 27.3f;

        //type 6
        double a5 = 28.1;
        double b5 = 974.3;

        //type 7
        boolean a6 = true;
        boolean b6 = false;

        //type 8
        char a7 = '(';
        char b7 = 'A';

        //Math ex.
        int c = a + b;
        System.out.println("c = " + c);
        int c1 = a1 + b1;
        System.out.println("c1 = " + c1);
        int c2 = a2 + b2;
        System.out.println("c2 = " + c2);
        long c3 = a3 + b3;
        System.out.println("c3 = " + c3);
        double c4 = a4 + b4;
        System.out.println("c4 = " + c4);
        double c5 = a5 + b5;
        System.out.println("c5 = " + c5);
        String c6 = a6 + " " + b6;
        System.out.println("c6 = " + c6);
        String c7 = a7 + " " + b7;
        System.out.println("c7 = " + c7);

        switchExample(5);
        egtDay("monday");
        ifStatementExample(8, 17);
        System.out.println("Math.min = " + Math.min(4, 8));
        System.out.println("Math.max = " + Math.max(70, 39));
        System.out.println("Math..flour = " + Math.floor(841.5));
        System.out.println("math.ceil = " + Math.ceil(52.7));
        System.out.println("Math.random = " + Math.random());
        System.out.println("Math.sqrt" + Math.sqrt(256));
        System.out.println("Math.round" + Math.round(1.5));
        long seed = 123456788;
        Random random = new Random(seed);
        int randomInt = random.nextInt();
        System.out.println(randomInt);
        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

    }

    public static int randomNumberInRang(int start, int end) {
        return (int) Math.random() * ((end - start) + 1);
    }

    public static void switchExample(int number) {
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("the number is between 1 to 4");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("the number is between 5 to 7");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("the number is between 8 to 10");
                break;
            default:
                System.out.println("the number is not supported yet");
        }

    }

    public static void egtDay(String day) {
        switch (day) {
            case "monday":
                System.out.println("Today is: Monday");
                break;
            case "tuesday":
                System.out.println("Today is: Tuesday");
                break;
            case "wednesday":
                System.out.println("Today is: Wednesday");
            case "thursday":
                System.out.println("Today is: Thursday");
            case "friday":
                System.out.println("Today is: Friday");
            case "saturday":
                System.out.println("Today is: Saturday");
                break;
            case "sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Today is a valid day");
        }
    }

    public static void ifStatementExample(int a, int b) {
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is lesser than b");
        } else
            System.out.println("a is equal b");
    }
}
