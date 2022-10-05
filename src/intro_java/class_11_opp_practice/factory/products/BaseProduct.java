package intro_java.class_11_opp_practice.factory.products;

public class BaseProduct {
    private float price;
    public String getType() {
        return "basic product";
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " + getType() + " with price: " + getPrice();
    }
}
