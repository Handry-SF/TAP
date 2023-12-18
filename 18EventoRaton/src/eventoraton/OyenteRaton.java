package eventoraton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelos.Circulo;
import vistas.PanelDibujable;

/**
 *
 * @author LENOVO
 */
public class OyenteRaton extends MouseAdapter {
    
    private Circulo modelo;
    private PanelDibujable vista;
    private boolean seleccionado;
    private int deltaX;
    private int deltaY;
    
    public OyenteRaton(Circulo modelo, PanelDibujable vista) {
    
        this.modelo = modelo;
        this.vista = vista;
    
    }
    
    //Movimiento del puntero del raton
    @Override
    public void mouseMoved(MouseEvent e) {
   
        //System.out.println("("+e.getX()+","+e.getY()+")");
        vista.repaint();
        
    } 
    
    //El boton esta presionado
    @Override
    public void mousePressed(MouseEvent e) {
        
        if(modelo.contiene(e.getX(), e.getY())) {
        
            seleccionado = true;
            deltaX = modelo.x-e.getX();
            deltaY = modelo.y-e.getY();
            
        }
//        System.out.println("Selecciono el circulo");
//        else {
//            System.out.println("No lo selecciono");
//        }
        
    }                  
    
    //El raton se arrastra
    @Override
    public void mouseDragged(MouseEvent e) {
    
        if(seleccionado) {
        
            modelo.x = e.getX()+deltaX;
            modelo.y = e.getY()+deltaY;
            vista.repaint();
//          System.out.println("Muevo el circulo");
        
        }
    
    }                   
    
    //El boton se deja de presionar
    @Override
    public void mouseReleased(MouseEvent e) {
    
        seleccionado = false;
        
    }                  
    
}
