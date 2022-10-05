package intro_java.courseRepetition.opp_example_1.people_example;

public class Employee extends Person {

    private String office;

    private int salary;

    private int workingHours;

    public Employee(String name, int age, int phoneNumber, int workingHours, String office) {
        super(name, age, phoneNumber, workingHours, office);
    }


    public Employee(String name, int age) {
        super(name, age);
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "The employee name is: " + getName() + " age is: " + getAge() +
                " phone number is: " + getName() + " work hours is: " +
                getWorkingHours() + " and office is: " + getOffice();
    }

    // GETTERS AND SETTERS


    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        if (salary < 0) return;
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
