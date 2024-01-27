package _20240125._prac;


// Baek 클래스, Student 클래스를 상속
class Baek extends Students {

    // Baek 클래스에만 해당하는 추가 속성이 필요하다면 추가

    // 생성자
    public Baek(String name, String school, int age, int scnum) {
        // 부모 클래스의 생성자 호출하여 초기화
        super(name, school, age, scnum);
    }

    // todo 메소드를 오버라이딩
    @Override
    public void todo() {
        System.out.println("점심은 백종원 피자");
    }
}