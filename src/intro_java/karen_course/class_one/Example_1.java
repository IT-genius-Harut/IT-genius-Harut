package intro_java.karen_course.class_one;

public class Example_1 {
    public static void main(String[] args) {
        System.out.println("Hello world"); // Hello world

        int num;
        num = 120;
        System.out.println(num); // 120
        System.out.println(num * 2); // 240

        if (num > 100){
            System.out.println("num is greater than 100"); // true
        } else if (num < 100) {
            System.out.println("num less than 100"); // false
        } else {
            System.out.println("num is equal 100"); // false
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}
