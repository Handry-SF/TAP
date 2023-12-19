package hiloscontadores;

/**
 *
 * @author LENOVO
 */
public class HilosContadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int contador=1;contador<=2;contador++) {
        
            String nombre = "C"+contador;
            System.out.println("Contador "+nombre);
            HiloContador hilo = new HiloContador(nombre);
            System.out.println("Inicia Contador "+nombre);
            //hilo.imprimir(nombre);
            hilo.start();
            System.out.println("Termina Contador "+nombre);
        
        }
        System.out.println("Termina el metodo main()");
        
    }
    
}
