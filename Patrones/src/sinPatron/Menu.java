/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinPatron;

import patrones.structural.MenuDecorator;
import patrones.structural.MenuOpciones;

/**
 *
 * @author Anthony777
 */
public class Menu extends MenuDecorator implements MenuOpciones{
    
    public Menu() {
    }

    public void Menu(MenuOpciones i) {
        
    }
    
    @Override
    public String ejecutarOpcion(int op) {
        return String.valueOf(op);
    }

    @Override
    public void MostrarOpciones() {
        System.out.println("Sistema de consultas\n"
                + "1.Unidad Educativa del Milenio JATUN KURAKA\n"
                + "2.Unidad Educativa del Milenio PROF. CONSUELO BENAVIDES\n"
                + "3.Unidad Educativa del Milenio SUMAK YACHANA WASI\n"
                + "4.Salir del sistema");
    }

}
