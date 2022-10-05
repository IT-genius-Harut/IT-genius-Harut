package intro_java.courseRepetition.class_3_example;

import intro_java.class_4_statics_and_strings.Utils;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 9, 11, 35, 58, 69};
        System.out.println("First element an array [" + arr[0] + "]");
        System.out.println("Last element an array [" + arr[arr.length - 1] + "]");

        boolean[] bool = {true, true, false, true};
        System.out.println("All the element an bool");
        for (boolean b : bool) {
            System.out.print(b + " ");
        }
        System.out.println();
        char[] charArray = new char[5];
        System.out.println("default char array element");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println("Initializing the array: ");
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println("First element " + array[0]);
        System.out.println("Second element " + array[1]);
        System.out.println("Third element " + array[2]);
        System.out.println("Forth element " + array[3]);
        System.out.println("Firth element " + array[4]);

        System.out.println("2D array with value");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int[] ints : matrix) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Initializing the array: ");
        int[][] matrix2 = new int[3][3];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[0][2] = 3;
        matrix2[1][0] = 4;
        matrix2[1][1] = 5;
        matrix2[1][2] = 6;
        matrix2[2][0] = 7;
        matrix2[2][1] = 8;
        matrix2[2][2] = 9;
        for (int[] ints : matrix2) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        int[] arrayExample = {2, 25, 9, 17, 38, 85, 4};
        System.out.println("Max element = " + findMAxElement(arrayExample));
        System.out.println("The array element sum = " + arraySum(arrayExample));
        int number = 36;
        System.out.println(number + " is found in index " + findIndexByNumber(arrayExample, number));
        System.out.println("Before sorting ");
        Utils.printArray(arrayExample);
        System.out.println("After sorting ");
        sortArray(arrayExample);
        Utils.printArray(arrayExample);
    }

    public static int findMAxElement(int[] array) {
        int number = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                number = array[i];
            }
        }
        return number;
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int findIndexByNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                return i;
            }
        }
        return -1;
    }
    public static void sortArray(int[] array){
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
