package _20240120._01_class;

public class ClassName {
    // 클래스의 기본 구조
    // 필드 (변수)
    public int number;

    public String name;

    // 메소드 (함수)

    //생성자-> 클래스명과 동일한 이름으로 만들어준다
    public ClassName(){

    }

    public void testMethod() {
        System.out.println("test method!");
    }

    public static void main(String[] args) {
        //객체 생성(인스턴스 화)
        ClassName test = new ClassName();
        //ClassName 이라는 클래스를 가진 객체가 생성 된 것.
        //필드, 메소드 사용
        test.testMethod();
        System.out.println(test.name); //null
        System.out.println(test.number); // 0
    }
}
