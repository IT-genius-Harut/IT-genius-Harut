package class_work;

public class ArraysExercise {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 3, 3, -10, 24, 5, -52, 69, 0};
        int[] arrayTow = {-5, 1, -2, 3, -4, 5, -6, 7, -8};
        int number = -52;
        //task 1
        int sum = arraySum(array);
        System.out.println("array sum = " + sum);
        //task 2
        int average = arrayAverage(array);
        System.out.println("array average = " + average);
        //task 3
        int index = findIndexByNumber(array, number);
        System.out.println("arrays " + number + " element" + " = " + index + " index ");
        //task 4
        int max = getMax(array);
        System.out.println("arrays max = " + max);
        int min = getMin(array);
        System.out.println("arrays min = " + min);
        //task 5
        System.out.print("original array = {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");
        copyArray(array);
        System.out.print("copy array = {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");
        //task 6

        reverseArray(array);
        System.out.print("reverse array = {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");
        //task 7
        sortArray(array);
        System.out.println("arrays second smallest element = " + array[1]);
        //task 8
        int duplicate = duplicateArray(array);
        System.out.println("duplicate is: " + duplicate);
        //task 9
        int target = 10;
        towSum(array, target);
        //task 10
        boolean b = positiveAndNegative(arrayTow);
        System.out.println(b);
        //task 11


        int element = 1;
        addElementInArray(array, element);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] addElementInArray(int[] array, int element) {
        int[] tmp = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        tmp[tmp.length - 1] = element;
        array = tmp;
        return array;
    }

    public static boolean positiveAndNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[++i] < 0) {
                return true;
            } else if (array[i] < 0 && array[++i] > 0) {
                return true;
            }
        }
        return false;
    }

    public static void towSum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(array[i] + " + " + array[j] + " = " + target);
                }
            }
        }
    }

    public static int duplicateArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    return array[i];
                }
            }
        }
        return -1;
    }

    public static int[] copyArray(int[] array) {
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < copyArray.length; j++) {
                copyArray[i] = array[i];
            }
        }
        return copyArray;
    }

    public static void reverseArray(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void sortArray(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int arrayAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int findIndexByNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
