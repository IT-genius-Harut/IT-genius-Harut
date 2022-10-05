package class_work;

import intro_java.class_4_statics_and_strings.Utils;

import javax.print.attribute.IntegerSyntax;
import java.util.Random;

public class class_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayOne = new int[100];
        int[] arrayTow = new int[100];
        int[] arrayThree = new int[100];
        /*printIntArray(arrayOne);
        printIntArray(arrayTow);
        printIntArray(arrayThree);
        fillArrayWithRandomNumbers(arrayOne);
        fillArrayWithRandomNumbers(arrayTow);
        fillArrayWithRandomNumbers(arrayThree);
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(100);
            System.out.print(arrayOne[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayTow.length; i++) {
            arrayTow[i] = random.nextInt( 100);
            System.out.print(arrayTow[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayThree.length; i++) {
            arrayThree[i] = random.nextInt(100);
            System.out.print(arrayThree[i] + " ");
        }
        System.out.println();*/
        int[] arr = new int[10];
        fillArrayWithRandomNumbers(arr);
        printIntArray(arr);
        arr = addElement(arr);
        arr = addElement(arr);
        printIntArray(arr);
    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

    }

    public static int[] addElement(int[] array) {
        int[] largeArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            largeArray[i] = array[i];
        }
        array = largeArray;
        return array;
    }
}
