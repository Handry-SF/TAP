package contadores;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Contadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int contador=1;contador<=2;contador++) {
        
            String nombre = "C"+contador;
            System.out.println("Contador "+nombre);
            System.out.println("Inicia Contador "+nombre);
            imprimir(nombre);
            System.out.println("Termina Contador "+nombre);
        
        }
        System.out.println("Termina el metodo main()");
    }
    
    public static void imprimir(String nombre) {
    
        for(int i=0;i<10;i++) {
        
            System.out.println(nombre+" = "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error de interrupcion de proceso!!"+ex);
            }
        
        }
    
    }
    
}
