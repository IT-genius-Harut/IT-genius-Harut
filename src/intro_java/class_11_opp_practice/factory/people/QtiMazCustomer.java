package intro_java.class_11_opp_practice.factory.people;

import intro_java.class_11_opp_practice.factory.products.BaseProduct;
import intro_java.class_11_opp_practice.factory.shops.BaseShop;

public class QtiMazCustomer extends Customer {
    public QtiMazCustomer(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public BaseProduct buyFromShop(BaseShop shop) {
        return shop.sellLastProduct();
    }
}