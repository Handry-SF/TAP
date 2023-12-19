package vista;

import controlador.FuerzaControlador;
import modelo.FuerzaModelo;
import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 *
 * @author Handry Serrano Fabela
 */

public class FuerzaVista extends JPanel {
    private FuerzaControlador controlador;

    public FuerzaVista(FuerzaControlador controlador) {
        this.controlador = controlador;
        
        setLayout(new BorderLayout());
        JMenuBar menuBar = new JMenuBar();
        JMenu archivoMenu = new JMenu("Archivo");
        menuBar.add(archivoMenu);
        add(menuBar, BorderLayout.NORTH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujaEjes(g);
        dibujaFuerzasCon(g);
        dibujaFuerzaRes(g);
    }

    public void dibujaEjes(Graphics g) {
        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;
        g.setColor(Color.YELLOW);
        g.drawLine(centroX, 0, centroX, getHeight()); 
        g.drawLine(0, centroY, getWidth(), centroY); 
    }

    public void dibujaFuerzasCon(Graphics g) {
        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;
        g.setColor(Color.BLACK);

        List<FuerzaModelo> fuerzas = controlador.getFuerzasCon();
        for (FuerzaModelo fuerza : fuerzas) {
            int x1 = centroX;
            int y1 = centroY;
            int x2 = (int) (x1 + fuerza.getComponenteX());
            int y2 = (int) (y1 - fuerza.getComponenteY());
            g.drawLine(x1, y1, x2, y2);
        }
    }

    public void dibujaFuerzaRes(Graphics g) {
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

