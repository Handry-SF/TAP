package chat;

/**
 *
 * @author Handry Serrano Fabela
 */
public class VentanaChat extends javax.swing.JFrame {

  /**
   * Creates new form VentanaChat
   */
  public VentanaChat() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    barraMenu = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    opcionAbrir = new javax.swing.JMenuItem();
    opcionSalir = new javax.swing.JMenuItem();
    menuEdicion = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Ventana Para Chat");

    menuArchivo.setText("Archivo");

    opcionAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
    opcionAbrir.setMnemonic('A');
    opcionAbrir.setText("Abrir Archivo");
    opcionAbrir.setToolTipText("Esta es la opción de abrir archivo");
    opcionAbrir.setActionCommand("Abrir Archivo");
    menuArchivo.add(opcionAbrir);

    opcionSalir.setText("Salir Del Programa");
    opcionSalir.setToolTipText("");
    menuArchivo.add(opcionSalir);

    barraMenu.add(menuArchivo);

    menuEdicion.setText("Editar");
    barraMenu.add(menuEdicion);

    setJMenuBar(barraMenu);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar barraMenu;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenu menuEdicion;
  private javax.swing.JMenuItem opcionAbrir;
  private javax.swing.JMenuItem opcionSalir;
  // End of variables declaration//GEN-END:variables
}
