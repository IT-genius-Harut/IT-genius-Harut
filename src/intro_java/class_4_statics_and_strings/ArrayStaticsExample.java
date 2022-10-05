package intro_java.class_4_statics_and_strings;

public class ArrayStaticsExample {
    public static void main(String[] args) {
        char[] chars = {'1', 'c'};
        int[] ints = {1, 2, 4};
        boolean[] booleans = {true, false, true};
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6}};

        // calling a static method from Utils class instead of defining it in each class
        System.out.println("Printing chars array:");
        Utils.printArray(chars);
        System.out.println("Printing int array:");
        Utils.printArray(ints);
        System.out.println("Printing booleans array:");
        Utils.printArray(booleans);
        System.out.println("Calling printArray with 2 arguments: chars and ints");
        Utils.printArray(chars, ints);
        System.out.println("Calling printArray with 2 arguments: ints and chars");
        Utils.printArray(ints, chars);
        System.out.println("Printing matrix:");
        Utils.printMatrix(matrix);
    }
}
