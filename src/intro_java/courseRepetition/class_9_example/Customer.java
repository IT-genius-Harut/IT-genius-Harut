import intro_java.class_9_practice.factory_example.Product;
import intro_java.class_9_practice.factory_example.Shop;

/**
 * this class is representing a customer object
 */
public class Customer {
    /**
     * total money spent by the customer
     */
    private float moneySpent = 0;

    /**
     * a method that gets the last product added to the shop
     * and buys it from the shop
     *
     * @param shop shop where the customer is buying products
     */
    public void buyFromShop(Shop shop) {
        Product boughtProduct = shop.sellLastAddedProduct();
        if (boughtProduct == null) {
            System.out.println("CANNOT BUY MORE STUFF");
            return;
        }
        spendMoneyOnGoods(boughtProduct);
    }

    /**
     * a method that gets the product by name and buys it from the shop
     *
     * @param shop shop where the customer is buying products
     * @param name name of the product to buy
     */
    public void buyFromShopByName(Shop shop, String name) {
        Product product = shop.sellProductByName(name);
        if (product == null) {
            System.out.println("Could not find your goods with name: " + name);
            return;
        }
        spendMoneyOnGoods(product);
    }

    /**
     * a method that spends money on the product and prints the result
     * @param product product to spend money on
     */
    private void spendMoneyOnGoods(Product product) {
        moneySpent += product.getPrice();
        System.out.println("bought: " + product.toString());
    }

    public float getTotalSpentMoney() {
        return moneySpent;
    }
}
