package vista;

import controlador.GraficaControlador;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.GraficaModelo;

/**
 *
 * @author Handry Serrano Fabela
 */
public class GraficaVista extends JPanel {
    
    private GraficaModelo modelo;
    private JButton cargarArchivo;

    public GraficaVista(GraficaModelo modelo) {
        
        this.modelo = modelo;
        cargarArchivo = new JButton("Cargar Archivo");
        add(cargarArchivo);
        
    }

    public JButton getCargarArchivo() {
        
        return cargarArchivo;
        
    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        List<Double> numeros = modelo.getNumerosInfo();
        double total = 0;

        for (double valores : numeros) {
            
            total += valores;
            
        }

        int anguloInicial = 0;

        for (double valores : numeros) {
            
            int arco = (int) (valores / total * 360);

            g.setColor(getRandomColor());
            g.fillArc(50, 50, 300, 300, anguloInicial, arco);

            anguloInicial += arco;
            
        }
    }

    private Color getRandomColor() {
        
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);

        return new Color(r, g, b);
        
    }

    public void addEventos(GraficaControlador oyente) {
        
       cargarArchivo.addActionListener(oyente);
       
    }
    
}
