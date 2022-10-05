package homework.hw2;

import java.util.Random;
import java.util.Scanner;

public class FindSpecificValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleas input number");
        int number = scanner.nextInt();
        int[] arr = new int[10];
        fillArrayWithRandomNumbers(arr);
        boolean b = findNumber(arr, number);
        System.out.println(b);
        System.out.println("this is original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillArrayWithRandomNumbers(int[]  array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
    }
    public static boolean findNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}
