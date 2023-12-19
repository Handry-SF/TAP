package tarea;

import controlador.TrianguloControlador;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.CirculoModelo;
import modelo.TrianguloModelo;
import vista.TrianguloVista;

/**
 *
 * @author LENOVO
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CirculoModelo circulo = new CirculoModelo();
        TrianguloModelo triangulo = new TrianguloModelo();
        TrianguloVista vista = new TrianguloVista(circulo, triangulo);
        TrianguloControlador oyente = new TrianguloControlador(circulo, triangulo ,vista);
        //vista.addEventos((ActionListener) oyente);
        JFrame f = new JFrame();
        f.setTitle("Circulo Y Triangulo");
        f.setSize(800, 600);
        f.setLocation(100,100);
        f.add(vista); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
