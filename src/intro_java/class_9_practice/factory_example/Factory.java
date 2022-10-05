package intro_java.class_9_practice.factory_example;

/**
 * this class is responsible for creation of Products
 */
public class Factory {
    /**
     * specifies the type of product to create, may be: food, toy, fabric, etc.
     */
    private String type;

    public Factory(String type) {
        this.type = type;
    }


    /**
     * this method creates Product object based on type we provided while creating the Factory object
     *
     * @param name name of the product
     * @param price price of the product
     * @return new product
     */
    public Product generateProduct(String name, float price) {
        Product product = new Product(type, name);
        product.setPrice(price);
        return product;
    }
}
