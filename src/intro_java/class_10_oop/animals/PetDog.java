package intro_java.class_10_oop.animals;

/**
 * a sub/child class from Dog. PetDog IS a Dog, and a Dog IS an Animal
 * thus PetDog IS an Animal
 */
public class PetDog extends Dog {
    public PetDog(String name, int age) {
        super(name, age);
    }
}
