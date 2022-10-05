package intro_java.courseRepetition.globall_updata;

public class CarEx {

    public String brand;

    public String colour;

    public int price;

    public int hp;

    public CarEx(String brand, String colour, int price, int hp){
        this.brand = brand;
        this.colour = colour;
        this.price = price;
        this.hp = hp;
    }

    public CarEx(){

    }

    public CarEx(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public static final double MILE_TO_KM = 1.6;

    public static int mileToKm(int speed){
        return (int) (speed * MILE_TO_KM);
    }

    public static int km_To_Mile(int speed){
        return (int) (speed / MILE_TO_KM);
    }

    @Override
    public String toString(){
        return "The car brand is: " + brand + " colour is: " + colour
                + " price is: " + price + " and hors power is: " + hp;
    }

    @Override
    public boolean equals(Object obj){
        CarEx car = (CarEx) obj;
        return (this.colour.equals(car.colour) && this.price == car.price
                && this.hp == car.hp);
    }

    // GETTERS AND SETTERS

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour == "green") {
            System.out.println("this colour is not supported yet");
            return;
        }
        this.colour = colour;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        if (price < 0) return;
        if (price > 100000) return;
        this.price = price;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp > 1500){
            System.out.println("this car so faster");
            return;
        }
        this.hp = hp;
    }
}
