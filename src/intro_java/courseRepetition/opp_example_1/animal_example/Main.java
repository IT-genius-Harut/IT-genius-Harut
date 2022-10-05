package intro_java.courseRepetition.opp_example_1.animal_example;

public class Main {
    public static void main(String[] args) {
        AnimalExample kesha = new CatExample("Kesha", 3);
        AnimalExample miki = new CatExample("Miki", 2);
        AnimalExample jeko = new DogExample("Jeko", 14);
        DogExample rex = new DogExample("Rex", 6);
        CatExample alex = new CatExample("Alex", 5);

        System.out.println(kesha);
        System.out.println(miki);
        System.out.println(jeko);
        System.out.println(rex);
        System.out.println(alex);

        rex.talk();
        kesha.talk();

        alex.setName("Poxos");
        System.out.println(alex);
    }
}
