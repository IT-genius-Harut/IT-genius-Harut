package intro_java.class_11_opp_practice.factory.shops;

import intro_java.class_11_opp_practice.factory.people.Employee;
import intro_java.class_11_opp_practice.factory.products.BaseProduct;

public class BaseShop {
    private Employee employee;
    private BaseProduct[] products;
    private int currentProductIndex;

    public BaseShop(Employee employee, int maxCapacity) {
        products = new BaseProduct[maxCapacity];
        this.employee = employee;
    }

    public BaseProduct getSuggestedProduct() {
        BaseProduct product = employee.getSuggestedProduct(products);
        addTaxToProductPrice(product);
        return product;
    }

    public void addProduct(BaseProduct product) {
        if (currentProductIndex >= products.length) {
            System.out.println("Cannot add any more products");
            return;
        }
        products[currentProductIndex] = product;
        currentProductIndex++;
    }

    public BaseProduct sellLastProduct() {
        currentProductIndex--;
        if (currentProductIndex < 0) {
            System.out.println("no more products left to sell");
            currentProductIndex = 0;
            return null;
        }
        BaseProduct product = products[currentProductIndex];
        if (product == null) {
            System.out.println("Cannot find the product at index: " + currentProductIndex);
            return null;
        }
        addTaxToProductPrice(product);
        return product;
    }

    private void addTaxToProductPrice(BaseProduct product) {
        float productPrice = product.getPrice();
        product.setPrice(productPrice * getTaxRate());
    }

    public float getTaxRate() {
        return 1.1f;
    }

}
