package intro_java.courseRepetition.class_7_exam;

public class ExamExample {
    public static void main(String[] args) {
        int[] array = {8, 7, 3, 4, 98, 1};
        //this should print[8, 7, 3, 4, 98, 1]
        printArray(array);
        //print triangle for [*]
        int hight = 5;
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
        //print triangle for numbers
        for (int i = 1; i <= hight; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        //print square matrix for numbers
        for (int i = 1; i < hight; i++) {
            for (int j = 0; j < hight; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //find max element an array
        System.out.println("max = " + getMax(array));
        //find sum of element an array
        System.out.println("sum = " + sum(array));
        //find avenge
        System.out.println("avenge = " + getAvenge(array));
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else if (array[i] != array.length - 1) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
    }
    public static int getMax(int[] array){
        int number = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number){
                number = array[i];
            }
        }
        return number;
    }
    public static int sum(int[] array){
        int tmp = 0;
        for (int el : array) {
            tmp += el;
        }
        return tmp;
    }
    public static int getAvenge(int[] array){
        int sum = 0;
       for (int avenge : array){
           sum += avenge;
       }
        return sum / array.length;
    }
}
