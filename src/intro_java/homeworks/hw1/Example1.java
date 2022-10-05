package intro_java.homeworks.hw1;

public class Example1 {
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
    }
}
