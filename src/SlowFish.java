import de.hsulm.sote2.ecanvas.EasyCanvas;

import java.awt.*;

public class SlowFish implements IFisch {
    private double posX;
    private double posY;

    public SlowFish(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public int getPosX() {
        return (int) posX;
    }

    @Override
    public int getPosY() {
        return (int) posY;
    }

    @Override
    public void setPosX(int x) {
    this.posX=x;
    }

    @Override
    public void setPosY(int y) {
    this.posY=y;
    }

    @Override
    public void bewege() {
        this.posX+=0.4;
    }

    @Override
    public void zeichne(EasyCanvas ec) {
    ec.setColor(Color.PINK);
        int x=getPosX();
        int y=getPosY();
        int[] xPositionen = {x,x-8,x-16,x-24,x-32,x-32,x-24,x-16,x-8,x};
        int[] yPositionen = {y,y-8,y-8,y-4,y-8,y+8,y+4,y+8,y+8,y};
        ec.fillPolygon(xPositionen,yPositionen,10);
    }
}
