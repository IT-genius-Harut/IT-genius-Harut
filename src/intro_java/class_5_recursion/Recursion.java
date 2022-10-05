package intro_java.class_5_recursion;

public class Recursion {
    public static void main(String[] args) {
        int value = a(6);
        System.out.println(value);
        int number = 5;
        int f = factorial(number);
        System.out.println("factorial for number " + number + " is: " + f);
        for (int i = 0; i < 12; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }





    /**
     * a recursive function that calculates the nth value of the Fibonacci sequence
     *
     * @param n the number to find fibonacci of
     * @return the nth fibonacci number
     */
    public static int fibonacci(int n) {
        // base case
        // f(0) = 1, f(1) = 1
        if (n == 0 || n == 1) {
            return 1;
        }
            // recursive case
        // f(n) = f(n-1) + f(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * a recursive function that calculates factorial of a number
     *
     * @param n number to calculate factorial
     * @return factorial of n
     */
    public static int factorial(int n) {
        // base case
        if (n == 1) {
            return 1;
        }
        // recursive case
        // n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    /**
     * a simple recursive function example discussed in class
     * @param n argument to the function
     * @return the value of the function at n
     */
    public static int a(int n) {
        // base case
        if (n == 1) {
            return 3;
        }
        // recursive case
        // a(n) = a(n-1) + 2
        return a(n - 1) + 2;
    }
}
