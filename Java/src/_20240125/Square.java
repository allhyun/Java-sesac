package _20240125;

public class Square extends Shape {
    public Square (String color){
        super(color);

    }

    //추상메서드 구현
    void draw(){
        System.out.println("네모그리기");
    }
}
