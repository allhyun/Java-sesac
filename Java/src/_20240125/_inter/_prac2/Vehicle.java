package _20240125._inter._prac2;

public abstract class Vehicle {
    private String name;
    private int maxSpeed;

    //생성자
    public Vehicle(String name,int maxSpeed){
        this.name = name;
        this.maxSpeed=maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    //추상메서드
     public abstract void move();
}
