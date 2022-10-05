package intro_java.class_2_loops;

import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        int number = 0;
        // print numbers from 0 to 9
        while (number < 10) {
            System.out.println(number);
            number++;
        }
        System.out.println("Print numbers from 0 to 9 using do while loop");
        // print numbers from 0 to 9 using do while loop
        do {
            System.out.println(number);
            number++;
        } while (number < 10);
        // infinite loop

 /*       while (true) {
            System.out.println("Hello");
        }
*/
        // examples
        Random r = new Random();
        // 1. get 5 random numbers under 0.35
        // wrong implementation with a for loop
        System.out.println("Using a for loop");
        for (int j = 0; j < 5; j++) {
            double random = r.nextDouble();
            if (random < 0.35) {
                System.out.println(j + ": " + random);
            }
        }
        // correct implementation with a while loop
        System.out.println("Using a while loop");
        double randomNumber;
        int count = 0;
        int totalTries = 0;
        while (count < 5) {
            randomNumber = r.nextDouble();
            if (randomNumber < 0.35) {
                count++;
                System.out.println(count + ": " + randomNumber);
            }
            totalTries++;
        }
        System.out.println("Total tries: " + totalTries);
        // 2. calculate the sum of all integers until the sum is greater than 100
        int sum = 0;
        int i = 0;
        while (sum < 100) {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum + " and i is " + i);
        // 3. do while loop example with a random number
        int randomNumber2;
        do {
            randomNumber2 = r.nextInt(100);
        } while (randomNumber2 < 50);
        // 4. average of numbers without body, not recommended, but it works
        int number1 = 100;
        int number2 = 200;
        while (++number1 < --number2) ;
        System.out.println("Average is " + number1);
    }
}
