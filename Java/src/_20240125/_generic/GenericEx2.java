package _20240125._generic;
//참고. NUmber 믈래스
//java 의 모든 숫자 형식의 부모 클래스

//제네릭 제한
//Number를 상속한 클래스만 허용
class Box<T extends Number>{
    private T item;
    //박스를 구현할때는
    public void setItem(T item) {
        this.item = item;
    }
}

interface Movable {
    void move();
}


//특정한 클래스만 ...
class Car implements Movable {
    @Override
    public void move() {
        System.out.println("자동차 출발!");
    }
}

class Container<T extends Movable> {
    private T item;
    public Container(T item) {
        this.item = item;
    }
    public void makeItMove() {
        item.move();
    }
}

public class GenericEx2 {
    public static void main(String[] args) {
        //박스를 구현할때는
        // Box<String> stringBox = new Box<String>();//오류
        Box<Double> doubleBox = new Box<>();
        // 숫자를 상속해서 오류가 안나는것

        // case 2
        Container<Car> carContainer = new Container<>(new Car());
    }
}