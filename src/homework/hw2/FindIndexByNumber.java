package homework.hw2;

public class FindIndexByNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 3, 3, -10, 24, 5, -52, 69, 0};
        int number = -52;
        int index = findIndexByNumber(array, number);
        System.out.println("arrays " + number + " element" + " = " + index + " index ");
    }
    public static int findIndexByNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
