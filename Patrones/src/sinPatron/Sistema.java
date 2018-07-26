/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinPatron;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import patrones.creational.GenerarCalificaciones;
import patrones.creational.GenerarCertificado;
import patrones.creational.GenerarTodo;

/**
 *
 * @author Anthony777
 */
public class Sistema {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Estudiante ant = new Estudiante("Anthony", "Herrera", "201412693", 7.74f);
        Map<String,Estudiante> mapa = new HashMap<>();
        mapa.put("201412693", ant);
        InstitucionEducativa jk = new InstitucionEducativa();
        jk.setCreada(2009);
        jk.setCanton("Otavalo");
        GenerarCalificaciones gc = new GenerarCalificaciones();
        gc.definirMenu();
        jk.setMenu(gc.getMenu());
        jk.setNombre("JATUN KURAKA");
        jk.setParroquia("San Juan");
        jk.setProvincia("Imbabura");
        jk.setZona("1");
        jk.setEstudiantes(mapa);
        
        InstitucionEducativa pcb = new InstitucionEducativa();
        pcb.setCreada(2009);
        pcb.setCanton("San Lorenzo");
        GenerarCertificado gce = new GenerarCertificado();
        gce.definirMenu();
        pcb.setMenu(gce.getMenu());
        pcb.setNombre("PROF. CONSUELO BENAVIDES");
        pcb.setParroquia("San Lorenzo");
        pcb.setProvincia("Esmeraldas");
        pcb.setZona("1");
        
        InstitucionEducativa syw = new InstitucionEducativa();
        syw.setCreada(2012);
        syw.setCanton("Cotacachi");
        GenerarTodo gt = new GenerarTodo();
        gt.definirMenu();
        syw.setMenu(gt.getMenu());
        syw.setNombre("SUMAK YACHANA WASI");
        syw.setParroquia("Imantag");
        syw.setProvincia("Imbabura");
        syw.setZona("1");
        Menu menu = new Menu();
        menu.MostrarOpciones();
        String opcion = sc.nextLine();
        while(!opcion.equals("4")) {
            if(opcion.equals("1")) {
                gc.construirMenu();
                opcion = sc.nextLine();
                while(!opcion.equals("2")) {
                    if(opcion.equals("1")) {
                        System.out.println("mostrar calificacion\n");
                    }else {
                        System.out.println("opcion no valida\n");
                    }
                    gc.construirMenu();
                    opcion = sc.nextLine();
                }
            }else if(opcion.equals("2")) {
                gce.construirMenu();
                opcion = sc.nextLine();
                while(!opcion.equals("2")) {
                    if(opcion.equals("1")) {
                        System.out.println("mostrar certificado\n");
                    }else {
                        System.out.println("opcion no valida\n");
                    }
                    gce.construirMenu();
                    opcion = sc.nextLine();
                }
            }else if(opcion.equals("3")) {
                gt.construirMenu();
                opcion = sc.nextLine();
                while(!opcion.equals("3")) {
                    if(opcion.equals("1")) {
                        System.out.println("mostrar certificado\n");
                    }else if(opcion.equals("2")) {
                        System.out.println("mostrar calificaciones");
                    }else {
                        System.out.println("opcion no valida\n");
                    }
                    gt.construirMenu();
                    opcion = sc.nextLine();
                }
            }else {
                System.out.println("Opcion incorrecta");
            }
            menu.MostrarOpciones();
            opcion = sc.nextLine();
        }
        System.out.println("Se cerro el sistema");
                
    }
}
