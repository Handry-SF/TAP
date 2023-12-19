package tarea;

import controlador.BarraPastelControl;
import javax.swing.JFrame;
import modelo.BarrasModelo;
import vista.VentanaBarraVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BarrasModelo modelo = new BarrasModelo();
        VentanaBarraVista vista = new VentanaBarraVista(modelo);
        BarraPastelControl oyente = new BarraPastelControl(modelo, vista);
        vista.addEventos(oyente);
        vista.setTitle("Grafica De Barras Y Grafica De Pastel");
        vista.setSize(600, 600);
        vista.setLocation(100, 100);
        vista.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        vista.setVisible(true);

    }

}
