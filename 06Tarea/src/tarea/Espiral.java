package tarea;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Espiral extends JPanel{
    
    private int puntoN;
    private int[] puntoX;
    private int[] puntoY;

    public Espiral() {
        
        puntoX = new int[360];
        puntoY = new int[360];
        puntoN = 0;

        int angulo = 360 * 3;
        int radio = 0;
        
        while (angulo>0) {
            
            int coordenadaX = (int) (Math.cos(Math.toRadians(angulo)) * radio);
            int coordenadaY = (int) (Math.sin(Math.toRadians(angulo)) * radio);
            coordenadaX *= -1;
            puntoX[puntoN] = coordenadaX;
            puntoY[puntoN] = coordenadaY;
            puntoN++;
            radio += 6;
            angulo -= 45;
            
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;
        g.translate(centroX, centroY);
        g.drawPolyline(puntoX, puntoY, puntoN);
        
    }
}