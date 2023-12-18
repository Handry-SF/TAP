package examen;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import modelos.Figura;
import static java.awt.event.KeyEvent.*;
import modelos.Circulo;
import vistas.PanelDibujable;

/**
 *
 * @author LENOVO
 */
public class OyenteTeclado extends KeyAdapter{
    
    private Figura modelo;
    private PanelDibujable vista;
    
    public OyenteTeclado(Figura modelo, PanelDibujable vista) {
    
        this.modelo = modelo;
        this.vista = vista;
    
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
    
        int codigo = e.getKeyCode();
        int inc = 5;
        Circulo circulo = (Circulo)modelo;
        int radio = circulo.getRadio();
        switch(codigo) {
            
            case VK_A -> {
            
                modelo.setColor(Color.BLUE);
                vista.repaint();
            
            }
            
            case VK_V -> {
            
                modelo.setColor(Color.GREEN);
                vista.repaint();
            
            }
            
            case VK_R -> {
            
                modelo.setColor(Color.RED);
                vista.repaint();
            
            }
            
            case VK_M -> {
            
                modelo.setColor(Color.MAGENTA);
                vista.repaint();
            
            }
            
            case VK_PLUS -> {
            
                if(circulo.getRadio()<=200*2) {
                circulo.setRadio(circulo.getRadio()+inc);
                }
                vista.repaint();
                
            }
            
            case VK_MINUS -> {
            
                if(circulo.getRadio()>=5*2) {
                circulo.setRadio(circulo.getRadio()-inc);
                }
                vista.repaint();
                
            }
            
        }
    
    }
    
}
