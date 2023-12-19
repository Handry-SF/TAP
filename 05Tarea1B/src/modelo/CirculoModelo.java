package modelo;

/**
 *
 * @author Handry Serrano Fabela
 */
public class CirculoModelo {
    
    private int radio;

    public CirculoModelo () {
        radio = 300;
    }

    public int getRadio() {
        return radio;
    }

    public void incrementoRadio() {
        radio += 5;
    }

    public void decrementoRadio() {
        if (radio >= 10) {
            radio -= 5;
        }
    }
}
