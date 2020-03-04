/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Modelo.*;
import Vista.*;
import java.util.ArrayList;

/**
 *
 * @author asier
 */
public class Ejercicio2 {

    public static Datos vDatos;
    public static Mostrar vMostrar;
    public static ArrayList<Persona>listaP;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        listaP = new ArrayList();
        vDatos = new Datos();
        vDatos.setVisible(true);
        
        
    }
    
    public static void AñadirPersona(String nombre, String apellidos, String dni){
       Persona p = new Persona(nombre, apellidos, dni);
        listaP.add(p);
    }
    
    public static void SalirDatos(){
        vDatos.dispose();
        vMostrar = new Mostrar();
        vMostrar.setVisible(true);
    }
    
    public static void SalirMostrar(){
        vMostrar.dispose();
        System.exit(0);
    }
}
