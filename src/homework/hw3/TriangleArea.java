package homework.hw3;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input triangles side");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        double area = findArea(side1, side2, side3);
        System.out.println(area);
        System.out.println("the triangle sides is: " + side1 + " " + side2 + " " + side3);
    }
    public static double findArea(double number1, double number2, double number3){
        double peri = (number1 + number2 + number3) / 2;
        double tmp = peri * (peri - number1) * (peri - number2) * (peri - number3);
        double area = Math.sqrt(tmp);
        return area;
    }
}
