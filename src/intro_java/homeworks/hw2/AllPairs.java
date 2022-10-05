package intro_java.homeworks.hw2;

public class AllPairs {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 5, 7, 6, 8, 4, 3, 3, 1};
        int target = 6;
        printAllPairs(arr, target);
//         this should output
//        -1 + 7 = 6
//        2 + 4 = 6
//        5 + 1 = 6
//        7 + -1 = 6
//        4 + 2 = 6
//        3 + 3 = 6
//        3 + 3 = 6
//        1 + 5 = 6
    }

    public static void printAllPairs(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) { // first time iterating over arr
            for (int j = 0; j < arr.length; j++) { // second time iterating over arr
                if (arr[i] + arr[j] == target) { // if the sum of the two elements is equal to target
                    if (i != j) { // if the two elements are not the same
                        System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    }
                }
            }
        }
    }
}
