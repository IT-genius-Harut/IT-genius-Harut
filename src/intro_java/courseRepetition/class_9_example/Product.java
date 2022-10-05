package intro_java.courseRepetition.class_9_example;

public class Product {
    /**
     * type of the product, is the same as the type of the factory that created this product
     */
    private String type;
    /**
     * name of the product
     */
    private String name;
    /**
     * price of the product
     */
    private float price;

    public Product(String type, String name) {
        this.type = type;
        this.name = name;
    }


    /**
     * including the type, price and the name of the product
     *
     * @return string representation of the product
     */
    @Override
    public String toString() {
        return "Goods: type is: " + type + " with price: " + price + " and name: " + name;
    }

    /**
     * our own implementation of equals method for the product class that checks
     * if the name and the type of the product are the same
     *
     * @param obj object to compare with
     * @return true if objects are equal, false otherwise
     */

    @Override
    public boolean equals(Object obj) {
        // cast the obj Object to Product class
        Product otherProduct = (Product) obj;
        return this.name.equals(otherProduct.name) && this.type.equals(otherProduct.type);
    }

    //getters and setters

    /**
     * sets the price of the product. Cannot be less than 0 and more than 50
     *
     * @param price price of the product
     */
    public void setPrice(float price) {
        if (price < 0) return;
        if (price > 50) return;
        this.price = price;
    }

    /**
     * simple getter for price field
     * @return price of the product
     */
    public float getPrice() {
        return price;
    }

    /**
     * simple setter for name field
     * @param name name of the product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * simple getter for name field
     * @return name of the product
     */
    public String getName() {
        return name;
    }

}
