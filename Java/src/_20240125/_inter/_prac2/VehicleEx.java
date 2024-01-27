package _20240125._inter._prac2;

public class VehicleEx {
    public static void main(String[] args) {
        //vehicle 배열을 생성
        Vehicle[] vehicles= new Vehicle[2];
        //Car 객체 생성 및 배열에 저장
        Car car = new Car("자동차",100);
        vehicles[0]= car;
        //airplane객체 생성 및 배열에 저장
        Airplane airplane =new Airplane("비행기",500);
        vehicles[1]=airplane;

        //추ㄱk
        //상위에서 하뤼 :()명시
        //하위에서 상위 : 생락가능


        //배열을 순회하면서 출력
        for(Vehicle vehicle:vehicles){
            System.out.println("이름 "+vehicle.getName());
            vehicle.move();

            System.out.println(vehicle instanceof Flyable);
            //instanceof 는 각각의타입을 알 수 없으니 타입을 검사할 수 있다.
            //car 은 flyable 구현안함
            //airplane 은 fluable 구현 한 경우
            if  (vehicle instanceof Flyable){
                ((Flyable) vehicle).fly(); //형변환(캐스팅) 해서 fly를 실행
            }

        }
    }
}
