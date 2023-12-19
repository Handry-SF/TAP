package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import vista.ConteoPalabrasVista;
import util.Archivo;
import vista.VentanaEditorVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class EditorControl extends WindowAdapter implements ActionListener {

    private VentanaEditorVista ventana;
    private File archivo;
    private ArrayList<String> lineas;
    private JTextArea areaTexto;

    public EditorControl(VentanaEditorVista vent) {
        this.ventana = vent;
        lineas = vent.getLineas();
        areaTexto = vent.getAreaTexto();
        archivo = vent.getArchivo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Component disparo = (Component) e.getSource();

        switch (disparo.getName()) {
            case "abrir": {
                abrirArchivo();
                break;
            }
            case "guardar": {
                guardarArchivo();
                break;
            }
            case "salir": {
                salirPrograma();
                break;
            }
            case "copiar": {
                copiar();
                break;
            }
            case "cortar": {
                cortar();
                break;
            }
            case "pegar": {
                pegar();
                break;
            }
            case "mayusculas": {
                cambiarMayusculas();
                break;
            }
            case "minusculas": {
                cambiarMinusculas();
                break;
            }
            case "contar": {
                contarPalabras();
                break;
            }
        }
    }

    public void abrirArchivo() {
        JFileChooser selec = new JFileChooser();
        FileNameExtensionFilter filtroTexto = new FileNameExtensionFilter("Archivos de texto",
                "txt");
        selec.setFileFilter(filtroTexto);
        int opcion = selec.showOpenDialog(ventana);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            archivo = selec.getSelectedFile();
            lineas = Archivo.leerArchivo(archivo);
            areaTexto.setText("");
            for (String linea : lineas) {
                areaTexto.append(linea + "\n");
            }
        }
    }

    public void guardarArchivo() {
        JFileChooser seleccion = new JFileChooser();
        int opcion = seleccion.showSaveDialog(ventana);

        if (opcion == JFileChooser.APPROVE_OPTION) {
            archivo = seleccion.getSelectedFile();
            if (lineas != null) {
                lineas.clear();
                lineas.add(areaTexto.getText());
            } else {
                ArrayList<String> linea = new ArrayList<>();
                linea.add(areaTexto.getText());
                lineas = linea;
            }
            Archivo.grabarArchivo(archivo, lineas);
        }
    }

    public void salirPrograma() {
        int seleccion = this.mostrarMensajeSeleccion("Salir del Programa",
                "¿Desea Salir Del Programa?");
        if (seleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public int mostrarMensajeSeleccion(String titulo, String mensaje) {
        return JOptionPane.showConfirmDialog(ventana, mensaje,
                titulo, JOptionPane.YES_NO_OPTION);
    }

    public void copiar() {
        areaTexto.copy();
    }

    public void cortar() {
        areaTexto.cut();
    }

    public void pegar() {
        areaTexto.paste();
    }

    public void cambiarMayusculas() {
        String[] cadena = areaTexto.getText().split("\n");
        areaTexto.removeAll();
        areaTexto.setText("");
        String mayus;
        for (int i = 0; i < cadena.length; i++) {
            mayus = cadena[i].toUpperCase();
            areaTexto.append(mayus + "\n");
        }
    }

    public void cambiarMinusculas() {
        String[] cadena = areaTexto.getText().split("\n");
        areaTexto.removeAll();
        areaTexto.setText("");
        String minus;
        for (int i = 0; i < cadena.length; i++) {
            minus = cadena[i].toLowerCase();
            areaTexto.append(minus + "\n");
        }

    }

    public void contarPalabras() {
        String[] cadenaTexto = areaTexto.getText().split("\n");
        ConteoPalabrasVista dialogo = new ConteoPalabrasVista(ventana, true, cadenaTexto);
        dialogo.setSize(400, 200);
        int posX = ventana.getX() + (ventana.getWidth() - dialogo.getWidth()) / 2;
        int posY = ventana.getY() + 100;
        dialogo.setLocation(posX, posY);
        dialogo.setVisible(true);
    }
}