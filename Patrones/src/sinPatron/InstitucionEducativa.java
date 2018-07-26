/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinPatron;

import java.util.Map;
import patrones.structural.MenuOpciones;

/**
 *
 * @author Anthony777
 */
public class InstitucionEducativa implements MenuOpciones{
    private String nombre;
    private int creada;
    private String provincia;
    private String canton;
    private String parroquia;
    private String zona;
    private Map<String,Estudiante> estudiantes;
    private MenuOpciones menu;
    
    public InstitucionEducativa() {
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreada(int creada) {
        this.creada = creada;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setEstudiantes(Map estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setMenu(MenuOpciones menu) {
        this.menu = menu;
    }
    
    public String GetInfo() {
        // TODO implement here
        return "Institucion:\n"
                + "Nombre:" + nombre + "\n"
                + "Creada:" + creada + "\n"
                + "Provincia:" + provincia + "\n"
                + "Canton:" + canton + "\n"
                + "Parroquia:" + parroquia + "\n"
                + "Zona:" + zona + "\n";
    }
 
    @Override
    public void MostrarOpciones() {
        menu.MostrarOpciones();
    }

}
