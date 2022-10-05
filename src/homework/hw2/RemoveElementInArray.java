package homework.hw2;

public class RemoveElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 3, 3, -10, 24, 5, -52, 69, 5};
        System.out.println("Array before removing");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array after removing");
        array = remove(array);

    }

    public static int[] remove(int[] array) {
        int[] tmp = new int[array.length - 1];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }
}
