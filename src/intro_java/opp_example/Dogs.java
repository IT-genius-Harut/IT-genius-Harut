package intro_java.opp_example;

public class Dogs extends Animal {
    public Dogs(String name, int age) {
        super(name, age);
    }
    @Override
    public void speak(){
        System.out.println(name + " whoof");
    }
    @Override
    public String toString(){
        return "The Dog name is: " + name + " age is: " + age;
    }
}
