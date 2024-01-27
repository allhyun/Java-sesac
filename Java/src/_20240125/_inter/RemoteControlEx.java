package _20240125._inter;

public class RemoteControlEx {
    public static void main(String[] args) {
        //interface도 하나의 타입이므로 변수의 타입으로 사용가능
        // - interface 는 참좌차입 -> null 대입이 가능

        REmoteControl rc;
        //rc 변수에 Television 객체를 대입
        rc = new Television(); // RemoteControl rc= new Television(); 과 동일
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();

        //rc 변수에 Audio 객체를 대입(교체)
        rc= new Audio();
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();



    }
}
