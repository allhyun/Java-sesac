package _20240125._inter._prac;

public class Mp3Player implements MusicPlayer{
    private String music;

    @Override
    public void play() {
        System.out.println("MP3 플레이어에서 '아이유 블루밍'음악을 재생합니다");
    }

    @Override
    public void stop(){
        System.out.println("MP3 플레이어에서 '아이유 블루밍'음악을 정지합니다");
    }

    @Override
    public void Music(String music){
        if(music == MusicPlayer.PLAY_music){
            this.music=MusicPlayer.PLAY_music;
        } else {
            this.music=MusicPlayer.STOP_music;
        }
    }


}
