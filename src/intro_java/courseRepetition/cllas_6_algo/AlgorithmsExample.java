package intro_java.courseRepetition.cllas_6_algo;

public class AlgorithmsExample {
    public static void main(String[] args) {
        int[] array = {4, 8, 6, 28, 49, 7, 3, 7, 80, 4, -1};
        int value = 6;
        int index = sequentialSearch(array, value);
        System.out.println("Index for value " + value + " is: " + index);
        sortArray(array);
        System.out.println("Sort array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int valued = 7;
        int binarySearch = binarySearch(array, valued);
        System.out.println("index for value " + valued + " is: " + binarySearch);
    }

    public static int sequentialSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public static void sortArray(int[] array){
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    public static int binarySearch(int[] array, int value, int start, int end){
        int currentIndex = (start + end) / 2;
        if (array[currentIndex] > value){
            return binarySearch(array, value, currentIndex, end);
        } else if (array[currentIndex] < value) {
            return binarySearch(array, value, currentIndex, start );
        }else
            return currentIndex;
    }
    public static int  binarySearch(int[] array, int value){
        return binarySearch(array, value, 0, array.length - 1);
    }
}
