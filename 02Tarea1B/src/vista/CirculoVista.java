package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;
import modelo.CirculoModelo;

/**
 *
 * @author Handry Serrano Fabela
 */
public class CirculoVista extends JPanel {

    private final CirculoModelo modelo;

    public CirculoVista() {
        
        modelo = new CirculoModelo();
        
    }

    public CirculoVista(CirculoModelo modelo) {
        
        this.modelo = modelo;
        setBackground(Color.GREEN);
        
    }

    public void addEventos(MouseAdapter oyente) {
        
        this.addMouseListener(oyente);
        
    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        int ancho = getWidth();
        int alto = getHeight();
        g.translate(ancho / 2, alto / 2);
        modelo.dibujar(g);
        
        String area = String.format("Area: %.2f", modelo.getArea());
        String radio = "Radio: " + modelo.getRadio();
        String diametro = String.format("Diametro: %.2f", modelo.getDiametro());
        String circunferencia = String.format("Circunferencia: %.2f", modelo.getCircunferencia());
        
        g.drawString(area, ancho / 2 - 150, alto / 2 - 90);
        g.drawString(radio, ancho / 2 - 150, alto / 2 - 70);
        g.drawString(diametro, ancho / 2 - 150, alto / 2 - 50);
        g.drawString(circunferencia, ancho / 2 - 150, alto / 2 - 30);
        
    }
}
