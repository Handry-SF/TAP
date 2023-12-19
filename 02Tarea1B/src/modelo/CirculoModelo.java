package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import modelos.Dibujable;
import modelos.Figura;

/**
 *
 * @author Handry Serrano Fabela
 */
public class CirculoModelo extends Figura implements Dibujable {

    private int radio;
    private Color color;

    public CirculoModelo(int x, int y, int radio, Color color) {
        
        super(x, y, color);
        this.radio = radio;
        
    }

    public CirculoModelo() {
        
        this(0, 0, 0, Color.CYAN);
        
    }

    public boolean contiene(int pX, int pY) {
        
        return (distance(pX, pY) <= radio);
        
    }

    public boolean contiene(Point p) {
        
        return contiene(p.x, p.y);
        
    }

    @Override
    public void dibujar(Graphics g) {
        
        g.setColor(color);
        g.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);
        g.setColor(Color.BLACK);
        g.drawOval(x - radio, y - radio, 2 * radio, 2 * radio);
        
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public double getDiametro() {
        return 2 * radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 0;
    }
}