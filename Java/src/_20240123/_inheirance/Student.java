package _20240123._inheirance;

public class Student extends Person {

    //case1. 필드가 public인경우
//    public String campus;
//    public Student (String name, int age){

        //2-1 기본 생성자
        //super(0생략ㅇ되어있음(컴파일시자동추가
//        this.name =name;
//        this.age =age;
        //2-2 부모클래스가 매개변수ㅡㄹ 갖는 생성자일때
//        super(name,age);
//        System.out.println("자식 클래스 Student(name,age)생성자 실행");
//    }
//
//    public void setCampus(String campus){
//        this.campus=campus;
//        System.out.println(campus+"캠퍼스에서 공부중");
//    }
        ////////////////////
        //case2. 필드가 private인 경우
    private String campus;
    public Student ( String name, int age){
        setAge(age);
        setName(name);

    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
        System.out.println(campus + "캠퍼스에서 공부중");
    }

    // 오버라이딩 - 부모클래스의 메소드를 자식 클래스에서 재정의
    // 메소드 이름 매개변수 타입 및 개수, 리턴 타입 등 모든 것 동일하게

    @Override// 어노테이션(생략가능)
    public void say(){
        System.out.println("ㅎㅇ");
    }


}
