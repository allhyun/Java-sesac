package _20240125._inter._prac;

public class MusicPlayerEx {
    public static void main(String[] args) {
        MusicPlayer mp;

        System.out.println("====MP3 Player====");

        mp= new Mp3Player();
        mp.play();
        mp.stop();

        CdPlayer cd;

        System.out.println("====CD Player====");

        cd = new CdPlayer();
        cd.play();
        cd.stop();
    }
}
