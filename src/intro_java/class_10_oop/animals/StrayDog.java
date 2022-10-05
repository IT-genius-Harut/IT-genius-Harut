package intro_java.class_10_oop.animals;

/**
 * a sub/child class from Dog. StrayDog IS a Dog, and a Dog IS an Animal
 * thus PetDog IS an Animal
 */
public class StrayDog extends Dog{
    public StrayDog(String name, int age) {
        super(name, age);
    }
}
