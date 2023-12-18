package animacion;

import javax.swing.JFrame;
import modelos.Imagenes;

/**
 *
 * @author LENOVO
 */
public class Animacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Imagenes modelo = new Imagenes("dancing");
        PanelAnimacion panel = new PanelAnimacion(modelo);
        OyenteAnimacion oyente = new OyenteAnimacion(modelo, panel);
        panel.addEventos(oyente);
        JFrame f = new JFrame("Animacion");
        f.setSize(800,600);
        f.setLocation(100,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(panel);
        f.setVisible(true);
        
    }
    
}
