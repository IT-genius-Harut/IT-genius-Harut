package intro_java.class_10_oop.people;

/**
 * base/parent class for a person entity
 */
public class Person {
    private String name;
    private String surname;
    private int age;


    public Person(String name, String surname, int age) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object otherPerson) {
        Person person = (Person) otherPerson;
        return ((this.age == person.age)
                && (this.surname.equals(person.surname))) ;
    }


    //getters and setters
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

    public int getAge() {return age;}


    public void setAge(int age) {
        this.age = age;
    }
}
