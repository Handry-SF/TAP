package contextografico;

import javax.swing.JFrame;

/**
 *
 * @author Handry Serrano Fabela
 */
public class ContextoGrafico {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   
    JFrame f =new JFrame("Contexto Gráfico");
    PanelContextoGrafico panel = new PanelContextoGrafico();
    f.setSize(800,600);
    f.setLocation(100,100);
    f.setContentPane(panel);    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    
  }
  
}
