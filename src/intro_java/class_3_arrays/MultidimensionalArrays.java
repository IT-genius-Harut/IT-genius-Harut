package intro_java.class_3_arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        // 2D array with values
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int[] ints : array) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        // 2D array of integers
        int[][] myArray = new int[3][4];
        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[0][2] = 3;
        myArray[0][3] = 4;
        myArray[1][0] = 5;
        myArray[1][1] = 6;
        myArray[1][2] = 7;
        myArray[1][3] = 8;
        myArray[2][0] = 9;
        myArray[2][1] = 10;
        myArray[2][2] = 11;
        myArray[2][3] = 12;

        for (int[] ints : myArray) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        // 2D array of several sizes
        int[][] myArray2 = new int[3][];
        myArray2[0] = new int[4];
        myArray2[1] = new int[5];
        myArray2[2] = new int[6];
        for (int i = 0; i < myArray2.length; i++) {
            for (int j = 0; j < myArray2[i].length; j++) {
                myArray2[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] ints : myArray2) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
