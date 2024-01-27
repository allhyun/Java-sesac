package _20240125._prac;

public abstract class Students {
     String name;
     String school;
     int age;
     int scnum;

    public Students(String name, String school,int age, int scnum) {
        this.name = name;
        this.school = school;
        this.age=age;
        this.scnum = scnum;


    }

    public abstract void todo();

}