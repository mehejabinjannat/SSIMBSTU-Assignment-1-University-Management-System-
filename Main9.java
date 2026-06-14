import java.util.ArrayList;

public class Main9 {
    public static void main(String[] args) {

        //Objects
        Professor p1 = new Professor(
            "P001", "Dr. Sarah Ahmed", 95000,
            "Computer Science", "Machine Learning",
            42, 150000.0
        );

        Professor p2 = new Professor(
            "P002", "Dr. Karim Hossain", 88000,
            "Electrical Engineering", "Renewable Energy",
            28, 95000.0
        );

        AdministrativeOfficer a1 = new AdministrativeOfficer(
            "A001", "Mr. Rahim Khan", 45000, "Student Affairs"
        );

        // ArrayList 
        ArrayList<UniversityMember> members = new ArrayList<>();
        members.add(p1);
        members.add(p2);
        members.add(a1);

        //Dynamic Binding 
        System.out.println("DUTY REPORT");
        for (UniversityMember member : members) {
            member.displayBasicInfo();
            member.performDuty(); // method call 
            
        }

        //Downcasting 
        System.out.println("\n RESEARCH PROFILES");
        for (UniversityMember member : members) {
            if (member instanceof Professor) { // check
                Professor prof = (Professor) member;  // cast
                prof.displayBasicInfo();
                prof.showResearchProfile(); // speacial method of professor
                
            }
        }
    }
}
