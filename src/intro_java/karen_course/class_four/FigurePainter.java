package intro_java.karen_course.class_four;

public class FigurePainter {
    public void figureOne(int a, char c) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public void figureTow(int a, char c) {
        for (int i = 0; i < a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
