package examen;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LENOVO
 */
public class OyenteExamen implements ActionListener {
    
    private VistaExamen vista;

    public OyenteExamen(VistaExamen vista) {
        this.vista = vista;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        Component origen = (Component)e.getSource();
        switch(origen.getName()) {
            
            case "numero1" : {
            
                if(vista.getCampoTexto()!=null) {
                    vista.boton1();
                }
                vista.boton1();
                break;
            
            }
            
            case "numero2" : {
            
                if(vista.getCampoTexto()!=null) {
                    vista.boton2();
                }
                vista.boton2();
                break;
            
            }
            
            case "numero3" : {
            
                System.out.println("3");
                vista.boton3();
                break;
            
            }
            
            case "numero4" : {
            
                System.out.println("4");
                vista.boton4();
                break;
            
            }
            
            case "numero5" : {
            
                System.out.println("5");
                vista.boton5();
                break;
            
            }
            
            case "numero6" : {
            
                System.out.println("6");
                vista.boton6();
                break;
            
            }
            
            case "numero7" : {
            
                System.out.println("7");
                vista.boton7();
                break;
            
            }
            
            case "numero8" : {
            
                System.out.println("8");
                vista.boton8();
                break;
            
            }
            
            case "numero9" : {
            
                System.out.println("9");
                vista.boton9();
                break;
            
            }
        }
    }
}
