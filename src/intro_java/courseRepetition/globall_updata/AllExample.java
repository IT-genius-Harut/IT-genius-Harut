package intro_java.courseRepetition.globall_updata;

public class AllExample {
    public static void main(String[] args) {
        int[] arr = {1, 89, -9, -8, 9, 25, 4};
        System.out.println("Max = " + findMaxElement(arr));
        System.out.println("Min = " + findMinElement(arr));
        System.out.println("Array before sorted");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array after sorted");
        sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("find number in array");
        int number = 9;
        System.out.println(number + " is situated in " + findNumber(arr, number) + " index");

        // print 1 to 10 numbers ued for loop
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // print 1 to 10 numbers ued while loop
        int a = 0;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        // continue in for
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // break in for loop
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // continue in while loop
        while (a <= 10) {
            if (a == 5) {
                continue;
            }
            System.out.print(a + " ");
        }
        System.out.println();
        // break in while loop
        while (a <= 10) {
            if (a == 5) {
                break;
            }
            System.out.print(a + " ");
        }


        int[] myArray = {1, 2, 3, 4, 5};
        // print array element with 2 types
        // type one
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        // type tow
        System.out.println();
        System.out.print(myArray[0] + " ");
        System.out.print(myArray[1] + " ");
        System.out.print(myArray[2] + " ");
        System.out.print(myArray[3] + " ");
        System.out.println(myArray[4]);

        boolean[] booleans = {true, true, false, true};
        for (boolean b : booleans) {
            System.out.print(b + " ");
        }
        System.out.println();
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        for (char c : chars) {
            System.out.print(c);
        }
        System.out.println();
        char[] chars1 = new char[5];
        for (char c : chars1) {
            System.out.print(c);
        }
        int value = 5;
        for (int i = 0; i <= 10; i++) {
            System.out.println(value + " x " + i + " = " + value * i);
        }
        // print this [1, 2, 3, 4, 5]
        int deep = 5;
        System.out.print("[");
        for (int i = 1; i <= deep; i++) {
            if (i == deep) {
                System.out.print(i);
            } else System.out.print(i + ", ");
        }
        System.out.println("]");

        int[] poxos = {1, 2, 3, 4, 5, 6};
        System.out.println("sum = " + sum(poxos));
        System.out.println("sumAverage = " + sumAverage(poxos));
        // we must  to 5 number sum and average
        int[] nweArray = {2, 7, 6, 8, 5, 3, 0, 9, 4, 1};
        System.out.println(sumOfNewArray(nweArray, 5));
        System.out.println(sumOfNewArrayAverage(poxos, 5));
    }

    public static int sumOfNewArray(int[] array, int number) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < number) {
                sum += array[i];
            }
        }
        return sum;
    }
    public static int sumOfNewArrayAverage(int[] array, int number) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < number) {
                sum += array[i];
            }
        }
        return sum / array.length;
    }

    public static int sum(int[] array) {
        int sum1 = 0;
        for (int i : array) {
            sum1 += i;
        }
        return sum1;
    }

    public static float sumAverage(int[] array) {
        int sum1 = 0;
        for (int i : array) {
            sum1 += i;
        }
        return sum1 / array.length;
    }

    public static int findMaxElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMinElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void sortArray(int[] array) {
        int tmp = 0;
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

    public static int findNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return i;
            }
        }
        return -1;
    }
}