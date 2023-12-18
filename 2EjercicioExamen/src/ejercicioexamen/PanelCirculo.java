package ejercicioexamen;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class PanelCirculo extends JPanel {

    public PanelCirculo() {

        this.setBackground(Color.CYAN);

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int ancho = getWidth();
        int alto = getHeight();
        int centerX = ancho / 2;
        int centerY = alto / 2;
        int radius = Math.min(ancho, alto) / 2;

        g.setColor(Color.BLUE);
        g.fillArc(centerX - radius, centerY - radius, radius * 2, radius * 2, 0, 120);

        g.setColor(Color.YELLOW);
        g.fillArc(centerX - radius, centerY - radius, radius * 2, radius * 2, 120, 120);

        g.setColor(Color.RED);
        g.fillArc(centerX - radius, centerY - radius, radius * 2, radius * 2, 240, 120);
        
    }
}
