package homework.hw3;

import java.util.Scanner;

public class checkWhetherYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a year");
        int number = scanner.nextInt();
        boolean b = checkYears(number);
        System.out.println(b);
    }

    public static boolean checkYears(int number) {
        for (int i = 0; i < 10000; i = i + 4) {
            if (number == i) {
                return true;
            }
        }
        return false;
    }
}
