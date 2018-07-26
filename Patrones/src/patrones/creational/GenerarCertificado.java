package patrones.creational;

import patrones.structural.MenuCertificado;

/**
 * 
 * @author Anthony 777
 */
public class GenerarCertificado extends MenuBuilder {

    public GenerarCertificado() {      
    }

    @Override
    public void definirMenu() {
        
    }

    @Override
    public void construirMenu() {
        System.out.println("Elija una opcion:\n"
                + "1. Imprimir el certificado de estudiante matriculado. \n"
                + "2. Elegir otra institución.");
    }

}