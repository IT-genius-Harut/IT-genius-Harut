package intro_java.class_11_opp_practice.factory.factories;

import intro_java.class_11_opp_practice.factory.products.BaseProduct;

public class BaseFactory {
    public BaseProduct makeProduct(int price) {
        BaseProduct product = new BaseProduct();
        product.setPrice(price);
        return product;
    }

    public String getType() {
        return "base factory";
    }
}