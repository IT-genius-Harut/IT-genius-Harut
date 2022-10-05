package intro_java.home_work_example;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setWidth(10);
        rectangle.setHeight(3);
        rectangle.setColour("red");

        System.out.println(rectangle);
        System.out.println("rectangle area = " + rectangle.getArea(rectangle.getWidth(), rectangle.getHeight()));
        System.out.println("rectangle perimiter = " +rectangle.getPerimiter(rectangle.getWidth(), rectangle.getHeight()));
    }
}
