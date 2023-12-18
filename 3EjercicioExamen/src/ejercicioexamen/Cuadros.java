package ejercicioexamen;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class Cuadros extends JPanel{
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(65, 35, 10, 10);
        g.fillRect(65, 55, 10, 10);
        g.fillRect(135, 0, 10, 85);
        g.fillRect(225, 100, 10, 10);
        g.fillRect(225, 120, 10, 10);
        g.fillRect(225, 140, 10, 10);
        g.fillRect(225, 160, 10, 10);
        g.setColor(Color.GRAY);
        g.fillRect(135, 300, 10, 10);
        g.fillRect(175, 335, 10, 10);
        g.fillRect(225, 370, 10, 10);
        
     }   
    
}
