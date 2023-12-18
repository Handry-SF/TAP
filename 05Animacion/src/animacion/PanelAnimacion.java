package animacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelos.Imagenes;

/**
 *
 * @author LENOVO
 */
public class PanelAnimacion extends JPanel {
    
    private Imagenes imagenes;
    private JLabel etiqueta;
    
    public PanelAnimacion(Imagenes imagenes) {
    
        this.imagenes = imagenes;
        setBackground(Color.CYAN);
        addComponentes();
    
    }
    
    public void addEventos(MouseAdapter oyente) {
    
        this.addMouseWheelListener(oyente);
    
    }
    
    public void addComponentes() {
    
        etiqueta = new JLabel("");
        etiqueta.setFont(new Font("Arial", Font.BOLD, 48));
        this.add(etiqueta);
    
    }
    
    @Override
    public void paintComponent(Graphics g) {
    
        super.paintComponent(g);
        Image activa = imagenes.getActiva();
        int x = (this.getWidth()-activa.getWidth(null))/2;
        int y = (this.getHeight()-activa.getHeight(null))/2;
        imagenes.setLocation(x,y);
        imagenes.dibujar(g);
    
    }

    /**
     * @return the etiqueta
     */
    public JLabel getEtiqueta() {
        return etiqueta;
    }

    /**
     * @param etiqueta the etiqueta to set
     */
    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }
}
