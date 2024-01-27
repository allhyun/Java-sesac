package _20240125;

public abstract class Shape {

    //필드 선언
    String color;

    //생성자 선언
    public Shape(String color){
        this.color = color;

    }

    //추상 메소드 선언(abstract 키워드 사용)
    //- 선언만 하고, 구현은 하지 않음
    // - 중괄호 없음
    // - 구현 내용이 자식 클래스 마다 다른경우 추상메소드 사용
    abstract void draw();
    //선언만 하기
    // 일반 메서드도 동일하게 쓸 수 있음
    void start(){
        System.out.println("도형을 그려보자~");
    }

    String getColor(){
        return color;
    }
}
