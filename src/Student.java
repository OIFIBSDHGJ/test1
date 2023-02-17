public class Student {
    private String studentName;
    private String studentAge;
    private String studentSex;

    public Student (){}

    public Student(String studentName, String studentAge, String studentSex) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentSex = studentSex;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }
}
