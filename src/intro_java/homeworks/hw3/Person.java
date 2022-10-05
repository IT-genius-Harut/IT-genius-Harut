package intro_java.homeworks.hw3;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int height;

    public Person() {}

    public Person(String name, String surname, int age, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person: name = " + name + " surname = " + surname
                + " age = " + age + " height = " + height;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return this.name.equals(person.getName())
                && this.surname.equals(person.getSurname())
                && this.age == person.getAge();
    }

    // GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}