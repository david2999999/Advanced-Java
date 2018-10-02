package Advanced.Adapter;

// Adaptor pattern involves a class that is responsible to join functionality
// of 2 different or incompatible classes. Acting as a bridge between 2 incompatible interfaces
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Beyond the horizon");
        audioPlayer.play("mp4", "alone");
        audioPlayer.play("vlc", "far far away");
        audioPlayer.play("avi", "hello");
    }
}
