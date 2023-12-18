package controljugadores;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelos.Jugador;
import modelos.Jugadores;

/**
 *
 * @author LENOVO
 */
public class OyenteJugadores extends WindowAdapter implements ActionListener {
    
    public static final boolean NOMBRE_ON = true;
    public static final boolean NOMBRE_OFF = false;
    public static final boolean COMBOS_ON = true;
    public static final boolean COMBOS_OFF = false;
    
    private Jugadores jugadores;        //MODELO
    private VentanaJugadores vista;     //VISTA
    private DefaultTableModel datosTabla;       //Modelo de la tabla
    private DialogoRegistroJugador dialogo;
    
    public OyenteJugadores(Jugadores jugadores, VentanaJugadores vista) {
    
        this.jugadores = jugadores;
        this.vista = vista;
        datosTabla = vista.getDatosTabla();
        dialogo = new DialogoRegistroJugador(vista, true);
        dialogo.addEventos(this);
    
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
    
        Component origen = (Component)e.getSource();
        switch(origen.getName()) {
        
            case "ventana" : {
            
                salirPrograma();
                break;
            
            }
            
            case "dialogo" : {
            
                dialogo.setVisible(false);
                break;
            
            }
        
        }
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        Component origen = (Component)e.getSource();
        switch(origen.getName()) {
        
            case "abrir" : {
            
                abrirArchivo();
                break;
            
            }
            
            case "guardar" : {
            
                grabarArchivo();
                break;
            
            }
            
            case "salir" : {
            
                salirPrograma();
                break;
            
            }
            
            case "registrar" : {
            
                registrarJugador();
                break;
            
            }
            
            case "editar" : {
                
                editarJugador();
                break;
                
            }
            
            case "eliminar" : {
                
                eliminarJugador();
                break;
            
            }
            
            case "inicializar" : {
            
                inicializarValores();
                break;
            
            }
            
            case "aceptar" : {
            
                actualizarJugador();
                break;
            
            }
            
            case "cancelar" : {
            
                dialogo.setVisible(false);
                break;
            
            }
            
        }
    
    }
    
    public void actualizarJugador() {
    
        Jugador jugador = new Jugador(dialogo.getComponentes());
        String nombre = jugador.getNombre();
        String accion = dialogo.getBotonAceptar().getText();
        
        switch(accion) {
        
            case "Adicionar" : {
            
                if(!jugadores.containsKey(nombre)) {
                
                    jugadores.adicionarJugador(jugador);
                    datosTabla.addRow(jugador.getJugador());
                    vista.actualizarEtiquetas();
                    dialogo.setVisible(false);
                
                } else {
                
                    this.mostrarMensajeError("Error De Registro", 
                            "El jugador "+nombre+" ya esta registrado!!");
                
                }
                break;
            
            }
        
            case "Modificar" : {
            
                if(jugadores.modificarJugador(jugador) != null) {
                
                    String[] valores = jugador.getJugador();
                    int renglon = vista.getTabla().getSelectedRow();
                    for(int i=0; i<valores.length;i++) {
                    
                        datosTabla.setValueAt(valores[i], renglon, i);
                    
                    }
                    vista.actualizarEtiquetas();
                
                } else {
                
                    this.mostrarMensajeError("Error De Modificacion", 
                            "El jugador "+nombre+" no se pudo modificar!!");
                
                }
                dialogo.setVisible(false);
                break;
            
            }
            
            case "Eliminar" : {
            
                if(jugadores.modificarJugador(jugador) != null) {
                
                    int renglon = vista.getTabla().getSelectedRow();
                    datosTabla.removeRow(renglon);
                    vista.actualizarEtiquetas();
                
                } else {
                
                    this.mostrarMensajeError("Error De Cepillado", 
                            "El jugador "+nombre+" no se pudo cepillar!!");
                
                }
                dialogo.setVisible(false);
                break;
            
            }
            
        }
    
    }
    
    public void inicializarValores() {
    
        int seleccion = this.mostrarMensajeSeleccion("Eliminar Jugadores", 
                "¿Desea cepillar jugadores?");
        if(seleccion==JOptionPane.YES_OPTION) {
        
            //Limpiar modelo
            jugadores.inicializarJugadores();
            //Limpiar tabla
            datosTabla.setRowCount(0);
            vista.actualizarEtiquetas();
        
        }
    
    }
    
    public void editarJugador() {
    
        if(validarJugador()) {
              
            dialogo.show("Modificar Jugador", "Modificar", 
          NOMBRE_OFF, COMBOS_ON);
              
        }
    
    }
    
    public void eliminarJugador() {
    
        if(validarJugador()) {
                    
            dialogo.show("Eliminar Jugador", "Eliminar", 
        NOMBRE_OFF, COMBOS_OFF);
                
                    
        }
    
    }
    
    public boolean validarJugador(){
    
        int renglon = vista.getTabla().getSelectedRow();
        if(renglon != -1) {
        
            String[] valores = {
            
                (String)datosTabla.getValueAt(renglon, 0),
                (String)datosTabla.getValueAt(renglon, 1),
                (String)datosTabla.getValueAt(renglon, 2),
                (String)datosTabla.getValueAt(renglon, 3),
                (String)datosTabla.getValueAt(renglon, 4),
                (String)datosTabla.getValueAt(renglon, 5)
                
            
            }; 
            
            dialogo.setComponentes(valores);
        
        } else {
        
            mostrarMensajeError("Error De Registro", 
                    "Debes seleccionar un registro de la tabla!");
            return false;
            
        }
        
        return true;
    
    }
    
    public void registrarJugador() {
    
        String[] valores = {"","Soleado","Calor","Baja","Si","Si"};
        dialogo.setComponentes(valores);
        dialogo.show("Registrar Jugador", "Adicionar", NOMBRE_ON,
                COMBOS_ON);
                
    
    }
    
    public void salirPrograma() {
    
        int seleccion = mostrarMensajeSeleccion("Salir Del Programa", 
                "¿Deseas salir del programa?");
        if(seleccion==JOptionPane.YES_OPTION) {
        
            System.exit(0);
            
        } 
    
    }
    
    public void grabarArchivo() {
    
        JFileChooser seleccion = new JFileChooser();
        int opcion = seleccion.showSaveDialog(vista);
        if(opcion==JFileChooser.APPROVE_OPTION) {
        
            File archivo = seleccion.getSelectedFile();
            jugadores.grabarJugadores(archivo);
        
        }
        
        vista.actualizarEtiquetas();
    
    }
    
    public void abrirArchivo() {
    
        JFileChooser seleccion = new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Archivos CSV", "csv");
        seleccion.setFileFilter(filtro);
        int opcion = seleccion.showOpenDialog(vista);
        if(opcion==JFileChooser.APPROVE_OPTION) {
        
            jugadores.leerJugadores(seleccion.getSelectedFile());         //Modelo
            datosTabla.setNumRows(0);                                    //Inicializa la tabla
            for(Jugador jugador:jugadores.values()) {
            
                datosTabla.addRow(jugador.getJugador());                  //Add un registro
//              System.out.println(jugador);

            }
            
            vista.actualizarEtiquetas();
            
            
        }
    
    }
    
    public void mostrarMensajeError(String titulo, String mensaje) {
    
        JOptionPane.showMessageDialog(vista, mensaje, 
                titulo, JOptionPane.OK_OPTION);
    
    }
    
    public int mostrarMensajeSeleccion(String titulo, String mensaje) {
    
        return JOptionPane.showConfirmDialog(vista, mensaje, 
                titulo, JOptionPane.YES_NO_OPTION);
    
    }
    
}
