package tarea;

import controlador.CirculoControlador;
import javax.swing.JFrame;
import modelo.CirculoModelo;
import vista.CirculoVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CirculoModelo modelo = new CirculoModelo();
        CirculoVista vista = new CirculoVista(modelo);
        CirculoControlador controlador = new CirculoControlador(modelo, vista);
        JFrame f = new JFrame("Círculo Con Movimiento");
        f.setSize(950, 650);
        f.setLocation(100,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(vista);
        f.setVisible(true);
        
    }
}