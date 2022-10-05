package intro_java.homeworks.hw1;

public class Example5 {
    public static void main(String[] args) {
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
}
