import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FischMain {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        int breite = 400;
        int hoehe = 400;
        Aquarium aq = new Aquarium(breite, hoehe);
        for (int i = 0; i < 80; i++) {
            aq.addFisch(new Rotfisch(r.nextInt(breite), r.nextInt(hoehe)));
        }
        for (int i = 0; i < 12; i++) {
            aq.addFisch(new Gelbfisch(r.nextInt(breite), r.nextInt(hoehe)));
        }
        for (int i = 0; i < 12; i++) {
            aq.addFisch(new Blaufisch(r.nextInt(breite), r.nextInt(hoehe)));
        }
        for (int i = 0; i < 8; i++) {
            aq.addFisch(new SlowFish(r.nextInt(breite), r.nextInt(hoehe)));
        }


        while (true) {
            aq.bewege();
            aq.zeichne();
            Thread.sleep(30);
        }

    }
}
