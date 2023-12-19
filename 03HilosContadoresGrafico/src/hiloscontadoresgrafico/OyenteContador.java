package hiloscontadoresgrafico;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Thread.State;
import javax.swing.JSlider;

/**
 *
 * @author LENOVO
 */
public class OyenteContador implements ActionListener {
    
    private PanelContador panel;
    private Hilo hilo1;
    private Hilo hilo2;

    public OyenteContador(PanelContador panel) {
    
        this.panel = panel;
        hilo1 = new Hilo(panel.getSliders()[0]);
        hilo2 = new Hilo(panel.getSliders()[1]);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(!hilo1.isAlive()) {
            
            if(hilo1.getState()==State.TERMINATED) {
            
                hilo1 = new Hilo(panel.getSliders()[0]);
            
            }
            
            hilo1.start();
            
        }
        
        if(!hilo2.isAlive()) {
            
            if(hilo2.getState()==State.TERMINATED) {
            
                hilo2 = new Hilo(panel.getSliders()[1]);
            
            }
            
            hilo2.start();
            
        }
        
//        hilo2.start();
//        if(hilo1.getState()!=State.TERMINATED) {
//        
//            hilo1.start();
//            
//        }
//        
//        if(hilo2.getState()!=State.TERMINATED) {
//        
//            hilo2.start();
//        
//        }
    
    }
    
    public class Hilo extends Thread {
        
        private JSlider barra;
        
        public Hilo(JSlider barra) {
        
            this.barra = barra;
        
        }
    
        @Override
        public void run() {
        
            for(int i = barra.getMinimum(); i<=barra.getMaximum(); i++) {
            
                barra.setValue(i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {    
                    System.out.println("Error De Interrupcion "+ex);
                    System.exit(-1);
                }
                
                Toolkit.getDefaultToolkit().sync();
            
            }
        
        }
    
    }
    
}
