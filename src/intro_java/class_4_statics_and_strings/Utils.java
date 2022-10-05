package intro_java.class_4_statics_and_strings;

/**
 * Util class for static methods to print arrays of different types.
 */
public class Utils {
    /**
     * prints out the provided array of ints with spaces in between each element
     * @param arr an array of ints
     */
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * prints out the provided array of chars surrounded by square brackets
     * @param arr an array of chars
     */
    public static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print("[" + c + "]");
        }
        System.out.println();
    }

    /**
     * prints out the provided array of strings surrounded by square brackets
     * @param arr an array of Strings
     */
    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print("[" + s + "]");
        }
        System.out.println();
    }

    /**
     * an overloaded method with 2 arguments
     * @param ints an array of ints
     * @param chars an array of chars
     */
    public static void printArray(int[] ints, char[] chars) {
        System.out.println("First arg is int array, second is chars");
    }

    /**
     * another overloaded method with 2 arguments but with a different order
     * @param chars an array of chars
     * @param ints an array of ints
     */
    public static void printArray(char[] chars, int[] ints) {
        System.out.println("First arg is char array, second is ints");
    }

    /**
     * prints out the provided array of booleans with a colon (:) and a space in between each element
     * @param booleans an array of booleans
     */
    public static void printArray(boolean[] booleans) {
        for (boolean b : booleans) {
            System.out.print(b + ": ");
        }
        System.out.println();
    }

    /**
     * prints out the provided 2D array of ints as a matrix
     * @param matrix a 2D array of ints
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
