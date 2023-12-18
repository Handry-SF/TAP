package ejercicioexamen;

import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class EjercicioExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Dibujo");
        PanelCirculo panel = new PanelCirculo();
        f.setSize(800, 600);
        f.setLocation(100, 100);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}
