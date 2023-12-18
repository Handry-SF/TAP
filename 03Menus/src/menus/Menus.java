package menus;

import javax.swing.JFrame;
import util.Ambiente;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Menus {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Ambiente.setAmbiente("Nimbus");
    JFrame f = new JFrame("Ventana con barra de menús");
    BarraMenu barra = new BarraMenu();
    f.setSize(800,600);
    f.setLocation(100,100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setJMenuBar(barra);
    f.setVisible(true);
    
  }
  
}
