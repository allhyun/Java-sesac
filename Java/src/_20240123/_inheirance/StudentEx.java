package _20240123._inheirance;

public class StudentEx {
    public static void main(String[] args) {
        Student std1= new Student("김새싹",30);
//
//        //case1 . 부모,자식 클래스의 필드가 public인 경우
//        //Person(부모) 클래스로부터 상속받은 필드값 읽기
//        System.out.println(std1.name);//김새싹
//        System.out.println(std1.age);//30
//
//        //자식클래스필드값읽기
//
//        System.out.println(std1.campus);//null(setter 실행 x)
//
//        //Peson 으로부터 상속받은 메소드 호출
//        std1.say();
//        std1.eat("바나나");
//        //student 메소드 호출
//        std1.setCampus("새싹 용산");
//        System.out.println(std1.Campus());


        ////////////////
        //case.2 부모, 자식 클래스의 필드가 private인 경우
        //person으로부터 상속받
        System.out.println(std1.getName());
        System.out.println(std1.getAge());



        //Person으로부터 상속받은 메소드 호출
        System.out.println(std1.getCampus());

        //Person으로부터 상소갇은 메소드 호출
        std1.say();// public 메소드

        //student 메소드 호출
        std1.setCampus("새싹 용산");
        System.out.println(std1.getCampus());
    }
}
