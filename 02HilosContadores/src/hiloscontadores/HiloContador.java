package hiloscontadores;

/**
 *
 * @author LENOVO
 */
public class HiloContador extends Thread {
    
    public HiloContador(String nombre) {
    
        this.setName(nombre);
    
    }
    
    @Override
    public void run() {
    
        imprimir(this.getName());
    
    }
    
    public void imprimir(String nombre) {
    
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
