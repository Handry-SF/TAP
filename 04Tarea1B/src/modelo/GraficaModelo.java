package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Handry Serrano Fabela
 */
public class GraficaModelo {
    
    private List<Double> numerosInfo;

    public GraficaModelo() {
        
        numerosInfo = new ArrayList<>();
        
    }

    public void addNumerosInfo(double valores) {
        
        numerosInfo.add(valores);
        
    }

    public List<Double> getNumerosInfo() {
        
        return numerosInfo;
        
    }
}
