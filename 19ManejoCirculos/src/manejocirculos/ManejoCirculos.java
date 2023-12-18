package manejocirculos;

import java.awt.Color;
import javax.swing.JFrame;
import modelos.Circulo;
import modelos.Circulos;
import vistas.PanelDibujable;

/**
 *
 * @author LENOVO
 */
public class ManejoCirculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Circulos circulos = new Circulos();                                     //Modelo
        circulos.add(new Circulo(300,400,50,Color.BLUE));
        PanelDibujable panel = new PanelDibujable(circulos);              //Vista
        OyenteCirculos oyente = new OyenteCirculos(circulos, panel);            //Control
        panel.addEventos(oyente);                                               //Registro
        JFrame f = new JFrame();
        f.setTitle("Manejo De Circulos");
        f.setSize(800, 600);
        f.setLocation(100,100);
        f.add(panel);                                                       //Add 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
