package intro_java.courseRepetition.opp_example_1.animal_example;

public class DogExample extends AnimalExample {

    public DogExample(String name, int age){
        super(name, age);
    }

    @Override
    public String toString(){
        return "The dog name is: " + getName() + " age is: " + getAge();
    }

    @Override
    public void talk(){
        System.out.println(getName() + " whoof");
    }
}
