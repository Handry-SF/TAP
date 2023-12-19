package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelo.CirculoModelo;
import vista.CirculoVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class CirculoControlador extends MouseAdapter{
    
    private CirculoModelo modelo;
    private CirculoVista vista;

    public CirculoControlador(CirculoModelo modelo, CirculoVista vista) {
        
        this.modelo = modelo;
        this.vista = vista;
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        modelo.setRadio((int) (10 + Math.random() * 51));
        vista.repaint();
        
    }
    
}
