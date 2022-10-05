package intro_java.courseRepetition.class_4_example;

public class Utils {
    public static void printIntsArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void printCharsArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void printBooleansArray(boolean[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void printIntsAndCharsArray(int[] array, char[] array2){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
    public static void printStringArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int SECONDS_IN_DAY = 60 * 60 * 24;

    public static int SECOND_IN_MINUTE = 60;

    public static int datToSecond(int day){
        return day * SECONDS_IN_DAY;
    }
}
