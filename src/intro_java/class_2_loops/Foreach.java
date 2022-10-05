package intro_java.class_2_loops;

public class Foreach {
    public static void main(String[] args) {
        int[] arr = {4, 8, 6, 25, 18, 2, 6};
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            System.out.print((value * 2) + " ");
        }
        System.out.println();
        System.out.println("Print an array element * 3 using a foreach loop");
        for(int value1 : arr){
            System.out.print((value1 * 3) + " ");
        }
    }
}
