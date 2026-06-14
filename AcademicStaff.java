public class AcademicStaff extends Employee {

    //attribute
    protected String department;

    // Constructor
    public AcademicStaff(String memberId, String name,
                          double salary, String department) {
        super(memberId, name, salary); // বাবার constructor call
        this.department = department;
    }

    //method
    public void showDepartment() {
        System.out.println("Department : " + department);
    }

    // performDuty override
    @Override
    public void performDuty() {
        System.out.println(name + " is teaching in " + department + " department.");
    }
}
