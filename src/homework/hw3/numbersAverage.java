package homework.hw3;

import java.util.Scanner;

public class numbersAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input 3 numbers ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int average = avengeOfTheThreeNumbers(number1, number2, number3);
        System.out.println("average = " + average);

    }

    public static int avengeOfTheThreeNumbers(int number, int number1, int number2) {
        return (number + number1 + number2) / 3;
    }
}
