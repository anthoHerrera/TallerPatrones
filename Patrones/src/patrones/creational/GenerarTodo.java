package patrones.creational;

/**
 * 
 * @author Anthony777
 */
public class GenerarTodo extends MenuBuilder {

    public GenerarTodo() {  
    }

    @Override
    public void definirMenu() {
        
    }

    @Override
    public void construirMenu() {
        System.out.println("Elija una opcion:\n"
                + "1. Imprimir el certificado de estudiante matriculado.\n"
                + "2. Imprimir promedio de calificaciones de estudiante con escala extranjera.\n"
                + "3. Elegir otra institución.\n");
    }

}