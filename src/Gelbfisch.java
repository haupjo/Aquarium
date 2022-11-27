import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class Gelbfisch extends AbstractFisch {
    public Gelbfisch(int posX, int posY) {
        super(posX, posY);
    }

    @Override
    public void zeichne(EasyCanvas ec) {
        ec.setColor(Color.YELLOW);
        int x=getPosX();
        int y=getPosY();
        int[] xPositionen = {x,x-4,x-8,x-12,x-16,x-16,x-12,x-8,x-4,x};
        int[] yPositionen = {y,y-4,y-4,y-2,y-4,y+4,y+2,y+4,y+4,y};
        ec.fillPolygon(xPositionen,yPositionen,10);
    }
}


