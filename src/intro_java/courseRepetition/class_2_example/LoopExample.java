package intro_java.courseRepetition.class_2_example;

public class LoopExample {
    public static void main(String[] args) {
        int a = 11;
        int b = 5;
        System.out.println("Print 0 to 10 numbers use for loop");
        for (int i = 0; i < a; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Print 0 to 10 numbers use while loop");
        int number = 0;
        while (number < a) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        System.out.println("break and continue in for loop");
        for (int i = 0; i < a; i++) {
            if (i == 5) {
                continue;
            } else {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            if (i == 5) {
                break;
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("print even numbers 1 to 10");
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Print odd numbers 0 to 10");
        for (int i = 0; i < a; i++) {
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("Print triangle in $");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        System.out.println("Print triangle in numbers tray 1");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Print triangle in numbers tray 2 ");
        for (int i = 1; i < b + 1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


