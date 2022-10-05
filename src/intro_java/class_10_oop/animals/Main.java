package intro_java.class_10_oop.animals;

public class Main {
    public static void main(String[] args) {
        // creating different Animals with announcing one common type
        // all four are different classes, but all inherit from Animal
        // thus ARE Animals as well
        Animal kesha = new PetDog("Kesha", 8);
        Animal barsik = new StrayDog("Barsik", 10);
        Animal jeko = new Dog("Jeko", 3);
        Animal alex = new Cat("Alex", 5);

        Animal[] animals = new Animal[4];
        animals[0] = kesha;
        animals[1] = barsik;
        animals[2] = jeko;
        animals[3] = alex;
        System.out.println(barsik);
        System.out.println(alex);
        System.out.println(jeko);
        System.out.println(kesha);
        jeko.talk();
        alex.talk();
    }
}
