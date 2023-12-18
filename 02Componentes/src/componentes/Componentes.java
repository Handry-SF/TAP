package componentes;

import javax.swing.JFrame;
import util.Ambiente;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Componentes {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Ambiente.setAmbiente("Nimbus");
    JFrame f = new JFrame("Componentes Gráficos");
    PanelComponentes panel = new PanelComponentes();
    f.setLocation(100,100);
    f.setSize(800,600);
    //f.setContentPane(panel);
    f.add(panel); //En un JFrame es lo mismo setContentPane y add
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    
  }
  
}
