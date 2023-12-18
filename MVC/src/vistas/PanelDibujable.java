package vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;
import modelos.Circulo;
import modelos.Dibujable;

/**
 *
 * @author LENOVO
 */
public class PanelDibujable extends JPanel {
    
    private Dibujable modelo;
    private Circulo circulo;
    
    public PanelDibujable(Dibujable modelo) {
    
        this.modelo = modelo;
        this.setBackground(Color.CYAN);
    
    }
    
    public void addEventos(KeyAdapter oyente) {
    
        this.addKeyListener(oyente);
        this.setFocusable(true);
    
    }
    
    public void addEventos(MouseAdapter oyente) {
    
        this.addMouseListener(oyente);
        this.addMouseMotionListener(oyente);
        this.addMouseWheelListener(oyente);
    
    }
    
    /*
    * Constructo sin argumentos, para que el panel 
    * se pueda colocar en la paleta de componentes
    */
    public PanelDibujable() {
    
        this(null);
    
    }
    
    @Override
    public void paintComponent(Graphics g) {
    
        super.paintComponent(g);
        modelo.dibujar(g);
        g.drawString(modelo.toString(), 10, this.getHeight()-10);
        Point puntero = this.getMousePosition();
        if(puntero!=null) {
        
            g.drawString("("+puntero.x+","+puntero.y+")", this.getWidth()-70, this.getHeight()-10);
        
        }
        
    }
    
}
