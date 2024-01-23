package _20240123._static;

public class Student01Prac {

    // 1.필드 정의

    private String name;
    private String studentId;
    private int grade;

    //클래스 변수(static 변수) 총 학생수
    //초기에는 0 으로 세팅해주기
    private static int totalStudents = 0;


    //생성자
    public Student01Prac (String name, String studentId, int grade){
        //생성자로 이름, 학번, 학년 초기화, totalstidents 증가
        this.name =name;
        this.studentId=studentId;
        this.grade=grade;
        totalStudents++;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //displayInfo 메서드 정의
    public void displayInfo(){
        System.out.println("===학생정보===");
        System.out.println("이름:" + name);
        System.out.println("학번 :" + studentId);
        System.out.println("학년 :" + grade);
    }

    //클래스 변수 getter 만들어주기
    // 클래스 변수 getter
    public static int getTotalStudents() { return totalStudents; }

    public static void main(String[] args) {
        Student01Prac std1 = new Student01Prac("김새싹","20230101",1);
        Student01Prac std2 = new Student01Prac("김새싹2","20230102",2);
        Student01Prac std3 = new Student01Prac("김새싹3","20230103",3);

        std1.displayInfo();
        std2.displayInfo();
        std3.displayInfo();

        System.out.println("총학생수는"+getTotalStudents()+"명");

    }
}
