package intro_java.class_10_oop.people;

public class Main {
    public static void main(String[] args) {
        // creating an employee with a generic type: Person
        Person genericPerson = new Employee("ABC", "xyz", 25);

        // checking if the generic Person is an instance of Employee class
        if (genericPerson instanceof Employee) {
            // if so, we can cast a person to employee and use its methods
            Employee employee = (Employee) genericPerson;
            employee.setOffice("KLM");
            System.out.println(employee.getOffice());
        }
        System.out.println(genericPerson.getName());
    }
}
