package intro_java.courseRepetition.opp_example_1.animal_example;

public class AnimalExample {

    private String name;

    private int age;

    public AnimalExample(String name, int age){
        this.name = name;
        this.age = age;
    }

    public AnimalExample(){

    }

    public void move(String name){
        System.out.println(name + " moves");
    }

    public void sleep(String name){
        System.out.println(name + " sleeps");
    }

    public void talk(){
        System.out.println("generic animal noises ");
    }

    @Override
    public String toString(){
        return "Anima name is: " + name + " age is: " + age;
    }

    /// GETTER AND SETTERS

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
}
