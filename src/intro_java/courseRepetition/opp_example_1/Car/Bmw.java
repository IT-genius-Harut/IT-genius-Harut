package intro_java.courseRepetition.opp_example_1.Car;

public class Bmw extends BaseCar {


    public Bmw(String brand, String colour, int price) {
        super(brand, colour, price);
    }

    @Override
    public int getSpeed(int speed) {
        return (int) (speed * 1.3);
    }
}
