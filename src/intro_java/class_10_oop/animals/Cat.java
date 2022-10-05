package intro_java.class_10_oop.animals;

/**
 * a sub/child class inheriting {@linkplain Animal}
 * a Cat IS an Animal
 */
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    /**
     * overriding the {@linkplain Animal#talk()} method to say "${cat's name} meow" instead of generic message
     */
    @Override
    public void talk() {
        System.out.println(getName() + " meow");
    }
}
