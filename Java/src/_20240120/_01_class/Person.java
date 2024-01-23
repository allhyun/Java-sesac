package _20240120._01_class;

public class Person {
    //필드(private)
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        Person codee = new Person();

        codee.age=10;//권장하지않음
        codee.setName("codee");//권장 ㅇ

        System.out.println(codee.age);//권장하지않음
        System.out.println(codee.getAge());//권장 ㅇ
    }
}
