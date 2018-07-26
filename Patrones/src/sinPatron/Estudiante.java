/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinPatron;

/**
 *
 * @author Anthony777
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String matricula;
    private Float promedio;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String matricula, Float promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.promedio = promedio;
    }
    
    public String GetInfo() {
        return "Estudiante:\n"
                + "Nombre:" + nombre + "\n"
                + "Apellido:" + apellido + "\n"
                + "Matricula:" + matricula + "\n"
                + "Promedio:" + promedio + "\n";
    }

}
