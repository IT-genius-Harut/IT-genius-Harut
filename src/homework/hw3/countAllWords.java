package homework.hw3;

import java.util.Scanner;

public class countAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleas input your sentence");
        String str = scanner.nextLine();
        int count = countAllWorlds(str);
        System.out.println("count all world is: " + count);
    }

    public static int countAllWorlds(String string) {
        int count = 1;
        int in = string.length();
        for (int i = 0; i < in; i++) {
            if (string.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
