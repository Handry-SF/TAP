package panelesconherencia;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTabbedPane;

/**
 *
 * @author LENOVO
 */
public class PanelHerencia extends JTabbedPane {
    
    public PanelHerencia() {
    
        this.setBackground(Color.LIGHT_GRAY);
        addComponentes();
        
    }
    
    private void addComponentes() {
        
        this.setBorder(BorderFactory.createLineBorder(this.getBackground(), 20));
        addTab("Panel Padre", new PanelPadre());
        addTab("Panel Hijo", new PanelHijo());
        addTab("Panel Nieto", new PanelNieto());
        
    }
    
}
