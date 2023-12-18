package paneles;

import javax.swing.JFrame;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Paneles {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    JFrame f = new JFrame("Ventana con Paneles");
    BarraConImagenes barra = new BarraConImagenes();
    PanelMezclado panel = new PanelMezclado();
    f.setSize(800,600);
    f.setLocation(100,100);
    f.setJMenuBar(barra);
    f.setContentPane(panel);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    
  }
  
}
