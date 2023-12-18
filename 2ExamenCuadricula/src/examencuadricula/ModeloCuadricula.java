package examencuadricula;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Barradas Cortés Abraham
 */
public class ModeloCuadricula extends JPanel {

    private int filas;
    private int columnas;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujar(g);
    }

    public void dibujar(Graphics g) {
        if (filas != 0 && columnas != 0) {
            int ancho = getWidth();
            int alto = getHeight();
            int dx = ancho / columnas;
            for (int i = 0; i < columnas; i++) {
                g.drawLine(i * dx, 0, i * dx, alto);
            }
            int dy = alto / filas;
            for (int i = 0; i < filas; i++) {
                g.drawLine(0, i * dy, ancho, i * dy);
            }
        }
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
}
