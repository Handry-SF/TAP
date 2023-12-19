package modelo;

/**
 *
 * @author Handry Serrano Fabela
 */
public class TemperaturaModelo {
    
    public double conversorTemperatura(double gradosTemperatura, String escalaIni, String escalaFin) {
        
        double resul = 0.0;
        
        if (escalaIni.equals("Celsius") && escalaFin.equals("Fahrenheit")) {
            
            resul = (gradosTemperatura * 9 / 5) + 32;
            
        } else if (escalaIni.equals("Fahrenheit") && escalaFin.equals("Celsius")) {
            
            resul = (gradosTemperatura - 32) * 5 / 9;
            
        } else if (escalaIni.equals("Celsius") && escalaFin.equals("Kelvin")) {
            
            resul = gradosTemperatura + 273.15;
            
        } else if (escalaIni.equals("Kelvin") && escalaFin.equals("Celsius")) {
            
            resul = gradosTemperatura - 273.15;
            
        }
        return resul;
    }
    
}
