package intro_java.class_9_practice.factory_example;

public class Main {
    public static void main(String[] args) {
        // creating food factory
        Factory foodFactory = new Factory("food");
        // generating food products
        Product food = foodFactory.generateProduct("bread", 10);
        Product food2 = foodFactory.generateProduct("milk", 8);

        // creating toy factory
        Factory toyFactory = new Factory("toy");
        // generating toy products
        Product toy = toyFactory.generateProduct("car", 15);
        Product toy2 = toyFactory.generateProduct("car", 12);
        Product toy3 = toyFactory.generateProduct("doll", 17);

        // creating a regular shop with 5 products at most
        Shop regularShop = new Shop(5);
        // adding products to the shop
        regularShop.addGoodsToShop(food);
        regularShop.addGoodsToShop(food2);
        regularShop.addGoodsToShop(toy);
        regularShop.addGoodsToShop(toy2);
        regularShop.addGoodsToShop(toy3);

        // creating a food shop with 2 products at most
        Shop foodShop = new Shop(2);
        // creating food products
        Product specialFood = foodFactory.generateProduct("eggs", 5);
        Product specialFood2 = foodFactory.generateProduct("fish", 25);
        // adding products to the shop
        foodShop.addGoodsToShop(specialFood);
        foodShop.addGoodsToShop(specialFood2);

        System.out.println("BEFORE PURCHASE");
        System.out.println(regularShop);
        System.out.println(foodShop);

        // creating a customer
        Customer customer1 = new Customer();

        // buying from regular shop by name
        customer1.buyFromShopByName(regularShop, "bread");
        System.out.println("AFTER PURCHASE");
        System.out.println(regularShop);
        System.out.println(foodShop);
        System.out.println("Customer 1 spent: " + customer1.getTotalSpentMoney());
        System.out.println("Regular shop earned: " + regularShop.getTotalMoneyEarned());
        System.out.println("Food shop earned: " + foodShop.getTotalMoneyEarned());
    }
}
