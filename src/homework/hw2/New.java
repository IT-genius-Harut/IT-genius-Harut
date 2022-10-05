package homework.hw2;

import java.util.Random;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Print the size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int pos, neg;
        boolean ifElse=true;

        System.out.println("Print the element of Array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "]=  " + arr[i]);
        }
        pos=arr[0]*(-1);
        for (int i = 0; i < arr.length; i+=2) {
            if(arr[i]>0&&arr[i+1]<0) ifElse=true;
            else ifElse=false;
        }
        System.out.println(ifElse);
    }
}
