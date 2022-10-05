package intro_java;



public class Main {
    public static void main(String[] args) {
        CarExample bmw = new CarExample("Bmw", "black", 99999, 999);
        CarExample audi = new CarExample("Audi" , "green", 25000, 450);
        CarExample volvo = new CarExample();
        volvo.setBrand("Volvo");
        volvo.setColour("yellow");
        volvo.setPrice(7000);
        volvo.setHp(186);
        CarExample mercedes = new CarExample("Mercedes", "pink", 60000, 530);
        CarExample ford = new CarExample("Ford", "white", 25000, 569);

        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(mercedes);
        System.out.println(volvo);
        System.out.println(ford);
        System.out.println(audi.equals(volvo));
        CarsGarage myGarage = new CarsGarage(4);
        myGarage.addCar(bmw);
        myGarage.addCar(audi);
        myGarage.addCar(mercedes);
        myGarage.addCar(volvo);
        myGarage.addCar(ford);
        System.out.println("The garage is before remove is car");
        System.out.println(myGarage);
        myGarage.removeCar();
        System.out.println("The garage is after remove is car");
        myGarage.addCar(ford);
        System.out.println(myGarage);
        System.out.println(volvo + " is removed in garage");

    }
}
