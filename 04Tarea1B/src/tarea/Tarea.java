package tarea;

import controlador.GraficaControlador;
import javax.swing.JFrame;
import modelo.GraficaModelo;
import vista.GraficaVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GraficaModelo modelo = new GraficaModelo();
        GraficaVista vista = new GraficaVista(modelo);
        GraficaControlador oyente = new GraficaControlador(modelo, vista);
        vista.addEventos(oyente);
        JFrame f = new JFrame();
        f.setTitle("Grafica Pastel");
        f.setSize(400, 400);
        f.setLocation(100,100);
        f.add(vista); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
