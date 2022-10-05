package intro_java;

public class CarsGarage {
    public CarExample[] cars;

    public int currentCarIndex = 0;

    public CarsGarage(int numberCarsCount){
        cars = new CarExample[numberCarsCount];
    }
    public void removeCar() {
        currentCarIndex--;
    }
    public void addCar(CarExample car) {
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
