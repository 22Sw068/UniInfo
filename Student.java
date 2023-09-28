
package myFolder;
public class Student {
    private String sname;
    private Department dept;

    public Student(String sname) {
        this.sname = sname;
    }

    public String getSname() {
        return this.sname;
    }

    public void setDept(Department dept1) {
        this.dept = dept1;
    }

    public String toString() {
        return sname;
    }

}