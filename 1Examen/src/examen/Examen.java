package examen;

import javax.swing.JFrame;

/**
 *
 * @author Serrano Fabela Handry
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Desglose de monedas y billetes");
        PanelExamen vista = new PanelExamen();
        OyenteExamen oyente = new OyenteExamen(vista);
        vista.addEventos(oyente);
        f.setSize(600, 400);
        f.setLocation(100, 100);
        f.add(vista);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
