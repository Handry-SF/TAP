/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package chat;

/**
 *
 * @author LENOVO
 */
public class PanelChat extends javax.swing.JPanel {

  /**
   * Creates new form PanelChat
   */
  public PanelChat() {
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

    panelNorte = new javax.swing.JPanel();
    etiquetaChat = new javax.swing.JLabel();
    campoChat = new javax.swing.JTextField();
    panelCentro = new javax.swing.JScrollPane();
    areaChat = new javax.swing.JTextArea();
    panelSur = new javax.swing.JPanel();
    botonAceptar = new javax.swing.JButton();
    botonCancelar = new javax.swing.JButton();

    setLayout(new java.awt.BorderLayout());

    etiquetaChat.setText("Captura un mensaje:");
    panelNorte.add(etiquetaChat);

    campoChat.setColumns(30);
    panelNorte.add(campoChat);

    add(panelNorte, java.awt.BorderLayout.PAGE_START);

    panelCentro.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    panelCentro.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

    areaChat.setColumns(20);
    areaChat.setRows(5);
    areaChat.setBorder(javax.swing.BorderFactory.createLineBorder(getBackground(), 20));
    panelCentro.setViewportView(areaChat);

    add(panelCentro, java.awt.BorderLayout.CENTER);

    botonAceptar.setText("Aceptar");
    panelSur.add(botonAceptar);

    botonCancelar.setText("Cancelar");
    panelSur.add(botonCancelar);

    add(panelSur, java.awt.BorderLayout.PAGE_END);
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextArea areaChat;
  private javax.swing.JButton botonAceptar;
  private javax.swing.JButton botonCancelar;
  private javax.swing.JTextField campoChat;
  private javax.swing.JLabel etiquetaChat;
  private javax.swing.JScrollPane panelCentro;
  private javax.swing.JPanel panelNorte;
  private javax.swing.JPanel panelSur;
  // End of variables declaration//GEN-END:variables
}
