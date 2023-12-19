package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import modelo.CirculoModelo;

/**
 *
 * @author Handry Serrano Fabela
 */
public class CirculoVista extends JPanel {
    
    private CirculoModelo modelo;
    private JSlider barraRadio;
    private JLabel etiquetaRadio;
    private JLabel etiquetaDiametro;
    private JLabel etiquetaArea;
    private JLabel etiquetaCircunferencia;

    public CirculoVista(CirculoModelo modelo) {
        this.modelo = modelo;

        barraRadio = new JSlider(JSlider.HORIZONTAL, 100, 200, modelo.getRadio());
        barraRadio.setMajorTickSpacing(10);
        barraRadio.setPaintTicks(true);
        barraRadio.addChangeListener(e -> {
            int nuevoRadio = barraRadio.getValue();
            modelo.setRadio(nuevoRadio);
            actualizaEtiquetas();
            repaint();
        });

        etiquetaRadio = new JLabel("Radio: " + modelo.getRadio());
        etiquetaDiametro = new JLabel("Diámetro: " + modelo.getDiametro());
        etiquetaArea = new JLabel("Área: " + modelo.getArea());
        etiquetaCircunferencia = new JLabel("Circunferencia: " + modelo.getCircunferencia());

        setLayout(new GridLayout(6, 1));
        add(barraRadio);
        add(etiquetaRadio);
        add(etiquetaDiametro);
        add(etiquetaArea);
        add(etiquetaCircunferencia);
    }

    private void actualizaEtiquetas() {
        etiquetaRadio.setText("Radio: " + modelo.getRadio());
        etiquetaDiametro.setText("Diámetro: " + modelo.getDiametro());
        etiquetaArea.setText("Área: " + modelo.getArea());
        etiquetaCircunferencia.setText("Circunferencia: " + modelo.getCircunferencia());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centroX = getWidth() / 2;
        int centroY = getHeight() / 2;

        int x = centroX - modelo.getRadio();
        int y = centroY - modelo.getRadio();
        int circuloDiametro = modelo.getRadio() * 2;

        g.setColor(Color.BLACK);
        g.drawOval(x, y, circuloDiametro, circuloDiametro);
    }
}
