package modelos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author LENOVO
 */

public class Pentagono extends Figura {
    
    private int lados;

    public Pentagono(int x, int y, int lados, Color color) {

        super(x,y,color);
        this.lados = lados;

    }

    public Pentagono() {

        this(0, 0, 0, Color.GREEN);

    }

    @Override
    public double getArea() {
    
        return (5*Math.pow(lados,2) * Math.tan(Math.toRadians(36)));
    }

    @Override
    public double getPerimetro() {
     
        return lados * 5;
        
    }

    @Override
    public void dibujar(Graphics g) {
        
        double apotema = 0.5*lados*Math.tan(Math.toRadians(36));
        int[] cX = {(int)(x + lados / 2), (int)(x + lados), (int)(x + lados / 2), x, (int)(x - lados / 2)};
        int[] cY = {(int)(y - apotema), y, (int)(y + apotema), (int)(y + apotema), (int)(y - apotema)};
        g.setColor(color);
        g.fillPolygon(cX, cY, 5);
        g.setColor(Color.BLACK);
        g.drawPolygon(cX, cY, 5);

    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
    
}
