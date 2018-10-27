package Aula10;

import javax.xml.bind.SchemaOutputResolver;

public class Mp3 implements Player, Audio {
    public Mp3() {
        super();
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
