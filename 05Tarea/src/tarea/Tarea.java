package tarea;

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
        CirculosConcentricos panel = new CirculosConcentricos(8);
        f.setTitle("Circulos Concentricos");
        f.setLocation(100, 100);
        f.setSize(400, 400);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
