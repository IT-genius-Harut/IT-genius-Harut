package intro_java.karen_course.class_six;

public class Main {
    public static void main(String[] args) {


        Figure figure = new Triangle(3, 4);
        Figure figure1 = new Triangle(6, 8);
        Figure figure2 = new Triangle(5, 12);

        Figure figure3 = new Rectangle(10, 20);
        Figure figure4 = new Rectangle(3, 8);

        System.out.println(figure);
        System.out.println(figure1);
        System.out.println(figure2);
        System.out.println(figure3);
        System.out.println(figure4);

        System.out.println("figure 2 perimeter = " + figure2.getPerimeter());
        System.out.println("figure 3 area = " + figure3.getArea());
        System.out.println("figure 4 perimeter = " + figure4.getPerimeter());
    }
}
