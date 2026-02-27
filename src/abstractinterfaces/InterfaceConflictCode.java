package abstractinterfaces;

interface Camera {
    default void start() {
        System.out.println("Camera starting...");
    }

    default void stop() {
        System.out.println("Camera stopped.");
    }
}

interface MusicPlayer {
    default void start() {
        System.out.println("Music Player starting...");
    }

    default void stop() {
        System.out.println("Music Player stopped.");
    }
}

interface Phone {
    void makeCall(String number);
}
class SmartPhone implements Camera, MusicPlayer, Phone {


    @Override
    public void start() {
        System.out.println("SmartPhone starting all systems...");
        Camera.super.start();
        MusicPlayer.super.start();
    }


    @Override
    public void stop() {
        System.out.println("SmartPhone shutting down all systems...");
        Camera.super.stop();
        MusicPlayer.super.stop();
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }
}
public class InterfaceConflictCode {
    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone();

        sp.start();
        sp.makeCall("9876543210");

        sp.stop();
    }
}
