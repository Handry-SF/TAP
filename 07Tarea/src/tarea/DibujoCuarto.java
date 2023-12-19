package tarea;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Handry Serrano Fabela
 */
public class DibujoCuarto extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        Polygon paredIz = new Polygon();
        paredIz.addPoint(5, 30);
        paredIz.addPoint(102, 100);
        paredIz.addPoint(102, 450);
        paredIz.addPoint(5, 500);
        g.setColor(new Color(0x17,0xA2,0xFF));
        g.fillPolygon(paredIz);
    	
	Polygon puerta=new Polygon();
	puerta.addPoint(40, 190);
	puerta.addPoint(98, 215);
	puerta.addPoint(98, 453);
	puerta.addPoint(40, 482);
	g.setColor(new Color(0xC7,0xF2,0xB0));
	g.fillPolygon(puerta);
		
	Polygon puertaMarco = new Polygon();
	puertaMarco.addPoint(40, 190);
	puertaMarco.addPoint(98, 215);
	puertaMarco.addPoint(98, 453);
	puertaMarco.addPoint(40, 482);
	g.setColor(new Color(0x00,0x00,0x00));
	g.drawPolygon(puertaMarco);
		
	g.setColor(new Color(0xA0,0x00,0x0A));
	g.fillOval(40,350,10,10);
		
    	g.setColor(new Color(0x17,0xA2,0xFF));
    	g.fillRect(103,100,596,350);
    	
	Polygon paredDer = new Polygon();
	paredDer.addPoint(700, 100);
	paredDer.addPoint(700, 450);
	paredDer.addPoint(795, 500);
	paredDer.addPoint(795, 30);
	g.setColor(new Color(0x17,0xA2,0xFF));
	g.fillPolygon(paredDer);
		
	Polygon techo = new Polygon();
	techo.addPoint(3, 27);
        techo.addPoint(102, 99);
        techo.addPoint(699, 99);
        techo.addPoint(798, 26);
	g.setColor(Color.WHITE);
	g.fillPolygon(techo);
	
	g.setColor(new Color(0xFF,0x7B,0xEB));	//Base Mesa
	g.fillOval(398,485,80,30);
                
	g.setColor(new Color(0x67,0x61,0xFF));	//Soporte
	g.fillRoundRect(430,400,20,100,5,5);	
                
	g.setColor(new Color(0xC7,0x5E,0xA3));	//Mesa
	g.fillOval(300,350,280,60);
	g.setColor(new Color(0xA5,0x32,0x92));	
	g.fillOval(309,345,263,60);
		
	Polygon pantallaLap = new Polygon();		
	pantallaLap.addPoint(385, 315);
	pantallaLap.addPoint(445,320);
	pantallaLap.addPoint(450, 365);
	pantallaLap.addPoint(390, 360);
	g.setColor(Color.WHITE);
	g.fillPolygon(pantallaLap);
		
	Polygon bordePantalla = new Polygon();		
	bordePantalla.addPoint(385, 315);
	bordePantalla.addPoint(445,320);
	bordePantalla.addPoint(450, 365);
	bordePantalla.addPoint(390, 360);
	g.setColor(Color.BLACK);
	g.drawPolygon(bordePantalla);
		
	Polygon tecladoLap = new Polygon();		
	tecladoLap.addPoint(390, 360);
	tecladoLap.addPoint(450, 365);		
	tecladoLap.addPoint(430, 400);
	tecladoLap.addPoint(370, 390);
	g.setColor(Color.WHITE);
	g.fillPolygon(tecladoLap);
		
        Polygon bordeTeclado = new Polygon();		
	bordeTeclado.addPoint(390, 360);
	bordeTeclado.addPoint(450, 365);		
	bordeTeclado.addPoint(430, 400);
	bordeTeclado.addPoint(370, 390);
	g.setColor(Color.BLACK);
	g.drawPolygon(bordeTeclado);
	
	g.setColor(new Color(0x89,0x49,0x32));
	g.fillRect(500,160,180,170);	//Marco Ventana
	g.setColor(Color.BLACK);
        
	g.fillRect(505,175,170,140);	//Fondo Ventana
        g.setColor(new Color(0x89,0x49,0x32));
                
        g.fillRect(505,240,170,2);      //Lineas Ventana
	g.fillRect(545,165,2,165);  
	g.fillRect(633,165,2,165); 	
	g.fillRect(585,175,10,140);	
		  
    }
}
