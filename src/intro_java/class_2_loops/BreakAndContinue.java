package intro_java.class_2_loops;

public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Continue in while loop");
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Break in while loop");
        i = 0;
        while (i < 10) {
            if (i == 5) {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Continue in for loop");
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.println(j);
        }
        System.out.println("Break in for loop");
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break;
            }
            System.out.println(j);
        }
    }
}
