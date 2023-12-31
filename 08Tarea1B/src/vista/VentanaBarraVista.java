package vista;

import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import modelo.BarrasModelo;

/**
 *
 * @author Handry Serrano Fabela
 */
public class VentanaBarraVista extends javax.swing.JFrame {

  private BarrasModelo modelo;

  public VentanaBarraVista() {
    initComponents();
  }

  public VentanaBarraVista(BarrasModelo modelo) {
    this.modelo = modelo;
    initComponents();
  }

  public void addEventos(ActionListener e) {
    this.opcionAbrir.addActionListener(e);
    this.opcionSalir.addActionListener(e);
    this.opcionBarras.addActionListener(e);
    this.opcionPastel.addActionListener(e);
    this.opAyudaBarras.addActionListener(e);
    this.opAyudaPastel.addActionListener(e);

    this.opcionAbrir.setName("abrir");
    this.opcionSalir.setName("salir");
    this.opcionBarras.setName("barra");
    this.opcionPastel.setName("pastel");
    this.opAyudaBarras.setName("ayuBarra");
    this.opAyudaPastel.setName("ayuPastel");

    this.addWindowListener((WindowListener) e);
    this.setName("vent");

  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentro = new vista.PanelGraficasVista(modelo);
        barraMenu = new javax.swing.JMenuBar();
        menuArchio = new javax.swing.JMenu();
        opcionAbrir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opcionSalir = new javax.swing.JMenuItem();
        menuGraficas = new javax.swing.JMenu();
        opcionPastel = new javax.swing.JMenuItem();
        opcionBarras = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        opAyudaBarras = new javax.swing.JMenuItem();
        opAyudaPastel = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(panelCentro, java.awt.BorderLayout.CENTER);

        menuArchio.setText("Archivo");

        opcionAbrir.setText("Abrir Archivo");
        menuArchio.add(opcionAbrir);
        menuArchio.add(jSeparator1);

        opcionSalir.setText("Salir Del Programa");
        menuArchio.add(opcionSalir);

        barraMenu.add(menuArchio);

        menuGraficas.setText("Grafica");

        opcionPastel.setText("Hacer Grafica De Pastel");
        menuGraficas.add(opcionPastel);

        opcionBarras.setText("Hacer Grafica De Barras");
        menuGraficas.add(opcionBarras);

        barraMenu.add(menuGraficas);

        menuAyuda.setText("Ayuda");

        opAyudaBarras.setText("Acerca De Grafica De Barras");
        menuAyuda.add(opAyudaBarras);

        opAyudaPastel.setText("Acerca De Grafica de Pastel");
        menuAyuda.add(opAyudaPastel);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuArchio;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuGraficas;
    private javax.swing.JMenuItem opAyudaBarras;
    private javax.swing.JMenuItem opAyudaPastel;
    private javax.swing.JMenuItem opcionAbrir;
    private javax.swing.JMenuItem opcionBarras;
    private javax.swing.JMenuItem opcionPastel;
    private javax.swing.JMenuItem opcionSalir;
    private javax.swing.JPanel panelCentro;
    // End of variables declaration//GEN-END:variables
}
