package intro_java.homeworks.hw2;

public class MatrixSum {
    public static void main(String[] args) {
        int rows = 4, columns = 5;
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        // populate both matrices with values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = (int) (Math.random() * rows + Math.random() * columns); // random number between 0 and rows + columns
                matrix2[i][j] = (int) (Math.random() * rows - Math.random() * columns); // random number between 0 and rows - columns
            }
        }
        int[][] sum = matrixSum(matrix1, matrix2); // sum of the two matrices
        HW2Utils.printMatrix(matrix1);
        System.out.println();
        HW2Utils.printMatrix(matrix2);
        System.out.println();
        HW2Utils.printMatrix(sum);
    }

    public static int[][] matrixSum(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length]; // create a new matrix with the same dimensions as A
        if (A.length != B.length || A[0].length != B[0].length) {
            System.out.println("Matrices must be the same size");
            return result; // return an empty matrix of the same dimensions as A
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] + B[i][j]; // add the values of the two matrices together and store them in the result matrix
            }
        }
        return result;
    }
}
