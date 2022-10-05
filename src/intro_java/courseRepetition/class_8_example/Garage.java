package intro_java.courseRepetition.class_8_example;

public class Garage {

    public Car[] cars;

    public int currentCarIndex = 0;

    public Garage(int currentCarIndex) {
        cars = new Car[currentCarIndex];
    }

    public void removeCar() {
        if (currentCarIndex < 0) {
            currentCarIndex = 0;
            return;
        }
        currentCarIndex--;
    }

    public void addCar(Car car) {
        if (currentCarIndex >= cars.length) {
            System.out.println("cannot add more cars. Car: " + car.toString()
                    + " will not be added to the garage" );
            return;
        }
        cars[currentCarIndex] = car;
        currentCarIndex++;
    }
    @Override
    public String toString() {
        String retValue = "";
        for (int i = 0; i < currentCarIndex; i++) {
            retValue += cars[i].toString() + "\n";
        }
        return retValue;
    }
}
