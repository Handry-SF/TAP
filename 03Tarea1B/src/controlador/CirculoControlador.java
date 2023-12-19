package controlador;

import modelo.CirculoModelo;
import vista.CirculoVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class CirculoControlador {
    
    private CirculoModelo modelo;
    private CirculoVista vista;

    public CirculoControlador(CirculoModelo modelo, CirculoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
}