package intro_java.courseRepetition.opp_example_1.people_example;

public class Main {
    public static void main(String[] args) {
        Person james = new Employee("James", 25, 077777777, 8, "MTS-Viva");
        Person tom = new Employee("Tom", 38);
        Person alex = new Employee();
        alex.setName("Alex");
        alex.setAge(18);

        System.out.println(james);
        System.out.println(tom);
        System.out.println(alex);
    }
}
