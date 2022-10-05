package intro_java.courseRepetition.opp_example_1.Car;

public class Main {
    public static void main(String[] args) {
        BaseCar bmw = new Bmw("BMW", "black", 40000);
        BaseCar ferrari = new Ferrari("FERRARI", "red", 250000);

        System.out.println(ferrari);
        System.out.println(bmw);

        System.out.println("Bmw speed = " + bmw.getSpeed(330) + "km/h");
        System.out.println("Ferrari speed = " + ferrari.getSpeed(360) + "km/h");

    }
}
