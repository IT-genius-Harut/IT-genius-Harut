package intro_java.homeworks.hw2;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int[] second = {1, 2, 3};
        int[] third = {1, 2, 4};
        System.out.println("First and second array equality check: " + areEqual(first, second)); // this should return true
        System.out.println("First and third array equality check: " + areEqual(first, third)); // this should return false
    }

    public static boolean areEqual(int[] first, int[] second) {
        if (first.length != second.length) { // if the lengths of the arrays are not equal
            System.out.println("not equal due to different lengths");
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) { // if the two elements are not the same at the same index in the arrays (i.e. the two arrays are not equal)
                System.out.println("not equal because at index: " + i +
                        " first array's value is: " + first[i] +
                        " second array's value is: " + second[i]);
                return false;
            }
        }
        // if all elements are equal, return true
        return true;
    }
}
