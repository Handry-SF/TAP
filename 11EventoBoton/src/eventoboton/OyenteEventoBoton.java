package eventoboton;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Handry Serrano Fabela 
 */
public class OyenteEventoBoton implements ActionListener{
    
    private PanelEventoBoton panel;
    
    public OyenteEventoBoton(PanelEventoBoton panel) {
    
        this.panel = panel;
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
//        System.out.println("Se ejecuta el metodo actionPerformed!");
//        System.out.println("getActionCommand="+e.getActionCommand());
//        System.out.println("getSource="+e.getSource());
//        System.out.println("toString="+e.toString());
//          String texto = e.getActionCommand();
//          if(texto.equals("Cambiar fondo a Azul")){
//              System.out.println("Cambia a Azul");
//              panel.setBackground(Color.BLUE);
//          } else if(texto.equals("Cambiar fondo a Verde")){
//              System.out.println("Cambia a Verde");
//              panel.setBackground(Color.GREEN);
//          }
//          if(texto.equals("Cambiar fondo a Rojo")){
//          
//              System.out.println("Cambia a Rojo");
//              panel.setBackground(Color.RED);
//          
//          } else if(texto.equals("Cambiar fondo a Amarillo")){
//              System.out.println("Cambia a Amarillo");
//              panel.setBackground(Color.YELLOW);
//          }
        
        Component origen = (Component)e.getSource();
        switch (origen.getName()) {
        
            case "azul" -> {
                panel.setBackground(Color.BLUE);
            }
            case "verde" -> {
                panel.setBackground(Color.GREEN);
            }
            case "rojo" -> {
                panel.setBackground(Color.RED);
            }
            case "amarillo" -> {
                panel.setBackground(Color.YELLOW);
            }
        
        }

    }
 
}
