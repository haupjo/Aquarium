import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class Rotfisch extends AbstractFisch{
    public Rotfisch(int posX, int posY) {
        super(posX, posY);
    }

    @Override
    public void zeichne(EasyCanvas ec){
        ec.setColor(Color.RED);
        int x=getPosX();
        int y=getPosY();
        int[] xPositionen = {x,x-2,x-4,x-6,x-8,x-8,x-6,x-4,x-2,x};
        int[] yPositionen = {y,y-2,y-2,y-1,y-2,y+2,y+1,y+2,y+2,y};
        ec.fillPolygon(xPositionen,yPositionen,10);
    }
}
