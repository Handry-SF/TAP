package contextografico;

import static java.awt.Color.*;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Handry Serrano Fabela
 */
public class PanelPrimitivas extends JPanel{
  
  public PanelPrimitivas() {
    
   setBackground(CYAN);
 
  }
  
  @Override
  public void paintComponent(Graphics g) {
    
    super.paintComponent(g);
    int ancho = this.getWidth();
    int alto = this.getHeight();
    System.out.println("[" + ancho + "," + alto + "]");
    
    // DIBUJAR UNA LINEA
    g.setColor(RED);
    g.drawLine(5, 30, 380, 30); // (x1,y1) -> (x2,y2)
    //g.setColor(Color.BLUE);
    g.drawLine(0, 0, ancho, alto);
    g.drawLine(0, alto, ancho, 0);

    //Rectángulos
    g.setColor(BLUE);
    g.drawRect(5, 60, 90, 55);
    g.fillRect(100, 60, 90, 55);
    g.setColor(BLACK);
    g.drawRect(100, 60, 90, 55);

    // Dos elipses
    g.setColor(MAGENTA);
    g.drawOval(195, 150, 90, 55);
    g.fillOval(290, 150, 90, 55);

    //Rectángulo con esquinas redondeadas
    g.setColor(ORANGE);
    g.fillRoundRect(195, 60, 90, 55, 50, 50);
    g.drawRoundRect(290, 60, 90, 55, 20, 20);

    //Con 3D
    g.setColor(YELLOW);
    g.draw3DRect(5, 150, 90, 55, true);
    g.fill3DRect(100, 150, 90, 55, true);

  }
  
}
