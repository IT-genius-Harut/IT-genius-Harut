package intro_java.class_8_objects;

public class Main {
    public static void main(String[] args) {
        // create a new car with no arguments
        Car audi = new Car();
        // set each field of the car using setter methods
        audi.setBrand("audi");
        audi.setHp(500);
        audi.setPrice(5000);
        audi.setColour("yellow");

        // create 3 more cars but with all specifications filled in
        Car bmw = new Car("bmw", "black", 5000, 500);
        Car lambo = new Car("lambo", "yellow", 10000, 700);
        Car volkswagen = new Car("volkswagen", "blue", 3000, 150);

        // create a garage for 3 cars
        Garage myGarage = new Garage(3);
        // add the 3 cars to the garage
        myGarage.addCar(audi);
        myGarage.addCar(bmw);
        myGarage.addCar(lambo);
        myGarage.addCar(volkswagen);
        // print the garage
        System.out.println(myGarage);
        // remove the last car
        myGarage.removeCar();
        System.out.println("REMOVING THE LAST CAR");
        System.out.println(myGarage);
        // try adding volkswagen again
        myGarage.addCar(volkswagen);
        // print the garage
        System.out.println(myGarage);
        System.out.println(lambo);

    }
}