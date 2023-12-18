package trayectorias;

import java.awt.event.MouseEvent;
import modelos.Planeta;
import modelos.Planetas;

/**
 *
 * @author LENOVO
 */
public class OyenteTrayectorias {
    
     private Planetas planetas;
     private PanelTrayectorias panel;

    public OyenteTrayectorias(Planetas planetas, PanelTrayectorias panel) {
        this.planetas = planetas;
        this.panel = panel;
    }
     
     public void mouseClicked(MouseEvent e) {
     
         
     
     }
 
     public class HiloPlaneta extends Thread {
     
         private Planeta planeta;

        public HiloPlaneta(Planeta planeta) {
            this.planeta = planeta;
        }
         
        @Override
        public void run() {
        
            int tiempo = 25 * (int)
        
        }
     
    }
     
}
