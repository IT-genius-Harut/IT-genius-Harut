package intro_java.class_10_oop.people;

/**
 * sub/child class from Person class. An Employee inherits from Person
 * meaning an Employee IS a Person
 */
public class Employee extends Person {
    private String office;

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }

    /**
     * @return the name of the person with the "Mr." prefix added for solidity
     */
    @Override
    public String getName() {
        return "Mr. " + super.getName();
    }

    // additional methods, that an Employee has, but a person does not
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
