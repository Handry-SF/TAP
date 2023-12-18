package eventoraton;

import java.awt.Color;
import javax.swing.JFrame;
import modelos.Circulo;
import modelos.Figura;
import vistas.PanelDibujable;

/**
 *
 * @author LENOVO
 */
public class EventoRaton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo modelo = new Circulo(300, 350, 50, Color.BLUE);  //Modelo
        PanelDibujable panel = new PanelDibujable(modelo);                      //Vista
        OyenteRaton oyente = new OyenteRaton(modelo, panel);               //Control
        panel.addEventos(oyente);                                               //Registro
        JFrame f = new JFrame();
        f.setTitle("Eventos De Raton");
        f.setSize(800, 600);
        f.setLocation(100,100);
        f.add(panel); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
