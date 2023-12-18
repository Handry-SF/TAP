package Examen;

/**
 *
 * @author Barradas Cortés Abraham
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VistaExamen f = new VistaExamen();
        PanelDibujo modelo = new PanelDibujo();
        ControlExamen oyente = new ControlExamen(modelo,f);
        modelo.setLados(3);
        f.addEventos(oyente);
        f.add(modelo);
        f.setSize(850,690);
        f.setLocation(100,50);
        f.setVisible(true);
        
    }
    
}
