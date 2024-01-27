package _20240123._inheirance._Prac;

public class PracDog extends Prac_interitance  {
    public PracDog(String name, int age) {
        // Animal 클래스의 생성자 호출하여 초기화
        super("강아지", name, age);
    }

    // makeSound 메소드를 오버라이드하여 각 동물이 내는 소리 출력
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }
    // Dog 클래스에만 해당하는 메소드 등을 추가할 수 있음
}
