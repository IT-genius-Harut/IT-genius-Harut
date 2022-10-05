package intro_java;

public class CarExample {
    public String brand;

    public String colour;

    public int price;

    public int hp;

    public CarExample(String brand, String colour, int price, int hp){
        this.brand = brand;
        this.colour = colour;
        this.price = price;
        this.hp = hp;
    }
    public CarExample() {

    }
    @Override
    public String toString(){
        return "The car brand is:" + brand + " colour is: " + colour + " price is: " + price + " and horsePower is: " + hp;
    }
    @Override
    public boolean equals(Object otherCar2){
        CarExample cars = (CarExample)  otherCar2;
        return (this.brand.equals(cars.getBrand())
        && this.colour.equals(cars.getColour())
        && this.price == cars.getPrice()
        && this.hp == cars.getHp());
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
        if (colour == "red"){
            System.out.println("Red colour is not supported yet " + toString());
            return;
        }
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 100000){
            return;
        }
        if (price < 0){
            return;
        }
        this.price = price;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
