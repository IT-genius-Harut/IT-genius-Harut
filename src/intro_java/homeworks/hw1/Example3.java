package intro_java.homeworks.hw1;

public class Example3 {
    public static void main(String[] args) {
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
    }
}
