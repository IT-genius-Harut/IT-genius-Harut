package intro_java.homeworks.hw2;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int[] copy = new int[arr.length];
        HW2Utils.printArray(copy); // this should output 0 0 0 0 0 0
        copy = copyArray(arr);
        // this should output 1 2 3 5 6 7
        HW2Utils.printArray(copy); // this should output 1 2 3 5 6 7
    }

    public static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length]; // create a new array of the same length as arr
        for (int i = 0; i < arr.length; i++) { // iterate over arr
            copy[i] = arr[i]; // copy the element from arr to copy
        }
        return copy; // return copy
    }

}
