package chat;

/**
 *
 * @author LENOVO
 */
public class Chat {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    VentanaChat f = new VentanaChat();
    PanelChat panel = new PanelChat();
    f.setSize(800,600);
    f.setContentPane(panel);
    f.setLocation(100,100);
    f.setVisible(true);
    
  }
  
}
