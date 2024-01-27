package _20240123._inheirance._Prac;

public class PracAnimal {

    public static void main(String[] args) {
        // Cat 객체 생성
        //객체 생성시 name age 매개변수를 필요로하기 때문에 넘겨주기
        PracCat myCat = new PracCat("나비", 3);

        // Dog 객체 생성
        PracDog myDog = new PracDog("멍멍이", 2);

        // Cat과 Dog 객체의 속성 및 메서드 동작 확인
        System.out.println("고양이 정보:");
        System.out.println("종: " + myCat.getSpecies());//출력
        System.out.println("이름: " + myCat.getName());
        System.out.println("나이: " + myCat.getAge());
        myCat.makeSound(); // Cat의 makeSound 메소드 호출
        System.out.println("----------------------");

        System.out.println("강아지 정보:");
        System.out.println("종: " + myDog.getSpecies());
        System.out.println("이름: " + myDog.getName());
        System.out.println("나이: " + myDog.getAge());
        myDog.makeSound(); // Dog의 makeSound 메소드 호출
        System.out.println("----------------------");
        // 오버라이딩 해놔서 자식에 있는 메서드가 실행되는 것임
        //부모클래스에서 정의된 메서드를 자식클래스에서 메서드를 수정해서 출력해내는게 오버라이딩
    }
}
