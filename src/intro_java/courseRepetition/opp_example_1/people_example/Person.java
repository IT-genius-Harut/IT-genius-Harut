package intro_java.courseRepetition.opp_example_1.people_example;

public class Person {

    private String name;

    private int age;

    private long phoneNumber;

    public Person(String name, int age, int phoneNumber, long workingHours, String office) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void talk(){
        System.out.println(getName() + " is talk");
    }

    public void sleep(){
        System.out.println(getName() + " is sleep");
    }

    @Override
    public String toString(){
        return "The person name is:" + name + " age is: " + age;
    }

    @Override
    public boolean equals(Object anotherPerson){
        Person person = (Person) anotherPerson;
        return this.name.equals(((Person) anotherPerson).getName())
                && this.age == ((Person) anotherPerson).getAge();
    }
    //GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


