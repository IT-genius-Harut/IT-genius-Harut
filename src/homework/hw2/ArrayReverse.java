package homework.hw2;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 3, -10, 24, -52, 69, 0};
        System.out.print("original array = {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");
        reverseArray(array);
        System.out.print("reverse array = {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");
    }
    public static void reverseArray(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = array.length - 1; j > array.length / 2; j--) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
    }
}
