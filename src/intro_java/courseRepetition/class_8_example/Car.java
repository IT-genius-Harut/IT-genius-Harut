package intro_java.courseRepetition.class_8_example;

public class Car {
    public String brand;

    public String colour;

    public int price;

    public int horsePower;

    public Car(String brand, String colour, int price, int horsePower) {
        this.brand = brand;
        this.colour = colour;
        this.price = price;
        this.horsePower = horsePower;
    }

    public Car() {

    }

    public static float KM_TO_MPH = 1.6f;

    public static float kmToMph(int speed) {
        return speed / KM_TO_MPH;
    }

    @Override
    public String toString() {
        return "The car brand is: " + brand + " colour is: " + colour +
                " price is: " + price + " and horse power is: " + horsePower;
    }

    @Override
    public boolean equals(Object obj) {
        Car car = (Car) obj;
        return this.brand.equals(((Car) obj).brand)
                && this.colour.equals(((Car) obj).colour)
                && this.horsePower == ((Car) obj).horsePower;
    }

    //GETTERS AND SETTERS
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

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower < 0) {
            return;
        }
        if (horsePower > 2000) {
            return;
        }
        this.horsePower = horsePower;
    }
}
