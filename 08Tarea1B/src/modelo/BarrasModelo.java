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
public class BarrasModelo extends Circulo implements Dibujable {

    private ArrayList<Integer> datos;
    private ArrayList<Color> colores;
    private int dato;
    private boolean estadoPastel;

    public BarrasModelo() {
        this(new ArrayList<Integer>());
    }

    public BarrasModelo(ArrayList<Integer> datos) {
        this.datos = datos;
        this.colores = new ArrayList<>();
        this.setColores();
    }

    public void setDatos(ArrayList<Integer> datos) {
        this.datos = datos;
        colores.clear();
        this.setColores();
    }

    public ArrayList<Integer> getDatos() {
        return datos;
    }

    public void SetGraficaPastel(boolean estado) {
        this.estadoPastel = estado;
    }

    public boolean getGraficaPastel() {
        return this.estadoPastel;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return this.dato;
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

    public void dibujarGraficaPastel(Graphics g) {
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

    public void dibujarGraficaBarra(Graphics g) {
        for (int i = 0; i < datos.size(); i++) {
            int numero = datos.get(i);
            g.setColor(colores.get(i));
            g.fillRect(dato * i, -datos.get(i), dato, numero);
            g.setColor(Color.BLACK);
            g.drawRect(dato * i, -datos.get(i), dato, numero);
            String datosbarra = String.valueOf(numero);
            g.drawString(datosbarra, dato * i + (dato / 3) + 10, 25);
        }
    }

    @Override
    public void dibujar(Graphics g) {
        if (!datos.isEmpty()) {
            if (estadoPastel) {
                this.dibujarGraficaPastel(g);
            } else {
                this.dibujarGraficaBarra(g);
            }
        }
    }
}
