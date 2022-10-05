package intro_java.class_10_oop.animals;

/**
 * base/parent class for an animal entity
 */
public class Animal {
    private String name;
    private int age;

    public Animal() {}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // basic actions for animals
    public void move() {
        System.out.println(name + " moves");
    }

    public void sleep() {
        System.out.println(name + " sleeps");
    }

    public void talk() {
        System.out.println("generic animal noises");
    }

    @Override
    public String toString() {
        return "The name is: [" + getName() + "] and age is: [" + getAge() + "]";
    }

    // getters and setters

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
