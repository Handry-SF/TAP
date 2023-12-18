package examencuadricula;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Barradas Cortés Abraham
 */
public class OyenteCuadricula implements ActionListener {

    private VentanaCuadricula vista;
    private ModeloCuadricula modelo;

    public OyenteCuadricula(VentanaCuadricula vista, ModeloCuadricula modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Component origen = (Component) e.getSource();
        switch (origen.getName()) {
            case "abrir": {
                abrirArchivo();
                break;
            }
            case "salir": {
                System.exit(0);
                break;
            }
        }
    }

    private void abrirArchivo() {
        JFileChooser seleccion = new JFileChooser();
        int opcion = seleccion.showOpenDialog(vista);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            seleccion.getSelectedFile();
            int filas = 0;
            int columnas = 0;
            String archivo = seleccion.getSelectedFile().getPath();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(archivo)))) {
                if (archivo != null) {
                    filas = Integer.parseInt(reader.readLine());
                    columnas = Integer.parseInt(reader.readLine());
                    reader.close();
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(vista, "Error al cargar el archivo",
                        "Error de Interrupcion", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(vista, "El archivo no contiene datos numéricos.",
                        "Error de Interrupcion", JOptionPane.ERROR_MESSAGE);
            }
            modelo.setFilas(filas);
            modelo.setColumnas(columnas);
            vista.repaint();
        }
    }
}
