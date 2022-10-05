package homework.hw2;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 3, 3, -10, 24, 5, -52, 69, 0};
        int element = 1;
        array = addElementInArray(array, element);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] addElementInArray(int[] array, int element) {
        int[] tmp = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        tmp[tmp.length - 1] = element;
        array = tmp;
        return array;
    }
}