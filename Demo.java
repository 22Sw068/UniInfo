import java.util.ArrayList;
import myFolder.*;
public class Demo {
    public static void main(String[] args) {

        String[] studentNames = {"ALI", "ZUBAIR", "SARMAD", "XALAM"}; // Corrected student name
        String[] departmentNames = {"Computer Science", "Civil", "Cyber security", "Architecture"};

        University university = new University(studentNames, departmentNames, "Mehran.\n");
        System.out.println("\nUniversity Name : " + university.getName());
        System.out.println("List of Students and Departments is given.\n");

        university.enrollIn(university.getDepartment("Computer Science"), university.getStudent("ALI"));
        university.enrollIn(university.getDepartment("Civil"), university.getStudent("ZUBAIR"));
        university.enrollIn(university.getDepartment("Cyber security"), university.getStudent("SARMAD"));
        university.enrollIn(university.getDepartment("Architecture"), university.getStudent("XALAM")); // Corrected student name

        university.display();

        System.out.println();
        university.print_student_name("Physics");
    }
}
