package patrones.behavioral;

/**
 * 
 */
public class EscalaAlemania implements IEscalaExtranjera {

    public EscalaAlemania() {
    }

    
    @Override
    public String ConvertirCalificacion(Float c) {
        
        if(c > 7 && c <= 7.9) {
            return "4.0 -> 2.1";
        }else if(c > 8 && c <= 8.9) {
            return "2.0 -> 1.4";
        }else if(c > 9.0 && c <= 9.5) {
            return "1.3 -> 1.1";
        }else if(c > 9.5 && c <= 10) {
            return "1.0";
        }else {
            return "Reprobado";
        }
    }

}