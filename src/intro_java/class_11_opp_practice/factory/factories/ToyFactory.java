package intro_java.class_11_opp_practice.factory.factories;

import intro_java.class_11_opp_practice.factory.products.ToyProduct;

public class ToyFactory extends BaseFactory {
    @Override
    public String getType() {
        return "toy factory";
    }

    @Override
    public ToyProduct makeProduct(int price) {
        ToyProduct toy = new ToyProduct();
        toy.setPrice(price);
        return toy;
    }
}
