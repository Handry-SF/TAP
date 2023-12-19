package tarea;

import controlador.TemperaturaControlador;
import javax.swing.JFrame;
import modelo.TemperaturaModelo;
import vista.TemperaturaVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TemperaturaModelo modelo = new TemperaturaModelo();
        TemperaturaVista vista = new TemperaturaVista();
        TemperaturaControlador oyente = new TemperaturaControlador(modelo, vista);
        vista.addEventos(oyente);
        JFrame f = new JFrame();
        f.setTitle("Convertidor De Temperaturas");
        f.setSize(800, 600);
        f.setLocation(100,100);
        f.add(vista); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
