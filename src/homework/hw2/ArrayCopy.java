package homework.hw2;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 3, 3, -10, 24, 5, -52, 69, 0};
        System.out.print("orig array = {");
        for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
        }
        System.out.println("}");
        copyArray(array);
        System.out.print("copy array = {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");
    }
    public static int[] copyArray(int[] array) {
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < copyArray.length; j++) {
                copyArray[i] = array[i];
            }
        }
        return copyArray;
    }
}
