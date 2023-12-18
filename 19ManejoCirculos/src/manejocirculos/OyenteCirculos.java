
package manejocirculos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelos.Circulo;
import modelos.Circulos;
import vistas.PanelDibujable;

/**
 *
 * @author LENOVO
 */
public class OyenteCirculos extends MouseAdapter{
    
    private final Circulos circulos;
    private final PanelDibujable panel;
    private boolean seleccionado;
    private Circulo circuloSeleccionado;
    private int deltaX;
    private int deltaY;
    
    public OyenteCirculos(Circulos circulos, PanelDibujable panel) {
    
        this.circulos = circulos;
        this.panel = panel;
    
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
    
        int radio = 5+(int)(Math.random()*56);
        int rojo = (int)(Math.random()*256);
        int verde = (int)(Math.random()*256);
        int azul = (int)(Math.random()*256);
        Color miColor = new Color(rojo,verde,azul);
        Circulo circulo = new Circulo(e.getX(),e.getY(),radio,miColor);
        circulos.add(circulo);
        panel.repaint();
    
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
   
        panel.repaint();
        
    } 
    
    @Override
    public void mousePressed(MouseEvent e) {
    
        for(int i=circulos.size()-1;i>=0;i--) {
        
            Circulo circulo = circulos.get(i);
            if(circulo.contiene(e.getX(), e.getY())) {
            
                circuloSeleccionado = circulo;
                seleccionado = true;
                deltaX = circulo.x-e.getX();
                deltaY = circulo.y-e.getY();
                
                if(SwingUtilities.isRightMouseButton(e)){
                
                    int dX = e.getXOnScreen();
                    int dY = e.getYOnScreen();
                    
                    JOptionPane panelConfirmacion = new JOptionPane("Eliminar este circulo",
                    JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
                    JDialog dialogo = panelConfirmacion.createDialog(panel, 
                    "Confirmacion");
                    
                    dialogo.setLocation(dX,dY);
                    dialogo.setSize(250,120);
                    dialogo.setVisible(true);
                    Integer seleccion = (Integer)panelConfirmacion.getValue();
                    
                    if(seleccion==JOptionPane.YES_OPTION) {
                    
                        circulos.remove(circuloSeleccionado);
                        panel.repaint();
                    
                    }
                    
                }
                break;
            
            }
        
        }
    
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
    
        if(seleccionado) {
        
            circuloSeleccionado.x = e.getX()+deltaX;
            circuloSeleccionado.y = e.getY()-deltaY;
            panel.repaint();
        
        }
    
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
    
        seleccionado = false;
        
    }  
    
}
