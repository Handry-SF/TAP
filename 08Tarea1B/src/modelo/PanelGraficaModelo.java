package modelo;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Handry Serrano Fabela
 */
public class PanelGraficaModelo extends JPanel {

  private PastelModelo grafica;

  public PanelGraficaModelo() {
    this.grafica = new PastelModelo();
  }

  public PanelGraficaModelo(PastelModelo grafica) {
    this.grafica = grafica;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int ancho = this.getWidth();
    int alto = this.getHeight();
    int min = Math.min(ancho / 2, alto / 2);
    if (grafica != null) {
      int tamaño = grafica.getDatos().size();
      if (tamaño > 0) {
        g.translate(ancho / 2, alto / 2);
        grafica.setRadio(min -50);
        grafica.x = 0;
        grafica.y = 0;
        grafica.dibujar(g);
      }
    }
  }
}
