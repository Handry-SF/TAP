package modelo;

import java.awt.Color;

/**
 *
 * @author Handry Serrano Fabela
 */
public class TrianguloModelo {
    
    private int lado;
    private int x;
    private int y;
    private Color color;

    public TrianguloModelo(int x, int y, int lado, Color color) {
        
        this.x = x;
        this.y = y;
        this.lado = lado;
        this.color = color;

    }

    public TrianguloModelo() {

        this(0, 0, 210, Color.BLACK);

    }
    
    public double getArea() {

        double h = lado * Math.sin(Math.toRadians(60));
        return lado * h / 2;

    }

    public double getPerimetro() {
        
        return lado * 3;
        
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public void increaseLado() {
        lado += 5;
    }

    public void decreaseLado() {
        if (lado >= 10) {
            lado -= 5;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}