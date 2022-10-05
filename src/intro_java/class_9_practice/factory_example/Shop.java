package intro_java.class_9_practice.factory_example;

public class Shop {
    /**
     * an array of products that are in the shop
     */
    private Product [] productToSell; // default value is null
    /**
     * number of products in the shop
     */
    private int currentProductIndex = 0;
    /**
     * total money that the shop profited
     */
    private float totalMoneyEarned = 0;

    public Shop(int maxCapacity) {
        productToSell = new Product[maxCapacity]; // array creation
    }

    /**
     * a method that adds a product to the shop
     * first it spends money on the product
     * and then increases the price by 10% and
     * adds the product to the shop for the Customers to buy
     *
     * @param product product to add to the shop
     */
    public void addGoodsToShop(Product product) {
        if (currentProductIndex >= productToSell.length) {
            System.out.println("no more goods can be added to the shop");
            return;
        }
        totalMoneyEarned -= product.getPrice();
        product.setPrice(product.getPrice() * 1.1f);
        productToSell[currentProductIndex] = product;
        currentProductIndex++;
    }


    /**
     * gets the last non-null product added to the shop
     * and removes it from the shop - sets the value
     * of that index to null
     *
     * @return the last product added to the shop
     */
    public Product sellLastAddedProduct() {
        // decrease the currentProductIndex by 1
        currentProductIndex--;
        // check if the currentProductIndex is less than 0
        if (currentProductIndex < 0) {
            // if it is, set currentProductIndex to 0 and return null
            // because there is no product to sell
            currentProductIndex = 0;
            return null;
        }
        // check if the product is null. If so try again until you find a non-null product
        while (productToSell[currentProductIndex] == null) {
            currentProductIndex--;
        }
        Product lastElement = productToSell[currentProductIndex];
        sellProduct(lastElement);
        productToSell[currentProductIndex] = null;
        return lastElement;
    }

    /**
     * finds the product by name and removes it from the shop
     *
     * @param name name of the product to sell
     * @return the product that was sold
     */
    public Product sellProductByName(String name) {
        for (int i = 0; i < productToSell.length; i++) {
            Product currentProduct = productToSell[i];
            if (currentProduct == null) {
                continue;
            }
            if (currentProduct.getName().equals(name)) {
                sellProduct(currentProduct);
                productToSell[i] = null;
                return currentProduct;
            }
        }
        return null;
    }

    /**
     * product selling logic: increases the totalMoneyEarned by the price of the product and prints the result
     * @param product product to sell
     */
    private void sellProduct(Product product) {
        System.out.println("before selling the budget was: " + totalMoneyEarned);
        totalMoneyEarned += product.getPrice();
        System.out.println("after selling the budget is: " + totalMoneyEarned);
    }

    /**
     * gets the total money that the shop profited
     * @return the totalMoneyEarned
     */
    public float getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * gets all the products in the shop of not null
     * @return the string representation of the shop
     */
    @Override
    public String toString() {
        String returnValue = "Shop items: \n";
        for (int i = 0; i < currentProductIndex; i++) {
            Product currentProduct = productToSell[i];
            if (currentProduct == null) continue;
            returnValue += currentProduct.toString() + "\n";
        }
        return returnValue;
    }
}
