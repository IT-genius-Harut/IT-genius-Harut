package intro_java.class_10_oop.animals;


/**
 * a sub/child class inheriting {@linkplain Animal}
 * a Dog IS an Animal
 */
public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }


    /**
     * overriding the {@linkplain Animal#talk()} method to say "whoof" instead of generic message
     */
    @Override
    public void talk() {
        System.out.println(getName() + " whoof");
    }
}
