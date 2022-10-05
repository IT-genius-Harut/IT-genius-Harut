package intro_java.courseRepetition.class_8_example;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "black", 99999, 1000);
        Car mercedes = new Car("Mercedes", "red", 45000, 505);
        Car audi = new Car("Audi", "green", 60000, 700);
        Car volvo = new Car();
        volvo.setBrand("Volvo");
        volvo.setColour("pink");
        volvo.setPrice(30000);
        volvo.setHorsePower(340);
        System.out.println(bmw);
        System.out.println(mercedes);
        System.out.println(audi);
        System.out.println(volvo);
        System.out.println("Car brand is: " + bmw.getBrand());

        Garage myGarage = new Garage(3);
        // add the 3 cars to the garage
        myGarage.addCar(audi);
        myGarage.addCar(bmw);
        myGarage.addCar(mercedes);
        myGarage.addCar(volvo);
        // print the garage
        System.out.println(myGarage);
        // remove the last car
        myGarage.removeCar();
        System.out.println("REMOVING THE LAST CAR");
        System.out.println(myGarage);
        // try adding volkswagen again
        myGarage.addCar(volvo);
        // print the garage
        System.out.println(myGarage);
        System.out.println(mercedes);
     }
}
