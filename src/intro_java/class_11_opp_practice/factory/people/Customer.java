package intro_java.class_11_opp_practice.factory.people;

import intro_java.class_11_opp_practice.factory.products.BaseProduct;
import intro_java.class_11_opp_practice.factory.shops.BaseShop;

public class Customer extends Person {
    public Customer(String name, String surname, int age) {
        super(name, surname, age);
    }

    public BaseProduct buyFromShop(BaseShop shop) {
        return shop.getSuggestedProduct();
    }
}
