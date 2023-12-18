package examencuadricula;

/**
 *
 * @author Barradas Cortés Abraham
 */
public class ExamenCuadricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModeloCuadricula modelo = new ModeloCuadricula();                   // MODELO
        VentanaCuadricula vista = new VentanaCuadricula();                  // VISTA
        OyenteCuadricula oyente = new OyenteCuadricula(vista, modelo);      // CONTROLADOR
        vista.addEventos(oyente);                                           // REGISTRO
        vista.setSize(800, 600);
        vista.setLocation(100, 100);
        vista.add(modelo);
        vista.setVisible(true);
    }

}
