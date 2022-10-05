package intro_java.homeworks.hw2;

public class MinOfArray {
    public static void main(String[] args) {
        int[] arrMin = {5, 4, 6, 7, 2, 6, -1}; // create an array of ints
        int min = min(arrMin); // this should return -1
        System.out.println("min: " + min);
    }

    public static int min(int[] arr) {
        int minValue = arr[0]; // assume the first element is the min
        for (int el : arr) { // iterate over the array
            minValue = Math.min(el, minValue); // if the current element is less than the minValue, set minValue to the current element
        }
        /*
        same can be achieved with the following loop:

        for (int i = 0; i < arr.length; i++) {
            minValue = Math.min(minValue, arr[i]);
        }
        */
        return minValue;
    }
}
