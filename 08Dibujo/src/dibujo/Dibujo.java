package dibujo;

import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class Dibujo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame f = new JFrame("Dibujo");
        PanelDibujoo panel = new PanelDibujoo();
        f.setSize(800, 600);
        f.setLocation(100, 100);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

}
