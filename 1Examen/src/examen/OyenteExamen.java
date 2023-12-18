package examen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Serrano Fabela Handry
 */
public class OyenteExamen implements ActionListener {

    private PanelExamen vista;

    public OyenteExamen(PanelExamen vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            int cantidad = vista.getCampoCantidad();
            convertirCantidad(cantidad);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Captura solo números", 
                    "Error de captura", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void convertirCantidad(int cantidad) {
        int denominacion[] = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500};
        JLabel[] resultados = vista.getResultados();
        for (int i = 8; i >= 0; i--) {
            if (cantidad == 0) {
                resultados[i].setText(Integer.toString(0));
                continue;
            }
            int monedas = cantidad / denominacion[i];
            resultados[i].setText(Integer.toString(monedas));
            cantidad %= denominacion[i];
        }

    }

}
