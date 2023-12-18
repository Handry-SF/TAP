package Examen;

import static java.awt.Color.*;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Barradas Cortes Abraham
 */
public class PanelDibujo extends JPanel {

    private int lados;
    private int radio = 300;

    public PanelDibujo() {
        setBackground(CYAN);
    }

    @Override
    public void paintComponent(Graphics g) { //metodo para poder dibujar 
        super.paintComponent(g);
        int ancho = this.getWidth();
        int alto = this.getHeight();
        g.translate(ancho / 2, alto / 2);
        g.drawOval(-radio, -radio, 2 * radio, 2 * radio);
        if (lados > 2) {
            double angulo = 2 * Math.PI / lados;
            int[] x = new int[lados];
            int[] y = new int[lados];
            for (int i = 0; i < lados; i++) {
                x[i] = (int) (radio * Math.cos(angulo * i));
                y[i] = (int) (radio * Math.sin(angulo * i));
            }
            g.fillPolygon(x, y, lados);
        }
    }

    /**
     * @return the lados
     */
    public int getLados() {
        return lados;
    }

    /**
     * @param lados the lados to set
     */
    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    
    
}
