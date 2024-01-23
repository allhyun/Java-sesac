package _20240123._static;

public class StaticPracTotal {
    private String name;
    private int student_ID;
    private int grade;
    private static int totalStudents = 0;
    public static int getTotalStudents() {
        return totalStudents;
    }

    //생성장
    public StaticPracTotal(String name, int student_ID, int grade){
        this.name = name;
        this.student_ID = student_ID;
        this.grade = grade;
        totalStudents++;
    }

    //getter setter 메서드

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
