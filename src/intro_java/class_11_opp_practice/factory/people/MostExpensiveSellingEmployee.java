package intro_java.class_11_opp_practice.factory.people;

import intro_java.class_11_opp_practice.factory.products.BaseProduct;

public class MostExpensiveSellingEmployee extends Employee{
    public MostExpensiveSellingEmployee(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public BaseProduct getSuggestedProduct(BaseProduct[] products) {
        BaseProduct maxProduct = products[0];
        float maxPrice = maxProduct.getPrice();
        for (BaseProduct product : products) {
            if (product == null) continue;
            if (maxPrice < product.getPrice()) {
                maxProduct = product;
                maxPrice = maxProduct.getPrice();
            }
        }
        return maxProduct;
    }
}
