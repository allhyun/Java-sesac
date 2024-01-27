package _20240125._inter._prac2;

public class Airplane extends Vehicle implements Flyable{
    //생성자
    public Airplane(String name,int maxSpeed){
        super(name,maxSpeed);
    }

    @Override
    public void move(){
        System.out.println(getName()+"이(가) 하늘을 나는 중");
    }

    //fly메서드 구현(fltable 인터페이스 에서 온 메서드 구현)
    @Override
    public void fly(){
        System.out.println(getName()+"고도 10,000피트에서 비행중");
    }
}
