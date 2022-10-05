package class_work;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input number");
        int number = scanner.nextInt();
        int factorial = fact(number);
        System.out.println("factorial number is: " + factorial);
        System.out.println("fibonacci " + number + " number is: " + fib(number));
        fib(number);
        for (int i = 1; i <= number; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    public static int fib(int number) {
        if (number == 1 || number == 0) {
            return number;
        }
        return (fib(number - 1) + fib(number - 2));
    }

    public static int fact(int a) {
        if (a == 1) {
            return a;
        }
        return a * fact(a - 1);
    }
}
