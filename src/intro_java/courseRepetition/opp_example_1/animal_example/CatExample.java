package intro_java.courseRepetition.opp_example_1.animal_example;

public class CatExample extends AnimalExample {

    public CatExample(String name, int age){
        super(name, age);
    }

    @Override
    public String toString(){
        return "The cat name is: " + getName() + " and age is: " + getAge();
    }

    @Override
    public void talk(){
        System.out.println(getName() + " meow");
    }
}
