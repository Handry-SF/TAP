package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.GraficaModelo;
import vista.GraficaVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class GraficaControlador implements ActionListener {

    private GraficaModelo modelo;
    private GraficaVista vista;

    public GraficaControlador(GraficaModelo modelo, GraficaVista vista) {
        
        this.modelo = modelo;
        this.vista = vista;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        JFileChooser fileChooser = new JFileChooser();
        int resul = fileChooser.showOpenDialog(vista);

            if (resul == JFileChooser.APPROVE_OPTION) {
                try {
                        String fileName = fileChooser.getSelectedFile().getPath();
                        cargarArchivo(fileName);
                } catch (IOException ex) {
                        JOptionPane.showMessageDialog(vista, "Error al cargar el archivo",
                                "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
    }
    
    public void cargarArchivo(String nombreArchivo) throws IOException {
        
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea = reader.readLine();

            if (linea != null) {
                String[] valores = linea.split(",");

                for (String valor : valores) {
                    double numero = Double.parseDouble(valor.trim());
                    modelo.addNumerosInfo(numero);
                }

                vista.repaint();
                
            }
        }
    }
}
