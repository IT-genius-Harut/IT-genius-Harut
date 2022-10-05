package intro_java.class_8_objects;

public class Garage {
    /**
     * an array representing the cars in the garage
     */
    private Car[] cars;
    /**
     * the number of cars in the garage
     */
    private int currentCarIndex = 0;

    public Garage(int numberOfCars) {
        // create an array of the given size
        cars = new Car[numberOfCars];

    }

    /**
     * remove a car from the garage by simply decreasing the number of cars in the garage
     */
    public void removeCar() {
        if (currentCarIndex <= 0){
            System.out.println("cannot remove any more cars");
            currentCarIndex = 0;
            return;
        }
        currentCarIndex--;
    }

    /**
     * add a new car to the garage
     * @param car the car to add to the garage
     */
    public void addCar(Car car) {
        // first check if the garage is full
        if (currentCarIndex >= cars.length) {
            System.out.println("cannot add more cars. Car: " + car.toString()
                    + " will not be added to the garage" );
            return;
        }
        // add the car to the garage
        cars[currentCarIndex] = car;
        // increase the number of cars in the garage
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
