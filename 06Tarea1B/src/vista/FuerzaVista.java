package vista;

/**
 *
 * @author Handry Serrano Fabela
 */

import controlador.FuerzaControlador;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import modelo.FuerzaModelo;

public class FuerzaVista extends JPanel {

    private FuerzaControlador controlador;

    public FuerzaVista(FuerzaControlador controlador) {

        this.controlador = controlador;

    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        dibujaEjes(g);
        dibujaFuerzasCon(g);
        dibujarFuerzaRes(g);

    }

    public void dibujaEjes(Graphics g) {

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        g.setColor(Color.YELLOW);
        g.drawLine(centerX, 0, centerX, getHeight());
        g.drawLine(0, centerY, getWidth(), centerY);

    }

    public void dibujaFuerzasCon(Graphics g) {

        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;
        g.setColor(Color.BLACK);
        int x1 = centroX;
        int y1 = centroY;
        int x2 = (int) (x1 + controlador.getFuerzaCon1().getComponenteX());
        int y2 = (int) (y1 - controlador.getFuerzaCon1().getComponenteY());
        g.drawLine(x1, y1, x2, y2);

        x1 = centroX;
        y1 = centroY;
        x2 = (int) (x1 + controlador.getFuerzaCon2().getComponenteX());
        y2 = (int) (y1 - controlador.getFuerzaCon2().getComponenteY());
        g.drawLine(x1, y1, x2, y2);

    }

    public void dibujarFuerzaRes(Graphics g) {

        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;
        FuerzaModelo fuerzaResultante = controlador.calcularFuerzaResultante();
        g.setColor(Color.RED);
        int x1 = centroX;
        int y1 = centroY;
        int x2 = (int) (x1 + fuerzaResultante.getComponenteX());
        int y2 = (int) (y1 - fuerzaResultante.getComponenteY());
        g.drawLine(x1, y1, x2, y2);

    }
}
