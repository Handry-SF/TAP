package util;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Handry Serrano Fabela
 */
public class Archivo {

    public static ArrayList<String> leerArchivo(String nombre) {

        return leerArchivo(new File(nombre));

    }

    public static ArrayList<String> leerArchivo(File nombre) {
        
        try {
            return leerArchivo(new FileInputStream(nombre));
        } catch (IOException ex) {
            System.out.println("Error de archivo " + ex);
            System.exit(-1);
        }
        return null;
        
    }

    public static ArrayList<String> leerArchivo(InputStream nombre) {

        ArrayList<String> lineas = new ArrayList();
        try {
            InputStreamReader flujo = new InputStreamReader(nombre);        //Apertura
            BufferedReader buffer = new BufferedReader(flujo);    //Apertura
            String linea = buffer.readLine();                        //Uso
            while (linea != null) {
                lineas.add(linea);
                linea = buffer.readLine();                           //Uso
            }
            buffer.close();
            flujo.close();                                           //Cierre
        } catch (IOException ex) {
            System.out.println("Error de archivo" + ex);
            System.exit(-1);
        }
        return lineas;

    }
    
    public static void grabarArchivo(String nombre, ArrayList<String> lineas) {
    
        grabarArchivo(new File(nombre),lineas);
    
    }

    public static void grabarArchivo(File nombre, ArrayList<String> lineas) {

        try {
            FileWriter flujo = new FileWriter(nombre);
            BufferedWriter buffer = new BufferedWriter(flujo);
            for (String linea : lineas) {
                buffer.write(linea);
                buffer.newLine();
            }
            buffer.close();
            flujo.close();
        } catch (IOException error) {
            System.out.println("Error de archivo" + error);
            System.exit(-1);
        }
    }
}
