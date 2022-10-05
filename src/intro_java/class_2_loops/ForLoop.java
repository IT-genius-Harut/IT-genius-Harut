package intro_java.class_2_loops;

public class ForLoop {
    public static void main(String[] args) {
        // printing numbers from 1 to 10 without a loop
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        System.out.println("Printing numbers from 1 to 10 with a loop");

        // printing numbers from 1 to 10 with a loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // examples
        // 1. print all even numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // 2. print all numbers from 1 to 20 that are divisible by 3
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        // 3. print a triangle of stars
        int triangleHeight = 5;
        System.out.println("Triangle of Stars");
        for (int i = 1; i <= triangleHeight; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 4. print a reverse triangle of stars
        int reverseTriangleHeight = 5;
        System.out.println("Reverse Triangle of Stars");
        for (int i = reverseTriangleHeight; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 5. multiplication table for a number
        int multiplicationTableFor = 5;
        System.out.println("Multiplication Table for " + multiplicationTableFor);
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplicationTableFor + " x " + i + " = " + multiplicationTableFor * i);
        }
        // 6. print a triangle of numbers
        int triangleNumber = 5;
        System.out.println("Triangle of Numbers");
        for (int i = 1; i <= triangleNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
