package intro_java;

public class HomeWork {
    public static void main(String[] args) {
        int[] myArray = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] copy = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        copy = copyArray(myArray);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();
        System.out.println("min element fo is array = " + getMin(myArray));

        int[] arrayOne = {1, 2, 3};
        int[] arrayTow = {1, 2, 3};
        int[] arrayThree = {1, 2, 4};
       boolean b5 = areEqual(arrayOne, arrayTow);
        System.out.println(b5);
        boolean b = areEqual(arrayOne, arrayThree);
        System.out.println(b);
        int[] arr = {-1, 2, 5, 7, 6, 8, 4, 3, 3, 1};
        int target = 6;
        pairsOfIntegers(arr, target);

        int x = 5;
        int y = 7;
        System.out.println(x > y);

        System.out.println();



    }
    public static void pairsOfIntegers(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    if (i != j){
                        System.out.println(arr[i] + " + " + arr[i] + " = " + target);
                    }
                }
            }
        }
    }

    public static boolean areEqual(int[] array1, int[] array2){
            if (array1.length != array2.length){
                System.out.println("arrays length is not equals");
                return false;
            }
        for (int i = 0; i < array1.length; i++) {
                if(array1[i] != array2[i]){
                    System.out.println("arrays element is not equals");
                    return false;
            }
        }
        return true;
    }
    public static int[] copyArray(int[] array){
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
                copy[i] = array[i];
        }
        return array;
    }


    public static int getMin(int[] arr) {
        int tmp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < tmp) {
                tmp = arr[i];
            }
        }
        return tmp;
    }
}
