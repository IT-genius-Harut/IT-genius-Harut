package homework.hw3;

import java.util.Scanner;

public class findSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please input number one ");
        int number1 = scanner.nextInt();
        System.out.print("please input number two ");
        int number2 = scanner.nextInt();
        System.out.print("please input number three ");
        int number3 = scanner.nextInt();
        int min = findSmallestElement(number1, number2, number3);
        System.out.println("min number = " + min);
    }

    public static int findSmallestElement(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < num1 && num2 < num3) {
            min = num2;
            return min;
        } else if (num3 < num1 && num3 < num2) {
            min = num3;
            return num3;
        }
        return min;

    }
}