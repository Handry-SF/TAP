package vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import modelo.BarrasModelo;
import modelo.PastelModelo;

/**
 *
 * @author Handry Serrano Fabela
 */
public class PanelGraficasVista extends JPanel {

  public BarrasModelo modelo;

  public PanelGraficasVista(PastelModelo modelo1) {
    this.modelo = new BarrasModelo();
  }

  public PanelGraficasVista(BarrasModelo modelo) {
    this.modelo = modelo;
    setBackground(Color.GREEN);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int ancho = this.getWidth();
    int alto = this.getHeight();
    int minimo = Math.min(ancho, alto);

    if (modelo != null) {
      int tamano = modelo.getDatos().size();
      if (tamano > 0) {
        if (modelo.getGraficaPastel()) {
          g.translate(ancho / 2, alto / 2);
          modelo.setRadio(minimo / 2 - 30);
          modelo.x = 0;
          modelo.y = 0;
          modelo.dibujar(g);
        } else {
          int inicioCartecianoX = minimo / 10;
          int inicioCartecianoY = 9 * minimo / 10;
          g.translate(inicioCartecianoX, inicioCartecianoY);
          g.drawLine(0, alto - inicioCartecianoY, 0, -inicioCartecianoY);
          g.drawLine(-inicioCartecianoX, 0, ancho - inicioCartecianoX, 0);
          for (int i = 0; i < inicioCartecianoY; i++) {
            String escala = String.valueOf(i * 20);
            g.drawString(escala, -40, -20 * i);
            g.drawLine(-10, -20 * i, 10, -20 * i);
          }
          modelo.setDato((minimo - 50) / tamano);
          modelo.dibujar(g);
        }
      }
    }
  }
}