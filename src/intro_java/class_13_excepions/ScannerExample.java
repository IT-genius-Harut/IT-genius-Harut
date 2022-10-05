package intro_java.class_13_excepions;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        String userName;
        String userSurname;
        long phoneNumber;
        System.out.println("Enter username");
        userName = scanner.nextLine();
        System.out.println("Enter user surname");
        userSurname = scanner.nextLine();
        System.out.println("Enter phone number");
        phoneNumber = scanner.nextLong();*/

        Scanner scanner1 = new Scanner(System.in);

        String name;
        int age;
        double salary;

        System.out.println("Enter your name, age, salary");
        name = scanner1.nextLine();
        age = scanner1.nextInt();
        salary = scanner1.nextDouble();

        System.out.println("User name is: " + name);
        System.out.println("age is:" + age);
        System.out.println("salary is: " + salary);

    }
}
