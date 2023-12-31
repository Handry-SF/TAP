package tarea;

/**
 *
 * @author Handry Serrano Fabela
 */
public class VentanaComponentes extends javax.swing.JPanel {

    /**
     * Creates new form VentanaComponentes
     */
    public VentanaComponentes() {
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

        panelEste = new javax.swing.JPanel();
        Ok = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Help = new javax.swing.JButton();
        panelCentro = new javax.swing.JPanel();
        opcion1 = new javax.swing.JCheckBox();
        x = new javax.swing.JLabel();
        opcionX = new javax.swing.JTextField();
        opcion2 = new javax.swing.JCheckBox();
        y = new javax.swing.JLabel();
        opcionY = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(getBackground()));
        setLayout(new java.awt.BorderLayout());

        panelEste.setLayout(new java.awt.GridLayout(3, 1));

        Ok.setText("Ok");
        Ok.setMaximumSize(new java.awt.Dimension(40, 23));
        Ok.setMinimumSize(new java.awt.Dimension(40, 23));
        panelEste.add(Ok);

        Cancel.setText("Cancel");
        panelEste.add(Cancel);

        Help.setText("Help");
        panelEste.add(Help);

        add(panelEste, java.awt.BorderLayout.EAST);

        panelCentro.setLayout(new java.awt.GridLayout(2, 3));

        opcion1.setText("Snap To Grid");
        panelCentro.add(opcion1);

        x.setText("X:");
        panelCentro.add(x);

        opcionX.setText("8");
        panelCentro.add(opcionX);

        opcion2.setText("Show Grid");
        panelCentro.add(opcion2);

        y.setText("Y:");
        panelCentro.add(y);

        opcionY.setText("8");
        panelCentro.add(opcionY);

        add(panelCentro, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Help;
    private javax.swing.JButton Ok;
    private javax.swing.JCheckBox opcion1;
    private javax.swing.JCheckBox opcion2;
    private javax.swing.JTextField opcionX;
    private javax.swing.JTextField opcionY;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelEste;
    private javax.swing.JLabel x;
    private javax.swing.JLabel y;
    // End of variables declaration//GEN-END:variables
}
