package homework.hw3;

import java.util.Scanner;

public class countVowelsInString {
    public static void main(String[] args) {
        System.out.println("please input your sentence");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = vowelsInString(str);
        System.out.println("Total no of vowels in string are: " + count );

    }

    public static int vowelsInString(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
