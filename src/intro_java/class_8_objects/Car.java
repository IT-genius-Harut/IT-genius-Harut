package intro_java.class_8_objects;

/**
 * simple class representing a car
 */
public class Car {
    /**
     * brand of the car
     */
    private String brand;
    /**
     * colour of the car
     */
    private String colour;
    /**
     * price of the car
     */
    private int price;
    /**
     * horsePower of the car
     */
    private int hp;

    /**
     * static constant that is used for converting miles to km and vice versa
     * (1 mile = 1.6 km)
     * it is static, because the conversion factor is the same for all cars
     */
    private static final float MILES_TO_KM = 1.6f;


    /**
     * a constructor with all fields as parameters
     *
     * @param brand  brand of the car
     * @param colour colour of the car
     * @param price  price of the car
     * @param hp     horsePower of the car
     */
    public Car(String brand, String colour, int price, int hp) {
        this.colour = colour;
        this.brand = brand;
        this.hp = hp;
        this.price = price;
    }

    /**
     * a constructor with only brand and colour as parameters. The other fields
     * are set to default values: price = 0, hp = 0
     *
     * @param brand  brand of the car
     * @param colour colour of the car
     */
    public Car(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
    }

    /**
     * no argument constructor. Sets colour and brand fields to given default values
     * and sets price and hp to 0 as their default values
     */
    public Car() {
        colour = "default colour";
        brand = "default brand";
    }

    /**
     * car's move method, which is responsible for moving the car forward
     */
    public void move() {
        // implement moving logic
        System.out.println(brand.length());
    }

    /**
     * car's stop method, which is responsible for stopping the car
     */
    public void stop() {
        System.out.println("stopping " + MILES_TO_KM);
    }

    /**
     * a static method for speed conversion, since the conversion is done the same way for all cars
     * and the functionality is not dependent on the particular car
     *
     * @param speed speed of the car in km/h
     * @return speed in miles/h
     */
    public static float kmhToMph(int speed) {
        return speed / MILES_TO_KM;
    }

    // GETTERS AND SETTERS

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        // we can inject our own logic here before setting the colour
        if (colour.equals("green")) {
            System.out.println("green colour is not supported yet");
            return;
        }
        this.colour = colour + " colour";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    /**
     * overriding the toString method to print the car's information
    * */
    @Override
    public String toString() {
        return "Car brand is: " + brand + " colour: " + colour
                + " price: " + price + " hp: " + hp;
    }

    /**
     * overriding the equal method to compare two cars
     *
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object otherCar) {
        Car car = (Car) otherCar;
        return (this.price == car.price) && // using the == operator to compare the price because it is an int (primitive)
                (this.hp == car.hp) &&
                (this.brand.equals(car.brand)) && // using the equal method of the String class because String is also an object
                (this.colour.equals(car.colour));
    }
}
