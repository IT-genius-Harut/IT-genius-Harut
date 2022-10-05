package intro_java.courseRepetition.class_1_example;

public class MathExample {
    public static void main(String[] args) {
        System.out.println("Math pi = " + Math.PI);
        System.out.println("Math e = " + Math.E);
        System.out.println("Math min = " + Math.min(5, 24));
        System.out.println("Math max = " + Math.max(22, 23));
        System.out.println("Math pow = " + Math.pow(4, 6));
        System.out.println("Math abs = " + Math.abs(-173));
        System.out.println("Math flour = " + Math.floor(1.2348));
        System.out.println("Math ceil" + Math.ceil(1.99999));
        System.out.println("Math round = " + Math.round(1.5));
        System.out.println("Math sqrt = " + Math.sqrt(1024));
        System.out.println("Math random = " + Math.random());
        System.out.println("Random number is " + randomNumberInRang(15, 98));
        System.out.println("circle arena = " + circleArea(3));
        System.out.println("circle circumference = " + circleCircumference(8));
        System.out.println("rectangle arena = " + rectangleArea(14, 6));
        System.out.println("rectangle circumference = " + rectangleCircumference(5, 23));

    }

    public static int randomNumberInRang(int start, int end) {
        if (start > end) {
            return -1;
        } else {
            return (int) (Math.random() * ((end - start) + 1));
        }
    }

    public static double circleArea(int radius) {
        return 2 * Math.PI * (radius * radius);
    }

    public static double circleCircumference(int radius) {
        return 2 * Math.PI * radius;
    }

    public static int rectangleArea(int a, int b) {
        return a * b;
    }

    public static int rectangleCircumference(int a, int b) {
        return 2 * (a + b);
    }
}
