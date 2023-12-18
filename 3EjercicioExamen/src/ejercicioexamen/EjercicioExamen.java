/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamen;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author LENOVO
 */
public class EjercicioExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VentanaCuadros f = new VentanaCuadros();
        Cuadros panel = new Cuadros();
        f.setSize(500,500);
        f.setLocation(100,100);
        panel.setPreferredSize(new Dimension(500, 500));
        Border border = BorderFactory.createLineBorder(Color.BLACK, 15);
        panel.setBorder(border);
        f.add(panel);
        f.setVisible(true);
        
    }
    
}
