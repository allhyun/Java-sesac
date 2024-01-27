package _20240125._prac;



// 테스트를 위한 메인 클래스
public class StudentsEx {

    public static void main(String[] args) {
        // Kim 객체 생성 및 출력
        Kim KimStudents = new Kim("김철수", "ABC 고등학교", 17, 20220001);
        System.out.printf("\n==== %s 학생의 정보 ====\n", KimStudents.name);
        System.out.println("학교: " + KimStudents.school);
        System.out.println("학교"+KimStudents.school);
        System.out.println("나이: " + KimStudents.age);
        System.out.println("학번: " + KimStudents.scnum);
        KimStudents.todo();

        // Baek 객체 생성 및 출력
        Baek BaekStudents = new Baek("백영희", "XYZ 고등학교", 18, 20220002);
        System.out.printf("\n==== %s 학생의 정보 ====\n" , BaekStudents.name);
        System.out.println("학교: " + BaekStudents.school);
        System.out.println("나이: " + BaekStudents.age);
        System.out.println("학번: " + BaekStudents.scnum);
        BaekStudents.todo();
    }
}