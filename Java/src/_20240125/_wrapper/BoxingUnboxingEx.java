package _20240125._wrapper;

public class BoxingUnboxingEx {
    public static void main(String[] args) {
        //Boxing
        // -기본 타입의 값을 포장 객체ㅔ로 만드는 과정
        // -포장 클래스 변수에 값이 대입될 때 발생

        Integer obj1 = 100;
        Double obj2 = 3.14;


        System.out.println(obj1.intValue()); //Integer 객체 내부의 int값 리턴
        System.out.println(obj2.doubleValue());//Integer 객체 내부의 double값 리턴

        //unboxing
        int value1 =obj1;
        double value2 = obj2;
        System.out.println(value1);
        System.out.println(value2);
    }
}
