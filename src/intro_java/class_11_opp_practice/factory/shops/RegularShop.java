package intro_java.class_11_opp_practice.factory.shops;


import intro_java.class_11_opp_practice.factory.people.Employee;

public class RegularShop extends BaseShop {
    public RegularShop(Employee employee, int maxCapacity) {
        super(employee, maxCapacity);
    }
}
