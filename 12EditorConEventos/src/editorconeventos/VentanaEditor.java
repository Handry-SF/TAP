/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package editorconeventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import util.Archivo;

/**
 *
 * @author LENOVO
 */
public class VentanaEditor extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form VentanaEditor
     */
    public VentanaEditor() {
        initComponents();
        addEventos();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        JMenuItem origen = (JMenuItem)e.getSource();
        switch(origen.getName()){
        
            case "abrir":{
            
                abrirArchivo();
                break;
            
            }
            case "salir":{
            
                System.exit(0);
            
            }
        
        }
    
    }
    
    public void abrirArchivo(){
    
        JFileChooser seleccion = new JFileChooser();
        int opcion = seleccion.showOpenDialog(this);
        if(opcion == JFileChooser.APPROVE_OPTION){
        
            ArrayList<String> lineas = Archivo.leerArchivo(seleccion.getSelectedFile());
            areaTexto.setText("");
            for(String linea:lineas){
            
                areaTexto.append(linea+"\n");
            
            }
        }
    }
    
    public void addEventos() {
    
        opcionAbrir.addActionListener(this);
        opcionSalir.addActionListener(this);
        opcionAbrir.setName("abrir");
        opcionSalir.setName("salir");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentro = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        opcionAbrir = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        opcionSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor De Texto");

        panelCentro.setBorder(javax.swing.BorderFactory.createLineBorder(getBackground(), 20));
        panelCentro.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panelCentro.setToolTipText("");
        panelCentro.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        panelCentro.setViewportView(areaTexto);

        getContentPane().add(panelCentro, java.awt.BorderLayout.CENTER);

        menuArchivo.setText("Archivo");

        opcionAbrir.setText("Abrir archivo");
        menuArchivo.add(opcionAbrir);
        menuArchivo.add(separador);

        opcionSalir.setText("Salir del programa");
        menuArchivo.add(opcionSalir);

        barraMenu.add(menuArchivo);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem opcionAbrir;
    private javax.swing.JMenuItem opcionSalir;
    private javax.swing.JScrollPane panelCentro;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables

}
