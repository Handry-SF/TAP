package tarea;

import controlador.FuerzaControlador;
import javax.swing.JFrame;
import vista.FuerzaVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FuerzaControlador controlador = new FuerzaControlador();
        FuerzaVista vista = new FuerzaVista(controlador);
        JFrame f = new JFrame("Primera Condición De Equilibrio");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(vista);
        f.setSize(700, 700);
        f.setLocation(50,50);
        f.setVisible(true);
        
    }
    
}
