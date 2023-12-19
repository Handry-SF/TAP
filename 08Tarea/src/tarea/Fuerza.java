package tarea;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Fuerza extends JPanel {
    
    public Fuerza() {
    setBackground(Color.WHITE);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int coordenadaX = getWidth();
    int coordenadaY = getHeight();
    int medioX = coordenadaX / 2;
    int medioY = coordenadaY / 2;

    g.setColor(Color.BLACK);
    g.fillRect(80, 40, 2, coordenadaY - 90);
    g.fillRect(20, coordenadaY - 120, coordenadaX - 250, 2);
    g.drawLine(80, coordenadaY - 120, medioX, medioY - 110);

    int punteoX = medioX;
    int punteoY = medioY - 110;

    for (int horizontalX = 80; horizontalX < punteoX; horizontalX += 20) {
      g.drawLine(horizontalX, punteoY, horizontalX + 10, punteoY);
    }
    
    for (int verticalY = coordenadaY - 120; verticalY > punteoY; verticalY -= 20) {
      g.drawLine(punteoX, verticalY, punteoX, verticalY - 10);
    }

    int[] flechaSupX = {80, 90, 70};
    int[] flechaSupY = {35, 60, 60};
    g.fillPolygon(flechaSupX, flechaSupY, flechaSupX.length);
    
    int[] flechaInfX = {coordenadaX - 230, coordenadaX - 210, coordenadaX - 230};
    int[] flechaInfY = {coordenadaY - 110, coordenadaY - 120, coordenadaY - 130};
    g.fillPolygon(flechaInfX, flechaInfY, flechaInfX.length);
    
    int[] flechaNegroX = {medioX - 30, medioX, medioX - 15};
    int[] flechaNegroY = {medioY - 100, medioY - 110, medioY - 80};
    g.fillPolygon(flechaNegroX, flechaNegroY, flechaNegroX.length);

    Font texto = new Font("Arial", Font.BOLD, 25);
    g.setFont(texto);
    g.drawString("F", 150, coordenadaY - 230);
    g.drawString("θ", 190, coordenadaY - 150);
    g.drawString("Fy = F sen θ", medioX + 10, medioY + 50);
    g.drawString("Fx = F cos θ", medioX / 4, coordenadaY - 50);

    g.drawArc(90, coordenadaY - 170, 100, 100, 0, 90);

    g.setColor(Color.RED);
    g.fillRect(80, medioY - 100, 2, coordenadaY - 120 - (medioY - 100));
    g.fillRect(80, coordenadaY - 120, medioX - 80, 2);

    int[] flechaSupRojoX = {80, 90, 70};
    int[] flechaSupRojoY = {medioY - 110, medioY - 80, medioY - 80};
    g.fillPolygon(flechaSupRojoX, flechaSupRojoY, flechaSupRojoX.length);
    
    int[] flechaInfRojoX = {medioX - 30, medioX, medioX - 30};
    int[] flechaInfRojoY = {coordenadaY - 110, coordenadaY - 120, coordenadaY - 130};
    g.fillPolygon(flechaInfRojoX, flechaInfRojoY, flechaInfRojoX.length);

  } 
}