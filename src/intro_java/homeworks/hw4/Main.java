package intro_java.homeworks.hw4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*// first problem
//        Write a program to create a new array list,
//        add some colors (string) and print out the collection.
        List<String> colours = new ArrayList<>();

        colours.add("Red");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("Blue");

        System.out.println(colours);

        // second problem
//      Write a program to retrieve an
//      element (at a specified index) from a given array list

        String valueAtIndex = colours.get(1);
        System.out.println(valueAtIndex);*/

        // third problem
//        Write a program to create a new array list<Dog>,
//        add some dogs (extends Animal) (Dog) and print out
//        the collection (names of dogs).

        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

        Dog dog1 = new Dog("Dingo");
        Dog dog2 = new Dog("Rex");
        Dog dog3 = new Dog("Max");

        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Masha");

        cats.add(cat1);
        cats.add(cat2);

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

//        for (Dog currentDog : dogs) {
//            System.out.print(currentDog.getName() + " ");
//            currentDog.speak();
//        }
//
//        for (Cat currentCat : cats) {
//            System.out.print(currentCat.getName() + " ");
//            currentCat.speak();
//        }

/*        List<Animal> animals = new ArrayList<>();
        animals.addAll(dogs);
        animals.addAll(cats);

        for (Animal currentAnimal : animals) {
            System.out.print(currentAnimal.getName() + " ");
            currentAnimal.speak();
        }*/

        Point p1 = new Point(3, 4);
        Point p2 = new Point(10, 12);
        System.out.println(p1.distance(p2));
    }
}
