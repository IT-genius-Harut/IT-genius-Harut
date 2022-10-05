package intro_java.class_7_exam;

public class ExamExamples {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 6, 8, 11, 209},
                {4, 20, 7, 13}, // max on average
                {-1, 8, 6, 7}
        };
        int[] maxOnAverage = findMaxOnAverage(matrix);
        printArray(maxOnAverage);


        int[] ints = {2, 5, 3, 5, 7, 3, 5, 7, 4};
        int sum = sumOfElementsLessThan(ints, 5);
        System.out.println(sum);

        boolean expr = !(true && !(false || !!true));
//        !!true -> true
//        false || true -> true
//        !true -> false
//        true && false -> false
//        !false -> true

//        for (int i = 1; i <= 500; i++) {
//            if (isPerfect(i)) {
//                System.out.println(i + " is a perfect number");
//            }
//        }
//        System.out.println(isBetween(0, 19, 25));
        String[] words = getWordsFromString("Lorem ipsum jha sdja dja sjh ads");
        printStringArray(words);

//        56187, 4 => 8
//        System.out.println(getDigit(56187, 2));
//        printSquare(5, 7);
//        printTriangle(15);

       int[] ints2 = {2, 5, 3, 5, 7, 3, 5, 7, 4};
        printArray(ints2);
        int[] reversed = reverseOrder(ints2);
        printArray(reversed);
        int[][] matrix2 = {
                {2, 6, 8, 11, 209},
                {4, 20, 7, 13}, // max on average
                {-1, 8, 6, 7, 34, 55, 6}
        };
        System.out.println(matrixAverage(matrix2));
        String a = "A";
        String b = a + 'a';
        System.out.println(a);
    }

    public static float matrixAverage(int[][] matrix) {
        int elementsCount = 0;
        float sum = 0;
        for (int[] row : matrix) {
            for (int el : row) {
                elementsCount++;
                sum += el;
            }
        }
        return sum / elementsCount;
    }

    public static int[] reverseOrder(int[] arr) {
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[arr.length - 1 - i] = arr[i];
        }
        return tmp;
    }

    public static void printTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }


    public static void printSquare(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }


    public static int getDigit(int number, int k) {
        int numberCpy = number;
        int digits = 0;
        while (numberCpy != 0) {
            numberCpy /= 10;
            digits++;
        }
        if (k > digits) {
            return -1;
        }
        int kFromEnd = digits - k;
        for (int i = 0; i < kFromEnd; i++) {
            number /= 10;
        }
        return number % 10;
    }

    public static String[] getWordsFromString(String input) {
        return input.split(" ");
    }

    public static boolean isBetween(int start, int end, int target) {
//        if (start > end) return false;
        /*if (start < target && target < end) {
            return true;
        } else {
            return false;
        }*/
        return start < target && target < end;
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                sum += i;
            }
            if (sum > number) {
                return false;
            }
        }
        return sum == number;
        /*if (sum == number) {
            return true;
        } else {
            return false;
        }*/
    }

    public static int sumOfElementsLessThan(int[] arr, int target) {
        int sum = 0;
        for (int el : arr) {
            if (el < target) {
                sum += el;
            }
        }
        return sum;
    }


    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) { // last index
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printStringArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) { // last index
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static int[] findMaxOnAverage(int[][] matrix) {
        float[] averageValues = new float[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            averageValues[i] = average(row);
        }
        int maxIndex = getMax(averageValues);
        return matrix[maxIndex];
    }

    public static int getMax(float[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] < arr[i]) {
                index = i;
            }
        }
        return index;
    }

    public static float average(int[] arr) {
       float averageValue = 0;
       for (int el : arr) {
           averageValue += el;
       }
       return averageValue / arr.length;
    }
}
