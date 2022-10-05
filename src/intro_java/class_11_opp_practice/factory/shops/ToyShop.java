package intro_java.class_11_opp_practice.factory.shops;
import intro_java.class_11_opp_practice.factory.people.Employee;
import intro_java.class_11_opp_practice.factory.products.BaseProduct;
import intro_java.class_11_opp_practice.factory.products.ToyProduct;

public class ToyShop extends BaseShop {
    public ToyShop(Employee employee, int maxCapacity) {
        super(employee, maxCapacity);
    }

    @Override
    public void addProduct(BaseProduct product) {
        if (product instanceof ToyProduct) {
            super.addProduct(product);
        } else {
            System.out.println(product + " is not toy");
        }
    }

    @Override
    public float getTaxRate() {
        return 1.25f;
    }
}
