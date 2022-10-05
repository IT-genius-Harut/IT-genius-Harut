package intro_java.opp_example;

public class Cats extends Animal{
    public Cats(String name, int age){
        super(name, age);
    }
    public void speak(){
        System.out.println(name + " meow");

    }

    @Override
    public String toString(){
        return "The Cat name is: " + name + " age is: " + age;
    }

}
