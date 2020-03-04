/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Vista.*;
/**
 *
 * @author asier
 */
public class Ejercicio1 {

    public static String mostrar = "";
    public static double numero;
    public static Calculadora V;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        V = new Calculadora();
        V.setVisible(true);
        
    }
    
    public static void blanco(){
        mostrar = "";
    }
    
    public static String ObtenerTexto(String dato){
        mostrar += dato;
        return mostrar;
    }
}
