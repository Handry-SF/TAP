package tarea;

import controlador.EditorControl;
import vista.VentanaEditorVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VentanaEditorVista f = new VentanaEditorVista();
        EditorControl oyente = new EditorControl(f);
        f.addEventos(oyente);
        f.setLocation(100, 100);
        f.setSize(650, 650);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

}
