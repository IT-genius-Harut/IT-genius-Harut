package intro_java.homeworks.hw1;

public class Example4 {
    public static void main(String[] args) {
        // example 4
        System.out.println("Example 4");
        boolean five = isEven(5); // this should be false
        boolean eight = isEven(8); // this should be true
        System.out.println(five);
        System.out.println(eight);
    }

    public static boolean isEven(int number) {
//        if (number % 2 == 0) return true;
//        else return false;
        return number % 2 == 0;
    }
}
