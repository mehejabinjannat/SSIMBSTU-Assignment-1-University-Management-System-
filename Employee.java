
public class Employee extends UniversityMember {

    // attribute
    protected double salary;

    // Constructor
    public Employee(String memberId, String name, double salary) {
        super(memberId, name); // constructor call
        this.salary = salary;
    }

    //method
    public void showSalary() {
        System.out.println("Salary : " + salary);
    }

    // performDuty override
    @Override
    public void performDuty() {
        System.out.println(name + " is performing general employee duties.");
    }
}
