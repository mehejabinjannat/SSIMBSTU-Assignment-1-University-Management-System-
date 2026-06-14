//create abstract class
public abstract class UniversityMember {

    // Attributes
    protected String memberId;
    protected String name;

    // Constructor
    public UniversityMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Concrete method
    public void displayBasicInfo() {
        System.out.println("ID   : " + memberId);
        System.out.println("Name : " + name);
    }

    // Abstract method 
    public abstract void performDuty();
}
