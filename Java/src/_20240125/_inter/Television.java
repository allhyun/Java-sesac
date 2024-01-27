package _20240125._inter;

public class Television implements REmoteControl {
    private int volume;

    @Override
    public void turnOn(){
        System.out.println("Audi를 킵니다");
    }
    @Override
    public void turnOff(){
        System.out.println("Audi를 끕니다");
    }

    @Override
    public void setVolume(int volume){
        //인터페이스의 상수 필드를 이용해서 volume 필드값 반환

        if(volume > REmoteControl.MAX_VOLUME){
            this.volume = REmoteControl.MAX_VOLUME;
        } else if(volume<REmoteControl.MIN_VOLUME){
            this.volume = REmoteControl.MIN_VOLUME;
        } else {
            this.volume =volume;
        }
    }
}
