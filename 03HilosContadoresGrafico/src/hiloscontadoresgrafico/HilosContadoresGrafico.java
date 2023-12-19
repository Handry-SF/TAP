package hiloscontadoresgrafico;

import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class HilosContadoresGrafico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PanelContador panel = new PanelContador();
        OyenteContador oyente = new OyenteContador(panel);
        panel.addEventos(oyente);
        JFrame f = new JFrame("Contadores");
        f.setSize(400,600);
        f.setLocation(100,100);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
