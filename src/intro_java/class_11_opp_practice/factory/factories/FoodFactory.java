package intro_java.class_11_opp_practice.factory.factories;

import intro_java.class_11_opp_practice.factory.products.FoodProduct;

public class FoodFactory extends BaseFactory {
    @Override
    public String getType() {
        return "food factory";
    }

    @Override
    public FoodProduct makeProduct(int price) {
        FoodProduct foodProduct = new FoodProduct();
        foodProduct.setPrice(price);
        return foodProduct;
    }
}
