package patrones.creational;

/**
 * 
 * @author Anthony777
 */
public class GenerarCalificaciones extends MenuBuilder {

    public GenerarCalificaciones() { 
    }

    @Override
    public void definirMenu() {
        
    }

    @Override
    public void construirMenu() {
        System.out.println("Elija una opcion:\n"
                + "1. Imprimir promedio de calificaciones de estudiante con escala extranjera.\n"
                + "2. Elegir otra institución.\n");
    }

}