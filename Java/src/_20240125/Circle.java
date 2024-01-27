package _20240125;


//구체적인 클래스
public class Circle extends Shape {
    public Circle (String color){
        super(color);
    }

    //추상 메서드 구현
    void draw(){
        System.out.println("원그리기!");
    }
}
