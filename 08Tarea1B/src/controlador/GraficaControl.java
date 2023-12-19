package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import modelo.PastelModelo;
import util.Archivo;
import vista.VentanaPastelVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class GraficaControl implements ActionListener {

    private final PastelModelo modelo;
    private final VentanaPastelVista vista;

    public GraficaControl(PastelModelo modelo, VentanaPastelVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Component disparo = (Component) e.getSource();
        switch (disparo.getName()) {
            case "abrir": {
                //System.out.println("Abriendo");
                abrirArchivo();
                break;
            }
            case "cerrar": {
                System.exit(0);
                break;
            }
        }

    }

    public void abrirArchivo() {
        JFileChooser arch = new JFileChooser();
        int operacion = arch.showOpenDialog(vista);

        if (operacion == JFileChooser.APPROVE_OPTION) {
            //System.out.println("Se abrió");
            File archivo = arch.getSelectedFile();
            ArrayList<String> lineas = Archivo.leerArchivo(archivo);
            String cadena = lineas.get(0);
            String[] cantidades = cadena.split(",");
            modelo.getDatos().clear();

            ArrayList<Integer> datos = new ArrayList();
            for (String linea : cantidades) {
                datos.add(Integer.parseInt(linea));
            }
            modelo.setDatos(datos);
            vista.repaint();
            //System.out.println("abrirArchivo Finalizado");
        }

    }
}
