package examen;

import java.awt.Color;
import javax.swing.JFrame;
import modelos.Circulo;
import modelos.Figura;
import vistas.PanelDibujable;

/**
 *
 * @author LENOVO
 */
public class EventoTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Figura circulo = new Circulo(300,350, 20, Color.BLACK);   //MODELO
        PanelDibujable panel = new PanelDibujable(circulo);               //VISTA
        OyenteTeclado oyente = new OyenteTeclado(circulo, panel);    //CONTROLADOR
        panel.addEventos(oyente);                                               //Adicionar Oyente
        JFrame f = new JFrame();
        f.setTitle("Eventos De Teclado");
        f.setSize(800, 600);
        f.setLocation(100,100);
        f.add(panel);                                                       //Adicionar Panel
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }

}
