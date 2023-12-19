package modelo;

/**
 *
 * @author Handry Serrano Fabela
 */
public class CirculoModelo {
    
    private int radio;

    public CirculoModelo () {
        radio = 150;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return 2 * radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }
    
}
