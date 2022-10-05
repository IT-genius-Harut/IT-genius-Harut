package class_work;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};

        boolean b = isEquals(arr, arr1);
        System.out.println(b);

        /*
         *  int[] array = new int[number];
         *   System.out.println(getArray(array));
         */
        Random random = new Random();

        int[] arr2 = new int[number];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(20);
            ;
        }
        int max = getMax(arr2);
        System.out.println("max = " + max);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            return max;
        }
        return -1;
    }
    public static int[] getArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 10 + " ");
        }
        return array;
    }

    public static boolean isEquals(int[] array, int[] array1) {
        if (array.length != array1.length) {
            System.out.println("arrays length is not equals");
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array[i] != array1[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
