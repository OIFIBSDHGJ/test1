import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private String address;
    private List<Student> student = new ArrayList<>();

    public School(){}

    public School(String schoolName, String address) {
        this.schoolName = schoolName;
        this.address = address;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
    public void setStudent(Student student) {
        this.student.add(student);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                ", student=" + student +
                '}';
    }
}
