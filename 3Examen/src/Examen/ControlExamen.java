package Examen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Handry Serrano Fabela
 */
public class ControlExamen implements ActionListener {

    private VistaExamen vista;
    private PanelDibujo modelo;

    public ControlExamen(PanelDibujo modelo, VistaExamen vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int lados = modelo.getLados();
        int radio = modelo.getRadio();
        int inc = 5;
        if (e.getSource() == vista.getAumentarLados()) {
            modelo.setLados(lados + 1); // Convierte el texto en un entero
            modelo.setRadio(modelo.getRadio()+inc);
            vista.repaint();
        } else {
            if (modelo.getLados() - 1 <= 2) {
                JOptionPane.showMessageDialog(vista, "Solo puedes empezar desde 3", 
                        "Error de Interrupcion", JOptionPane.ERROR_MESSAGE);
                return;
            }
            modelo.setLados(lados - 1); // Convierte el texto en un entero
            modelo.setRadio(modelo.getRadio()-inc);
            vista.repaint();

        }

        modelo.repaint(); //Actualizar el contexto grafico
    }

}
