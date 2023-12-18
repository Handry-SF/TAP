package simbolo;

import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class Simbolo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    JFrame f = new JFrame("Simbolo");
    PanelSimbolo panel = new PanelSimbolo();
    f.setSize(800,600);
    f.setLocation(100,100);
    f.add(panel);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    
  }
  
}
