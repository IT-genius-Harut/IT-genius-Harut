package homework.hw2;

public class PositiveAndNegative {
    public static void main(String[] args) {
        int[] arrayTow = {-5, 1, -2, 3, -4, 5, -6, 7, -8};
        boolean b = positiveAndNegative(arrayTow);
        System.out.println(b);
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
}
