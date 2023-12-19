package tarea;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Handry Serrano Fabela
 */
public class CirculosConcentricos extends JPanel {
    
    private int numeroCirculos;

    public CirculosConcentricos(int numCirculos) {
        this.numeroCirculos = numCirculos;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        for (int i = 0; i < numeroCirculos; i++) {
            int radio = i * 10;
            int diametro = radio * 2;
            int x = centerX - radio;
            int y = centerY - radio;

            g.drawOval(x, y, diametro, diametro);
        }
    }
}
