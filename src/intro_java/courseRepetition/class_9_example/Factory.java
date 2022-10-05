package intro_java.courseRepetition.class_9_example;


import intro_java.class_9_practice.factory_example.Product;

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
    public intro_java.class_9_practice.factory_example.Product generateProduct(String name, float price) {
        intro_java.class_9_practice.factory_example.Product product = new Product(type, name);
        product.setPrice(price);
        return product;
    }
}
