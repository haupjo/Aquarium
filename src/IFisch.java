import de.hsulm.sote2.ecanvas.EasyCanvas;

public interface IFisch {
    public void bewege();

    public int getPosX();

    public int getPosY();

    public void setPosX(int x);

    public void setPosY(int y);

    public void zeichne(EasyCanvas ec);

}
