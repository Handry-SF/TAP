package tarea;

import controlador.CirculoControlador;
import java.awt.Color;
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
        
        CirculoModelo modelo = new CirculoModelo(0, 0, (int) (50 + Math.random() * 201), Color.black);
        CirculoVista vista = new CirculoVista(modelo);
        CirculoControlador oyente = new CirculoControlador(modelo, vista);
        vista.addEventos(oyente);
        JFrame f = new JFrame();
        f.setTitle("Circulo Radio Aleatorio");
        f.setSize(800, 600);
        f.setLocation(100,100);
        f.add(vista); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
