package intro_java.courseRepetition.opp_example_1.Car;

public abstract class BaseCar {
    private String brand;
    private String colour;

    private int price;

    public BaseCar(String brand,String colour, int price){
        this.brand = brand;
        this.colour = colour;
        this.price = price;
    }

    public abstract int getSpeed(int speed);

    @Override
    public String toString(){
        return getBrand() + "{colour = " + getColour() + ": price = " + getPrice() + "}";
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
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
