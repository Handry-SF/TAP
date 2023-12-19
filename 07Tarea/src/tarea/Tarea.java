package tarea;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        DibujoCuarto panel = new DibujoCuarto();
        panel.setBackground(new Color(255,121,135));
        f.setTitle("Dibujo Cuarto");
        f.setLocation(100, 100);
        f.setSize(810, 600);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    
    }
    
}
