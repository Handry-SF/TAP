package modelos;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author LENOVO
 */
public class Planeta extends Circulo {
    
    private int anchoOrbita;
    private int altoOrbita;

    public Planeta(int anchoOrbita, int altoOrbita, int radio, Color color) {
        super(0, 0, radio, color);
        this.anchoOrbita = anchoOrbita;
        this.altoOrbita = altoOrbita;
    }
    
    @Override
    public void dibujar(Graphics g) {
    
        g.setColor(Color.CYAN);
        g.drawOval(-anchoOrbita/2, -altoOrbita/2, anchoOrbita, altoOrbita);
        super.dibujar(g);
    
    }

    /**
     * @return the anchoOrbita
     */
    public int getAnchoOrbita() {
        return anchoOrbita;
    }

    /**
     * @param anchoOrbita the anchoOrbita to set
     */
    public void setAnchoOrbita(int anchoOrbita) {
        this.anchoOrbita = anchoOrbita;
    }

    /**
     * @return the altoOrbita
     */
    public int getAltoOrbita() {
        return altoOrbita;
    }

    /**
     * @param altoOrbita the altoOrbita to set
     */
    public void setAltoOrbita(int altoOrbita) {
        this.altoOrbita = altoOrbita;
    }
    
}
