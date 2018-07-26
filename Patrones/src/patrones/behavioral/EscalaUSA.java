package patrones.behavioral;

/**
 * 
 */
public class EscalaUSA implements IEscalaExtranjera {

    public EscalaUSA() {
    }

    @Override
    public String ConvertirCalificacion(Float c) {
        
        if(c > 7 && c <= 7.9) {
            return "D+ -> C+";
        }else if(c > 8 && c <= 8.9) {
            return "B- -> B+";
        }else if(c > 9.0 && c <= 9.5) {
            return "A- -> A+";
        }else if(c > 9.5 && c <= 10) {
            return "A";
        }else {
            return "Reprobado";
        }
      
    }

}