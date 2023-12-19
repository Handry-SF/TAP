package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.BarrasModelo;
import util.Archivo;
import vista.AyudaVista;
import vista.VentanaBarraVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class BarraPastelControl extends WindowAdapter implements ActionListener {

  private BarrasModelo modelo;
  private VentanaBarraVista vista;
  private AyudaVista ventanaAyuda;
  private String tituloAyuda;

  public BarraPastelControl(BarrasModelo modelo, VentanaBarraVista vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Component disparo = (Component) e.getSource();
    switch (disparo.getName()) {
      case "abrir": {
        abrirArchivo();
        modelo.SetGraficaPastel(true);
        vista.repaint();
        break;
      }
      case "salir": {
        salirPrograma();
        break;
      }
      case "barra": {
        modelo.SetGraficaPastel(false);
        vista.repaint();
        break;
      }
      case "pastel": {
        modelo.SetGraficaPastel(true);
        vista.repaint();
        break;
      }
      case "ayuBarra": {
        this.tituloAyuda = "ayuBarra";
        ayudaGraficas(tituloAyuda);
        break;
      }
      case "ayuPastel": {
        this.tituloAyuda = "ayuPastel";
        ayudaGraficas(tituloAyuda);
        break;
      }
      case "vent": {
        salirPrograma();
      }
    }
  }

  public void ayudaGraficas(String titulo) {
    ventanaAyuda = new AyudaVista(vista, true, titulo);
    ventanaAyuda.setSize(500, 400);
    int dialogoX = vista.getX() + (vista.getWidth() - ventanaAyuda.getWidth()) / 2;
    int dialogoY = vista.getY() + 100;
    ventanaAyuda.setLocation(dialogoX, dialogoY);
    ventanaAyuda.setVisible(true);
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
      modelo.SetGraficaPastel(true);
      vista.repaint();
      //System.out.println("abrirArchivo Finalizado");
    }
  }

  public void salirPrograma() {
    int selec = mensajeSeleccion("Salir del programa", "¿Desea Salir Del Programa?");
    if (selec == JOptionPane.YES_OPTION) {
      System.exit(0);
    }
  }

  public int mensajeSeleccion(String titulo, String mensaje) {
    return JOptionPane.showConfirmDialog(vista, mensaje, titulo, 
            JOptionPane.YES_NO_OPTION);
  }

  @Override
  public void windowClosing(WindowEvent e) {
    Component disp = (Component) e.getSource();
    switch (disp.getName()) {
      case "vent": {
        salirPrograma();
        break;
      }
    }
  }
}
