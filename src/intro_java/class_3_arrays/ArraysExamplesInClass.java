package intro_java.class_3_arrays;

public class ArraysExamplesInClass {
    public static void main(String[] args) {
        // examples and exercises
        int side = 5;
        // creating a square matrix
        int[][] myArr = new int[side][side];

        // setting the main diagonal to 1s with 2 nested loops
        for (int i = 0; i < myArr.length; i++) { // iterating over all rows
            for (int j = 0; j < myArr[i].length; j++) { // iterating over all columns
                if (i == j) { // checking if the row and column are the same
                    myArr[i][j] = 1;
                }
            }
        }
        printMatrix(myArr);
        System.out.println();
        // reset the values
        myArr = new int[side][side];
        // setting the main diagonal to 1s with 1 loop
        for (int i = 0; i < myArr.length; i++) { // iterating over the number of rows/columns
            myArr[i][i] = 1;
        }
        printMatrix(myArr);
        System.out.println();
        // reset the values
        myArr = new int[side][side];
        // setting the secondary diagonal to 1s with 2 nested loops
        for (int i = 0; i < myArr.length; i++) { // iterating over rows
            for (int j = 0; j < myArr[i].length; j++) { // iterating over columns
                if (i + j == myArr.length - 1) { // checking if the sum of row and column is equal to the side size (-1 because the enumeration starts with 0)
                    myArr[i][j] = 1;
                }
            }
        }
        printMatrix(myArr);
        System.out.println();
        // reset the values
        myArr = new int[side][side];
        // setting both main and secondary diagonals to 1
        for (int i = 0; i < myArr.length; i++) { // iterating over the number of rows/columns
            myArr[i][i] = 1; // main diagonal
            myArr[i][myArr.length - 1 - i] = 1; // secondary diagonal
        }
        printMatrix(myArr);
        System.out.println();

        int[] arr = {1, 2, 7, 5, 7, 3, 1, 6};
        printArray(arr);
        int max = getMax(arr);
        System.out.println("Array max is: " + max);
        System.out.println("Array avg is: " + getAvg(arr));
        char[] cArr = {'h', 'e', 'l', 'o'};
        char value = 's';
        int index = getIndex(cArr, value);
        for (char c : cArr) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Index for char: " + value + " is: " + index);

        System.out.println("Original array");
        printArray(arr);
        int[] reversedArr = reverse(arr);
        System.out.println("reversed array using new array");
        printArray(reversedArr);

        System.out.println("reversed array without copying");
        int[] withoutCopy = reverseWithoutCopy(arr);
        printArray(withoutCopy);
        int[] first = {2, 3, 6, 7, 12, 0};
        int[] second = {6, 12, 3, 5, 9, 0};
        int[] commons = commons(first, second);

        System.out.println("First array");
        printArray(first);
        System.out.println("Second array");
        printArray(second);
        System.out.println("Commons");
        printArray(commons);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * print an array in human-readable format
     *
     * @param arr input array of ints
     */
    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    /**
     * max value of array elements
     *
     * @param arr int array
     * @return max value of the array
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            /*if (i > max) {
                max = i;
            }*/
            max = Math.max(max, i);
        }
        return max;
    }

    /**
     * get the arithmetic mean of all elements in an array
     *
     * @param arr int array
     * @return average value of the array
     */
    public static float getAvg(int[] arr) {
        float sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    /**
     * reverse functional of arrays: get the index of the value provided no duplicates are present
     *
     * @param arr   char array
     * @param value value which is needed to find index for
     * @return index of the value in array. If not found returns -1
     */
    public static int getIndex(char[] arr, char value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * reversing the given array by copying the values in reverse order to another array
     *
     * @param arr an int array to be reversed
     * @return an int array of the same size as arr with reversed order
     */
    public static int[] reverse(int[] arr) {
        // creating a new array of same size
        int[] retValue = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // inserting in reversed order
            retValue[i] = arr[arr.length - 1 - i];
        }
        return retValue;
    }

    /**
     * reversing the given array by swapping the elements in the it
     *
     * @param arr an int array to be reversed
     * @return an int array of same size as arr with reversed order without using another array
     */
    public static int[] reverseWithoutCopy(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            // swap i-th and arr.length - 1 - i-th elements
            tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        return arr;
    }

    /**
     * finding the intersection of 2 given arrays
     *
     * @param first  first int array with no duplicated values
     * @param second second int array with no duplicated values
     * @return intersection array of first and second
     */
    // {2, 3, 5, 6, 7}
    // {3, 2, 4, 7}
    // {2, 3, 7, 0}
    public static int[] commons(int[] first, int[] second) {
        // creating a tmp array of the biggest size of both provided arrays
        int[] tmp = new int[Math.max(first.length, second.length)];
        int index = 0;
        for (int f : first) {
            for (int s : second) {
                if (f == s) {
                    tmp[index] = f;
                    index++;
                    break;
                }
            }
        }
        // creating a correct size array to avoid redundant space
        int[] commons = new int[index];
        // copy
        for (int i = 0; i < index; i++) {
            commons[i] = tmp[i];
        }
        return commons;
    }


}
