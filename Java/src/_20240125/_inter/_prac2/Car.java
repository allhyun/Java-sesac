package _20240125._inter._prac2;

import _20240125._inter._prac2.Vehicle;

public class Car extends Vehicle {
    public Car(String name,int maxSpeed){
        super(name,maxSpeed);
    }

    @Override
    public void move(){
        System.out.println(getName()+"이(가) 움직이고있다");
    }

}
