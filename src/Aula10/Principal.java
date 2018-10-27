package Aula10;

public class Principal {
    public static void main(String[] args) {
        Mp3 m = new Mp3();
        m.play();
        m.pause();
        m.volume();
        m.taxaBits();
        m.stop();
        System.out.println();

        Avi a = new Avi();
        a.play();
        a.pause();
        a.volume();
        a.taxaBits();
        a.taxaQuadros();
        a.stop();
        // f f v v f v
    }
}
