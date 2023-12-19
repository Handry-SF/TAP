package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.TemperaturaModelo;
import vista.TemperaturaVista;

/**
 *
 * @author Handry Serrano Fabela
 */
public class TemperaturaControlador implements ActionListener {
    
    private TemperaturaModelo modelo;
    private TemperaturaVista vista;

    public TemperaturaControlador(TemperaturaModelo modelo, TemperaturaVista vista) {
        
        this.modelo = modelo;
        this.vista = vista;
        
    }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            try {
                
                double gradosTemperatura = vista.getGradosTemperatura();
                String escalaIni = "";
                String escalaFin = "";
                String resultadoConvertido = "";

                if (e.getSource() == vista.botonFahACel) {
                    
                    escalaIni = "Fahrenheit";
                    escalaFin = "Celsius";
                    resultadoConvertido = "Celsius";
                    
                } else if (e.getSource() == vista.botonCelAFah) {
                    
                    escalaIni = "Celsius";
                    escalaFin = "Fahrenheit";
                    resultadoConvertido = "Fahrenheit";
                    
                } else if (e.getSource() == vista.botonCelAKel) {
                    
                    escalaIni = "Celsius";
                    escalaFin = "Kelvin";
                    resultadoConvertido = "Kelvin";
                    
                } else if (e.getSource() == vista.botonKelACel) {
                    
                    escalaIni = "Kelvin";
                    escalaFin = "Celsius";
                    resultadoConvertido = "Celsius";
                    
                }

                vista.setGradosInicial(gradosTemperatura);
                vista.setEscalaInicial(escalaIni);
                vista.setEscalaFinal(escalaFin);
                double temperaturaConvertida = modelo.conversorTemperatura(gradosTemperatura, escalaIni, resultadoConvertido);
                vista.setGradosFinal(temperaturaConvertida);
                
            } catch (NumberFormatException ex) {
                
                JOptionPane.showMessageDialog(vista, "Ingrese una temperatura correcta.", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            
            }
        }
    }
