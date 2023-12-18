package animacion;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Imagenes;

/**
 *
 * @author LENOVO
 */
public class OyenteAnimacion extends MouseAdapter {
    
    private Imagenes imagenes;
    private PanelAnimacion panel;
    private int tiempo;

    public OyenteAnimacion(Imagenes imagenes, PanelAnimacion panel) {
        
        this.imagenes = imagenes;
        this.panel = panel;
        
        tiempo = 100;
        panel.getEtiqueta().setText(Integer.toString(tiempo));
        
        new HiloAnimacion().start();
        
    }
    
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
    
        if(e.getWheelRotation()>0) {
        
            tiempo = Math.min(250, tiempo+5);
        
        } else {
        
            tiempo = Math.max(0, tiempo-5);
        
        }
        
        panel.getEtiqueta().setText(Integer.toString(tiempo));
    
    }
    
    public class HiloAnimacion extends Thread {
    
        @Override
        public void run() {
            
            int i=0;
        
            for(;;) {
            
                i = ++i % imagenes.size();
                imagenes.setActiva(i);
                
                try {
                    
                    Thread.sleep(tiempo);
                    
                } catch (InterruptedException ex) {
                
                    System.out.println("Error de interrupcion "+ex);
                    System.exit(-1);
                
                }
                
                panel.repaint();
                Toolkit.getDefaultToolkit().sync();
            
            }
        
        }
    
    }
    
}
