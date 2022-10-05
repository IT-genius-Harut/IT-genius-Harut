package intro_java.class_11_opp_practice.factory;

import intro_java.class_11_opp_practice.factory.factories.BaseFactory;
import intro_java.class_11_opp_practice.factory.factories.FoodFactory;
import intro_java.class_11_opp_practice.factory.factories.ToyFactory;
import intro_java.class_11_opp_practice.factory.people.Customer;
import intro_java.class_11_opp_practice.factory.people.Employee;
import intro_java.class_11_opp_practice.factory.people.QtiMazCustomer;
import intro_java.class_11_opp_practice.factory.products.BaseProduct;
import intro_java.class_11_opp_practice.factory.shops.BaseShop;
import intro_java.class_11_opp_practice.factory.shops.ToyShop;

public class Main {
    public static void main(String[] args) {
        Employee employee =
                new Employee("John", "Smith", 25);
        Customer customer = new QtiMazCustomer("James", "Brown", 23);
        BaseFactory toyFactory = new ToyFactory();
        BaseProduct toyProduct = toyFactory.makeProduct(15);
        BaseProduct moreExpensiveToyProduct = toyFactory.makeProduct(25);

        BaseFactory foodFactory = new FoodFactory();
        BaseProduct foodProduct = foodFactory.makeProduct(10);
        BaseProduct moreExpensiveFoodProduct = foodFactory.makeProduct(18);

        BaseShop regularShop = new ToyShop(employee, 5);
        regularShop.addProduct(moreExpensiveFoodProduct);
        regularShop.addProduct(toyProduct);
        regularShop.addProduct(moreExpensiveToyProduct);
        regularShop.addProduct(foodProduct);

        BaseProduct boughtProduct = customer.buyFromShop(regularShop);
        System.out.println(boughtProduct);
    }
}
