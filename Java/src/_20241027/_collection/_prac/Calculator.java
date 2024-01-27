package _20241027._collection._prac;

public class Calculator<T extends Number> {

    private T num1;

    private T num2;

    public Calculator(T num1, T num2){
        this.num1=num1;
        this.num2=num2;
    }

    //e더하기 메소드
    public double add(){
        System.out.println(num1.doubleValue());
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        //정수형 계산기
        Calculator<Integer> intCalculator = new Calculator<>(5,10);
        System.out.println("integer Sum : " + intCalculator.add());

        //실수형 계싼기
        Calculator<Double> doubleCalculator = new Calculator<>(3.14,2.5);
        System.out.println("Double Sum : " + doubleCalculator.add());
    }
}
