package controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.FuerzaModelo;

/**
 *
 * @author Handry Serrano Fabela
 */

public class FuerzaControlador {
    
   private List<FuerzaModelo> fuerzasCon;

    public FuerzaControlador() {
        fuerzasCon = new ArrayList<>();
    }

    public List<FuerzaModelo> getFuerzasCon() {
        return fuerzasCon;
    }

    public FuerzaModelo calcularFuerzaResultante() {
        double componenteX = 0;
        double componenteY = 0;
        for (FuerzaModelo fuerza : fuerzasCon) {
            componenteX += fuerza.getComponenteX();
            componenteY += fuerza.getComponenteY();
        }
        double magnitud = Math.sqrt(Math.pow(componenteX, 2) + Math.pow(componenteY, 2));
        double angulo = Math.toDegrees(Math.atan2(componenteY, componenteX));
        return new FuerzaModelo(magnitud, angulo);
    }

    public void leerFuerzasDesdeArchivo(String filePath) {
        fuerzasCon.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    double magnitud = Double.parseDouble(parts[0].trim());
                    double angulo = Double.parseDouble(parts[1].trim());
                    FuerzaModelo fuerza = new FuerzaModelo(magnitud, angulo);
                    fuerzasCon.add(fuerza);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
