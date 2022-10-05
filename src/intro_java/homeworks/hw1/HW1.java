package intro_java.homeworks.hw1;

public class HW1 {

    public static void main(String[] args) {
        // example 1
        System.out.println("Example 1");
        int a = 8;
        float b = 10.7f;
        int addition = (int) (a + b);
        float floatAddition = a + b;
        float multiplication = a * b;
        float remainder = b % a;
        float otherRemainder = a % b; // 8 % 10.7 = 8
        System.out.println(addition);
        System.out.println(floatAddition);
        System.out.println(multiplication);
        System.out.println(remainder);
        System.out.println(otherRemainder);
        // example 2
        System.out.println("Example 2");
        int result = multiply(4, 5);
        System.out.println(result); // this should print 20
        // example 3
        System.out.println("Example 3");
        int number1 = 7;
        int number2 = 9;
        // write your swapping logic here
        int tmp = number2; // tmp = 9
        number2 = number1; // number2 = 7
        number1 = tmp; // number 1 = 9
        System.out.println("with 3rd variable");
        System.out.println(number1); // this should print 9
        System.out.println(number2); // this should print 7
        // without 3rd variable
        number1 = 15;
        number2 = 36;
        number1 = number1 + number2; // 15 + 36 = 51
        number2 = number1 - number2; // 51 - 36 = 15
        number1 = number1 - number2; // 51 - 15 = 36
        System.out.println("without 3rd variable");
        System.out.println(number1);
        System.out.println(number2);

        // example 4
        System.out.println("Example 4");
        boolean five = isEven(5); // this should be false
        boolean eight = isEven(8); // this should be true
        System.out.println(five);
        System.out.println(eight);

        // example 5
        String numberSign1 = getSign(8); // this should return positive
        String numberSign2 = getSign(-14); // this should return negative
        String numberSign3 = getSign(0); // this should return zero
        System.out.println("Example 5");
        System.out.println(numberSign1);
        System.out.println(numberSign2);
        System.out.println(numberSign3);
    }

    public static String getSign(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static boolean isEven(int number) {
//        if (number % 2 == 0) return true;
//        else return false;
        return number % 2 == 0;
    }
}
