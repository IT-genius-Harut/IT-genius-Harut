package homework.hw3;

import java.util.Scanner;

public class SumIntigers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input number");
        int number = scanner.nextInt();
        int sum = findSum(number);
        System.out.println(sum);
    }
    public static int findSum(int number){
        int sum = 0;
        while (number != 0){
            sum += number % 10;

            number = number / 10;
        }
        return sum;
    }
}
