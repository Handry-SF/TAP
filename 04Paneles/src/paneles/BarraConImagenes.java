package paneles;

import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author Handry Serrano Fabela
 */
public class BarraConImagenes extends JMenuBar {

  public BarraConImagenes() {
    addMenus();
  }

  public final void addMenus() {
    
    JMenu menuArchivo = new JMenu("Archivo");
    menuArchivo.setMnemonic('A');
    add(menuArchivo);
    JMenu menuEdicion = new JMenu("Editar");
    menuEdicion.setMnemonic('E');
    add(menuEdicion);
    //------------------------------------------------------------------------------------------
    JMenuItem abrir = new JMenuItem("Abrir");
    KeyStroke tecla3 = KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK);
    abrir.setAccelerator(tecla3);
    abrir.setMnemonic('O');
    String imagen = "/imagenes/abrir-icon.jpg";
    ImageIcon icono = new ImageIcon(this.getClass().getResource(imagen));
    abrir.setIcon(icono);
    menuArchivo.add(abrir);
    
    JMenuItem guardar = new JMenuItem("Guardar");
    KeyStroke tecla4 = KeyStroke.getKeyStroke('G', InputEvent.SHIFT_DOWN_MASK);
    guardar.setAccelerator(tecla4);
    guardar.setMnemonic('G');
    String imagen2 = "/imagenes/guardar-icon.jpg";
    ImageIcon icono2 = new ImageIcon(this.getClass().getResource(imagen2));
    guardar.setIcon(icono2);
    menuArchivo.add(guardar);
    
    menuArchivo.addSeparator();
    
    JMenuItem salir = new JMenuItem("Salir");
    KeyStroke tecla5 = KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK);
    salir.setAccelerator(tecla5);
    salir.setMnemonic('S');
    String imagen3 = "/imagenes/salir-icon.jpg";
    ImageIcon icono3 = new ImageIcon(this.getClass().getResource(imagen3));
    salir.setIcon(icono3);
    menuArchivo.add(salir);
    //------------------------------------------------------------------------------------------
    JMenuItem copiar = new JMenuItem("Copiar");
    KeyStroke tecla = KeyStroke.getKeyStroke('C', InputEvent.CTRL_DOWN_MASK);
    copiar.setAccelerator(tecla);
    copiar.setMnemonic('C');
    String imagen4 = "/imagenes/copy-icon.jpg";
    ImageIcon icono4 = new ImageIcon(this.getClass().getResource(imagen4));
    copiar.setIcon(icono4);
    menuEdicion.add(copiar);
    
    JMenuItem pegar = new JMenuItem("Pegar");
    KeyStroke tecla0 = KeyStroke.getKeyStroke('V', InputEvent.CTRL_DOWN_MASK);
    pegar.setAccelerator(tecla0);
    pegar.setMnemonic('V');
    String imagen5 = "/imagenes/put-icon.jpg";
    ImageIcon icono5 = new ImageIcon(this.getClass().getResource(imagen5));
    pegar.setIcon(icono5);
    menuEdicion.add(pegar);
    
    JMenuItem cortar = new JMenuItem("Cortar");
    KeyStroke tecla1 = KeyStroke.getKeyStroke('X', InputEvent.CTRL_DOWN_MASK);
    cortar.setAccelerator(tecla1);
    cortar.setMnemonic('X');
    String imagen6 = "/imagenes/cut-icon.jpg";
    ImageIcon icono6 = new ImageIcon(this.getClass().getResource(imagen6));
    cortar.setIcon(icono6);
    menuEdicion.add(cortar);
    
  }
}
