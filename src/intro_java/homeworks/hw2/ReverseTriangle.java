package intro_java.homeworks.hw2;

public class ReverseTriangle {
    public static void main(String[] args) {
        int height = 5;
        for (int i = height; i >= 0; i--) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
