package intro_java.class_11_opp_practice.factory.shops;

import intro_java.class_11_opp_practice.factory.people.Employee;
import intro_java.class_11_opp_practice.factory.products.BaseProduct;
import intro_java.class_11_opp_practice.factory.products.FoodProduct;

public class FoodShop extends BaseShop {
    public FoodShop(Employee employee, int maxCapacity) {
        super(employee, maxCapacity);
    }

    @Override
    public void addProduct(BaseProduct product) {
        if (product instanceof FoodProduct) {
            super.addProduct(product);
        } else {
            System.out.println(product + " is not food");
        }
    }

    @Override
    public float getTaxRate() {
        return 1.05f;
    }
}
