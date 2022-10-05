package homework.hw3;

import java.util.Scanner;

public class digitNumberCont {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input numbers");
        int array = scanner.nextInt();
        int number = findDigits(array);
        System.out.println("the number is: " + number);
    }

    public static int findDigits(int number) {
        while (number != 0) {
            number %= 10;
            if (number == number++) {
                return --number;
            }
        }
        return -1;
    }


}
