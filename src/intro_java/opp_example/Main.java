package intro_java.opp_example;

public class Main {
    public static void main(String[] args) {
        Dogs alex = new Dogs("Alex", 5);
        Dogs rex = new Dogs("Rex", 3);
        Cats jery = new Cats("Jery", 10);
        Cats barsik = new Cats("Barsik", 1);
        Cats kesha = new Cats("Kesha", 6);
        Cats kesha2 = new Cats("Alex", 6);
        System.out.println(alex);
        System.out.println(rex);
        System.out.println(jery);
        System.out.println(barsik);
        System.out.println(kesha.animalAge());
        System.out.println(rex.sleep());
        alex.speak();
        barsik.speak();
        System.out.println(alex.equals(barsik));
        System.out.println(kesha.equals(kesha2));
    }
}
