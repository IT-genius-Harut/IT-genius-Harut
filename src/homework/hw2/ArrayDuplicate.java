package homework.hw2;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 3, 3, -10, 24, 69, 5, -52, 69, 0};
         duplicateArray(array);

    }
    public static void duplicateArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    System.out.println("duplicate is: " + array[i]);
                }
            }
        }
    }
}
