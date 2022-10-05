package homework.hw2;

public class ArrayTowSum {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 3, 3, -10, 24, 5, -52, 69, 0};
        int target = 10;
        towSum(array, target);
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
}
