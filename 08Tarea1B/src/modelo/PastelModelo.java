package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import modelos.Circulo;
import modelos.Dibujable;

/**
 *
 * @author Handry Serrano Fabela
 */
public class PastelModelo extends Circulo implements Dibujable {

  private ArrayList<Integer> datos;
  private ArrayList<Color> colores;

  public PastelModelo() {
    this(new ArrayList<Integer>());
  }

  public PastelModelo(ArrayList<Integer> datos) {
    this.datos = datos;
    this.colores = new ArrayList<>();
    this.setColores();
  }

  public void setDatos(ArrayList<Integer> datos) {
    this.datos = datos;
    colores.clear();
    this.setColores();
  }
  
  public ArrayList<Integer> getDatos(){
    return datos;
  }

  public void setColores() {
    for (int i = 0; i < datos.size(); i++) {
      int red = (int) (Math.random() * 255);
      int green = (int) (Math.random() * 255);
      int blue = (int) (Math.random() * 255);
      colores.add(new Color(red, green, blue));
    }
  }

  public int getTotal() {
    int suma = 0;
    for (Integer valor : datos) {
      suma += valor;
    }
    return suma;
  }

  public void dibujarGrafica(Graphics g) {
    int resultado = getTotal();
    int anguloInicio = 0;
    int radio = super.getRadio();

    for (int i = 0; i < datos.size(); i++) {
      int angulo = (datos.get(i) * 360 / resultado);
      g.setColor(colores.get(i));
      g.fillArc(x - radio, y - radio, 2 * radio, 2 * radio, anguloInicio, angulo);
      anguloInicio += angulo;
    }
    if (anguloInicio != 360) {
      g.fillArc(x - radio, y - radio, 2 * radio, 2 * radio, anguloInicio, 360 - anguloInicio);
    }
  }

  @Override
  public void dibujar(Graphics g) {
    if (!datos.isEmpty()) {
      this.dibujarGrafica(g);
    }
  }
}
