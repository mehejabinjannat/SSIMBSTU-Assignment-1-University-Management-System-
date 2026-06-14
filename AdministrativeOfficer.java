//sibling of AdministrativeOfficer
public class AdministrativeOfficer extends Employee {

    //attribute
    private String officeSection;

    // Constructor
    public AdministrativeOfficer(String memberId, String name,
                                  double salary, String officeSection) {
        super(memberId, name, salary); //constructor call
        this.officeSection = officeSection;
    }

    //  method
    public void showSection() {
        System.out.println("Section : " + officeSection);
    }

    // performDuty override
    @Override
    public void performDuty() {
        System.out.println(name + " is managing administrative tasks in "
                           + officeSection + ".");
    }
}
