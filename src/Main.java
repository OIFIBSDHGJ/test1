public class Main {
    public static void main(String [] args){
        School school = new School("舒州","孔集");
        school.setStudent(new Student("小张","18","男"));
        school.setStudent(new Student("小李","19","男"));
        school.setStudent(new Student("小王","20","女"));
        System.out.println(school);
        System.out.println("修改1");
    }
}
