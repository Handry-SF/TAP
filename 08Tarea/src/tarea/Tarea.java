package tarea;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.BorderFactory;

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
        Fuerza panel = new Fuerza();
        Fuerza borde = new Fuerza();
        borde.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        f.setTitle("Fuerza");
        f.setLocation(100, 100);
        f.setSize(800, 600);
        f.add(panel);
        f.getContentPane().add(borde);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
