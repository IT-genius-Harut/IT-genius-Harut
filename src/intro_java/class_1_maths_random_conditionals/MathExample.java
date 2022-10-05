package intro_java.class_1_maths_random_conditionals;

public class MathExample {
    public static void main(String[] args) {
        // constants
        System.out.println("Math E: " + Math.E);
        System.out.println("Math PI: " + Math.PI);
        // functions
        System.out.println("Math round: " + Math.round(1.5f));
        System.out.println("Math ceil: " + Math.ceil(1.01f));
        System.out.println("Math floor: " + Math.floor(1.99f));
        System.out.println("Math abs: " + Math.abs(-1.99f));
        System.out.println("Math sqrt: " + Math.sqrt(9));
        System.out.println("Math pow: " + Math.pow(2, 3));
        System.out.println("Math min: " + Math.min(1, 2));
        System.out.println("Math max: " + Math.max(1, 2));
        System.out.println("Math random: " + Math.random());
        System.out.println("Math random in range: " + randomNumberInRange(1, 10));
        // trigonometry
        System.out.println("Math sin: " + Math.sin(Math.PI / 2));
        System.out.println("Math cos: " + Math.cos(Math.PI / 2));
        System.out.println("Math tan: " + Math.tan(Math.PI / 2));
        System.out.println("Math asin: " + Math.asin(1));
        System.out.println("Math acos: " + Math.acos(1));
        System.out.println("Math atan: " + Math.atan(1));
        System.out.println("Math atan2: " + Math.atan2(1, 1));
        System.out.println("Math toDegrees: " + Math.toDegrees(Math.PI / 2));
        System.out.println("Math toRadians: " + Math.toRadians(90));
        // exponential and logarithmic functions
        System.out.println("Math exp: " + Math.exp(1));
        System.out.println("Math log: " + Math.log(1));
        System.out.println("Math log10: " + Math.log10(1));
        System.out.println("Math expm1: " + Math.expm1(1));
        System.out.println("Math log1p: " + Math.log1p(1));

        // examples of usage
        System.out.println("Circle area: " + circleArea(5));
        System.out.println("Circle circumference: " + circleCircumference(5));
        System.out.println("Rectangle area: " + rectangleArea(5, 5));
        System.out.println("Rectangle circumference: " + rectangleCircumference(5, 5));
        System.out.println("Right angle triangle area: " + rightAngleTriangleArea(5, 5));
        System.out.println("Right angle triangle circumference: " + rightAngleTriangleCircumference(5, 5));
    }

    public static int randomNumberInRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static double rectangleCircumference(double width, double height) {
        return 2 * (width + height);
    }

    public static double rightAngleTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double rightAngleTriangleCircumference(double base, double height) {
        return base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
}
