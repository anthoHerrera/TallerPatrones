package patrones.creational;

import patrones.structural.MenuOpciones;
import sinPatron.Menu;

/**
 * 
 */
public abstract class MenuBuilder {
    protected Menu m;
    
    public MenuBuilder() {
        m = new Menu();
    }

    public MenuOpciones getMenu() {
        return null;
    }

    public abstract void definirMenu();
    public abstract void construirMenu();

}