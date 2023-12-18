package contextografico;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Handry Serrano Fabela
 */
public class PanelLetras extends JPanel{
  
  public PanelLetras() {
   this.setBackground(Color.WHITE);
 }
  
  @Override
  public void paintComponent(Graphics g) {
    
   super.paintComponent(g);
   g.setColor(Color.BLUE);
   g.drawString("Mensaje en azul", 20, 20);
   g.setColor(new Color(100, 100, 0));
   g.drawString("Mensaje en otro color", 400, 20);
   System.out.println(g.getFont().getFontName());
   System.out.println(g.getFont().getSize());

   Font f1 = new Font("Times New Roman", Font.BOLD, 24);
   g.setFont(f1);
   g.setColor(Color.RED);
   g.drawString("Mensaje en Times New Roman", 20, 450);
   System.out.println(g.getFont().getSize());
   System.out.println(g.getFont().getFontName());

   Font f2 = new Font("New Courier", Font.BOLD | Font.ITALIC, 18);
   g.setFont(f2);
   g.setColor(Color.MAGENTA);
   g.drawString("Mensaje en Courier", 400, 450);
   System.out.println(g.getFont().getSize());

   // imagen
   String nombre = "/imagenes/America.jpg";
   ImageIcon img = new ImageIcon(getClass().getResource(nombre));
   Image imagen = img.getImage();

   int anchoPanel = this.getWidth();
   int altoPanel = this.getHeight();
   int anchoImagen = imagen.getWidth(this);
   int altoImagen = imagen.getHeight(this);
   int xC = anchoPanel / 2;
   int yC = altoPanel / 2;
   int x = xC - anchoImagen / 2;
   int y = yC - altoImagen / 2;

   //g.drawImage(imagen, x, y, this);

   g.drawImage(imagen, 0, 0, anchoPanel,altoPanel,this);

 }
  
}
