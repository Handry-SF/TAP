package primeraventana;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Handry Serrano Fabela
 */
public class PrimeraVentana {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    JFrame f = new JFrame();
    f.setTitle("Primera Ventana");
    f.setLocation(100,100);
    f.setSize(800,600);
    f.getContentPane().setBackground(new Color(120,10,80));
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    
  }
  
}
