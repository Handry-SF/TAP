package tarea;

import controlador.FuerzaControlador;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import vista.FuerzaVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Tarea {

    public static void main(String[] args) {
        
        FuerzaControlador controlador = new FuerzaControlador();
        FuerzaVista vista = new FuerzaVista(controlador);

        JFrame f = new JFrame("Segundo Problema");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(vista);
        f.setSize(700, 700);
        f.setLocation(50,50);
        f.setVisible(true);

        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(f);
        if (option == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            controlador.leerFuerzasDesdeArchivo(filePath);
            vista.repaint();
        }
        
    }
    
}
