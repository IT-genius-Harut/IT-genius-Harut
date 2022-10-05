package intro_java.opp_example;

public abstract class Animal {
    public String name;
    public int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String animalAge(){
        return name + " is " + age + " years old";
    }

    public String sleep(){
        return name + " is sleep";
    }

    @Override
    public boolean equals(Object animals){
        Animal animal = (Animal) animals;
        return this.age == ((Animal) animals).getAge();
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

    public abstract void speak();

}
