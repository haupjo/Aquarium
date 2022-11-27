import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private int breite;
    private int hoehe;
    private EasyCanvas ec;
    private List<IFisch> fische;

    public Aquarium(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
        ec = new EasyCanvas(this.breite, this.hoehe);
        ec.show();
        this.fische = new ArrayList<>();
    }

    public void addFisch(IFisch fisch) {
        this.fische.add(fisch);
    }

    public void zeichne() {
        ec.clear();
        for (IFisch fisch : fische) {
            fisch.zeichne(this.ec);
        }
    }

    public void bewege() {
        for (IFisch fisch : fische) {
            fisch.bewege();
            if (fisch.getPosX() > this.breite) {
                fisch.setPosX(0);
            }else if (fisch.getPosX() < 0){
                    fisch.setPosX(this.breite);
            }
        }
    }
}
