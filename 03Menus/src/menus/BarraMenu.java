package menus;

import javax.swing.*;

/**
 *
 * @author Handry Serrano Fabela
 */
public class BarraMenu extends JMenuBar{
  
  public BarraMenu(){
  
    addMenus();
  
  }
  
  private void addMenus(){
  
    JMenu menuArchivo = new JMenu("Archivo");
    menuArchivo.setMnemonic('A');
    add(menuArchivo);
    JMenu menuEditar = new JMenu("Editar");
    menuEditar.setMnemonic('E');
    add(menuEditar);
    
    JMenuItem opcionAbrir = new JMenuItem("Abrir");
    JMenuItem opcionGuardar = new JMenuItem("Guardar");
    JMenu menuInterior = new JMenu("Opciones");
    menuInterior.add(new JMenuItem("Opción 1"));
    menuInterior.add(new JMenuItem("Opción 2"));
    menuArchivo.add(opcionAbrir);
    menuArchivo.add(opcionGuardar);
    menuArchivo.add(menuInterior);
    menuArchivo.addSeparator();
    menuArchivo.add(new JMenuItem("Salir"));
    
    menuEditar.add(new JMenuItem("Copiar"));
    menuEditar.add(new JMenuItem("Pegar"));
    
  }
  
}
