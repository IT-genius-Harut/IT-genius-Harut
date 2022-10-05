package homework.hw2;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 3, 3, -10, 24, 5, -52, 69, 0};
        int max = getMax(array);
        System.out.println("arrays max = " + max);
        int min = getMin(array);
        System.out.println("arrays min = " + min);
    }
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
