package patrones.structural;

/**
 * 
 * @author Anthony777
 */
public abstract class MenuDecorator implements MenuOpciones {
    private MenuOpciones menu;
    
    public MenuDecorator() {
    }
    
    public void MenuDecorator(MenuOpciones i) { 
        
    }

    public abstract String ejecutarOpcion(int op);

    @Override
    public void MostrarOpciones() {
        
    }

}