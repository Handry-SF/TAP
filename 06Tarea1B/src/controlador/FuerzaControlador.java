package controlador;

import modelo.FuerzaModelo;

/**
 *
 * @author Handry Serrano Fabela
 */

public class FuerzaControlador {
    
    private FuerzaModelo fuerzaCon1; 
    private FuerzaModelo fuerzaCon2; 

    public FuerzaControlador() {
        
        fuerzaCon1 = new FuerzaModelo(200, 45);
        fuerzaCon2 = new FuerzaModelo(200, -45);
        
    }

    public FuerzaModelo calcularFuerzaResultante() {
        
        double componenteX = fuerzaCon1.getComponenteX() + fuerzaCon2.getComponenteX();
        double componenteY = fuerzaCon1.getComponenteY() + fuerzaCon2.getComponenteY();
        double magnitud = Math.sqrt(Math.pow(componenteX, 2) + Math.pow(componenteY, 2));
        double angulo = Math.toDegrees(Math.atan2(componenteY, componenteX));
        return new FuerzaModelo(magnitud, angulo);
        
    }
    public FuerzaModelo getFuerzaCon1() {
        
        return fuerzaCon1;
        
    }

    public FuerzaModelo getFuerzaCon2() {
        
        return fuerzaCon2;
        
    }
}
