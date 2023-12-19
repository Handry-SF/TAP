package modelo;

/**
 *
 * @author Handry Serrano Fabela
 */

public class FuerzaModelo {
    
    private double magnitud;
    private double angulo;

    public FuerzaModelo(double magnitud, double angulo) {
        
        this.magnitud = magnitud;
        this.angulo = angulo;
        
    }

    public double getComponenteX() {
        
        double radianes = Math.toRadians(angulo);
        return magnitud * Math.cos(radianes);
        
    }

    public double getComponenteY() {
        
        double radianes = Math.toRadians(angulo);
        return magnitud * Math.sin(radianes);
        
    }
}

