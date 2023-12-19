package controlador;

import modelo.CirculoModelo;
import modelo.TrianguloModelo;
import vista.TrianguloVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class TrianguloControlador {
    
    private CirculoModelo circulo;
    private TrianguloModelo triangulo;
    private TrianguloVista vista;

    public TrianguloControlador(CirculoModelo circulo, TrianguloModelo triangulo, TrianguloVista vista) {
        
        this.circulo = circulo;
        this.triangulo = triangulo;
        this.vista = vista;
        
    }   
}