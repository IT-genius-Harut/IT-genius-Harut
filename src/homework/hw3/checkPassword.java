package homework.hw3;

import java.util.Locale;
import java.util.Scanner;

public class checkPassword {
    public static void main(String[] args) {
        System.out.println("please input password");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        if (isValidPassword(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
            
        }
    }

    public static boolean isValidPassword(String password) {

        if (password.length() < 10) {
            return false;
        }
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (isNumeric(ch)) {
                numCount++;
            }
            else if (isLetter(ch)) {
                charCount++;
            }
            else return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean isNumeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}
