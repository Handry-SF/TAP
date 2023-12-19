package vista;

import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.CirculoModelo;
import modelo.TrianguloModelo;

/**
 *
 * @author Handry Serrano Fabela
 */
public class TrianguloVista extends JPanel {
    
    private CirculoModelo circulo;
    private TrianguloModelo triangulo;
    private JButton incrementoBoton;
    private JButton decrementoRadio;

    public TrianguloVista(CirculoModelo circulo, TrianguloModelo triangulo) {
        this.circulo = circulo;
        this.triangulo = triangulo;

        incrementoBoton = new JButton("Aumentar");
        decrementoRadio = new JButton("Disminuir");

        incrementoBoton.addActionListener(e -> {
            circulo.incrementoRadio();
            triangulo.increaseLado();
            repaint();
        });

        decrementoRadio.addActionListener(e -> {
            circulo.decrementoRadio();
            triangulo.decreaseLado();
            repaint();
        });

        add(incrementoBoton);
        add(decrementoRadio);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;

        // Dibujar el círculo
        g.drawOval(centroX - circulo.getRadio(), centroY - circulo.getRadio(), circulo.getRadio() * 2, circulo.getRadio() * 2);

        // Calcular las coordenadas de los vértices del triángulo
        int[] puntosX = { centroX, centroX - triangulo.getLado(), centroX + triangulo.getLado() };
        int[] puntosY = { centroY - triangulo.getLado(), centroY + triangulo.getLado(), centroY + triangulo.getLado() };

        // Dibujar el triángulo
        g.drawPolygon(puntosX, puntosY, 3);
        
    }
}
