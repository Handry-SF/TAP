/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author LENOVO
 */
class Modelo {
    private Vista vista;

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public void dibujarBandera(String pais) {
        if (pais.equals("Alemania")) {
            vista.dibujarBandera(Color.BLACK, Color.RED, Color.YELLOW);
        } else if (pais.equals("Italia")) {
            vista.dibujarBandera(Color.GREEN, Color.WHITE, Color.RED);
        } else if (pais.equals("Francia")) {
            vista.dibujarBandera(Color.BLUE, Color.WHITE, Color.RED);
        } else if (pais.equals("Bélgica")) {
            vista.dibujarBandera(Color.BLACK, Color.YELLOW, Color.RED);
        }
    }
}
