package componentes;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Handry Serrano Fabela
 */
public class PanelComponentes extends JPanel{
  
  public PanelComponentes() {
  
    addComponentes();
    
  }
  
  public final void addComponentes() {
  
    setBackground(Color.CYAN);
    this.setLayout(null); //No usar el Layout
    //BOTON
    JButton boton = new JButton();
    boton.setText("Primer Botón");
    boton.setSize(150,40);
    boton.setLocation(50,50);
    add(boton);
    //ETIQUETA
    JLabel etiqueta = new JLabel();
    etiqueta.setText("Este es un mensaje");
    etiqueta.setBounds(300,50,200,40);
    add(etiqueta);
    //CAMPO DE TEXTO
    JTextField campo = new JTextField();
    campo.setText("Valor de entrada");
    campo.setBounds(50,120,200,40);
    add(campo);
    //AREA DE TEXTO
    JTextArea area = new JTextArea();
    area.setBackground(Color.LIGHT_GRAY);
    area.setText("Captura de texto en varias lineas");
    area.setBounds(300,120,200,80);
    area.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    add(area);
    //CHECKBOX
    JCheckBox ch1 = new JCheckBox("Uno");
    ch1.setSelected(true);
    ch1.setBounds(50,260,100,30);
    ch1.setBackground(this.getBackground());
    add(ch1);
    JCheckBox ch2 = new JCheckBox();
    ch2.setText("Dos");
    ch2.setBounds(50,290,100,30);
    ch2.setBackground(this.getBackground());
    add(ch2);
    //CHECKBOX EN GRUPO
    JCheckBox chA = new JCheckBox("Azul",true);
    chA.setBounds(300,260,100,30);
    chA.setBackground(this.getBackground());
    add(chA);
    JCheckBox chB = new JCheckBox("Verde");
    chB.setBounds(420,260,100,30);
    add(chB);
    JCheckBox chC = new JCheckBox("Amarillo");
    chC.setBounds(540,260,100,30);
    add(chC);
    ButtonGroup grupo = new ButtonGroup();
    grupo.add(chA);
    grupo.add(chB);
    grupo.add(chC);
    //COMBOBOX
    JComboBox sel = new JComboBox();
    sel.addItem("Azul");
    sel.addItem("Verde");
    sel.addItem("Amarillo");
    sel.setSelectedIndex(1);
    sel.setBounds(50,340,100,30);
    add(sel);
    
    String[] elementos ={
    
      "Opcion 1", "Opcion 2",
      "Opcion 3", "Opcion 4",
      "Opcion 5", "Opcion 6"
    
    };
    JList lista = new JList(elementos);
    lista.setBounds(300,340,100,150);
    add(lista);
    
  }
  
}
