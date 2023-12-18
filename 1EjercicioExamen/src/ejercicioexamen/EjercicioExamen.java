/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamen;

import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class EjercicioExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame f = new JFrame();
        VentanaDatos panel = new VentanaDatos();
        f.setTitle("Problema 1");
        f.setContentPane(panel);
        f.setLocation(100, 100);
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }

}
