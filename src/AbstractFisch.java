import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class AbstractFisch implements IFisch {
    private int posX;
    private int posY;

    public AbstractFisch(int posX,int posY) {
        this.posX=posX;
        this.posY=posY;

    }
    @Override
    public void bewege(){
        this.posX+=1;
    }

    @Override
    public int getPosX() {
        return posX;
    }

    @Override
    public void setPosX(int posX) {
        this.posX = posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }

    @Override
    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public void zeichne(EasyCanvas ec) {
        ec.setColor(Color.green);
        ec.fillRect(posX,posY,4,4);
    }
}
