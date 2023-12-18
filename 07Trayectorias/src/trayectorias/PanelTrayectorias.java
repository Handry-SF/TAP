package trayectorias;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;
import modelos.Planetas;

/**
 *
 * @author LENOVO
 */
public class PanelTrayectorias extends JPanel {

    private Planetas planetas;
    
    public PanelTrayectorias(Planetas modelo) {
        this.planetas = modelo;
        this.setBackground(Color.BLACK);
    }
    
    public void addEventos(MouseAdapter oyente) {
    
        this.addMouseListener(oyente);
    
    }
    
    @Override
    public void paintComponent(Graphics g) {
    
        super.paintComponent(g);
        g.translate(this.getWidth()/2, this.getHeight()/2);
        planetas.dibujar(g);
    
    }
    
}
