package patrones.structural;

import patrones.behavioral.EscalaAlemania;
import patrones.behavioral.EscalaUSA;
import patrones.behavioral.IEscalaExtranjera;

/**
 * 
 */
public class MenuCalificaciones extends MenuDecorator {
    private IEscalaExtranjera escala;
    
    public MenuCalificaciones() {
    }

    public void MenuCalificaciones(MenuOpciones i) {
        
    }
    
    public String Convertir(Float calif, String pais) {
        if(pais.equals("Alemania")) {
            escala = new EscalaAlemania();
            return escala.ConvertirCalificacion(calif);
        }else {
            escala = new EscalaUSA();
            return escala.ConvertirCalificacion(calif);
        }
    }

    @Override
    public String ejecutarOpcion(int op) {
        return null;
    }  

}