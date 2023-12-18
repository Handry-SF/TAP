/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
class Vista extends JFrame {
    private Controlador controlador;

    public Vista() {
        setTitle("Dibujar Bandera");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Países");
        JMenuItem alemaniaItem = new JMenuItem("Alemania");
        JMenuItem italiaItem = new JMenuItem("Italia");
        JMenuItem franciaItem = new JMenuItem("Francia");
        JMenuItem belgicaItem = new JMenuItem("Bélgica");

        menu.add(alemaniaItem);
        menu.add(italiaItem);
        menu.add(franciaItem);
        menu.add(belgicaItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                controlador.dibujarBandera("");
            }
        };
        add(panel);

        alemaniaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.dibujarBandera("Alemania");
            }
        });

        italiaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.dibujarBandera("Italia");
            }
        });

        franciaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.dibujarBandera("Francia");
            }
        });

        belgicaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.dibujarBandera("Bélgica");
            }
        });
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void dibujarBandera(Color color1, Color color2, Color color3) {
        JPanel panel = (JPanel) getContentPane();
        panel.setBackground(Color.WHITE);
        panel.removeAll();
        panel.add(new BanderaPanel(color1, color2, color3));
        panel.revalidate();
        panel.repaint();
    }

    class BanderaPanel extends JPanel {
        private Color color1;
        private Color color2;
        private Color color3;

        public BanderaPanel(Color color1, Color color2, Color color3) {
            this.color1 = color1;
            this.color2 = color2;
            this.color3 = color3;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int width = getWidth();
            int height = getHeight();
            int stripeHeight = height / 3;

            g.setColor(color1);
            g.fillRect(0, 0, width, stripeHeight);
            g.setColor(color2);
            g.fillRect(0, stripeHeight, width, stripeHeight);
            g.setColor(color3);
            g.fillRect(0, stripeHeight * 2, width, stripeHeight);
        }
    }
}
