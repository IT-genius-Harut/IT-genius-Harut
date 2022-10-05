package intro_java.class_11_opp_practice.factory.people;

import intro_java.class_11_opp_practice.factory.products.BaseProduct;

public class Employee extends Person {
    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }

    public BaseProduct getSuggestedProduct(BaseProduct[] products) {
        return products[0];
    }
}
