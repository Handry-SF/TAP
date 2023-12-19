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
        VentanaComponentes panel = new VentanaComponentes();
        f.setTitle("Aling");
        f.setContentPane(panel);
        f.setLocation(100, 100);
        f.setSize(450, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
