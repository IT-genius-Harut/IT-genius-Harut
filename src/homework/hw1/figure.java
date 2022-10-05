package homework.hw1;

import java.util.Scanner;

public class figure {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("pleas input triangle height");
        int n = scanner.nextInt();

        /*
         *    *
         *    * *
         *    * * *
         *    * * * *
         *    * * * * *
         *
         */

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        /*
         *        *
         *       * *
         *      * * *
         *     * * * *
         *    * * * * *
         *
         */

        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        /*
         *        *
         *       * *
         *      * * *
         *     * * * *
         *      * * *
         *       * *
         *        *
         *
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        /*
         *    * * * * *
         *    * * * * *
         *    * * * * *
         *    * * * * *
         *
         */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        /*
         *    * * * * *
         *    *       *
         *    *       *
         *    * * * * *
         *
         */

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
