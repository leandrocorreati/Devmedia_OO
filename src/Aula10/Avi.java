package Aula10;

public class Avi implements Video, Audio, Player {
    @Override
    public void taxaQuadros() {
        System.out.println("30 framerates /s");
    }

    /// AUDIO
    @Override
    public void taxaBits() {
        System.out.println("128 bits");
    }


    /// PLAYER
    @Override
    public void play() {
        System.out.println("Play ...");
    }

    @Override
    public void stop() {
        System.out.println("Stop...");
    }

    @Override
    public void pause() {
        System.out.println("Pause...");
    }

    @Override
    public void volume() {
        System.out.println("Volume...");
    }
}
