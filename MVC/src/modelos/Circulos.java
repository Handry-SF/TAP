package modelos;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Circulos extends ArrayList<Circulo> implements Dibujable{

    @Override
    public void dibujar(Graphics g) {
    
        for(Circulo circulo:this) {
        
            circulo.dibujar(g);
            
        }
    
    }
    
    @Override
    public String toString(){
    
        return ""+this.size();
    
    }
    
}
