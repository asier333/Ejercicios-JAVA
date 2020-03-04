/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;
import Alumnos.*;
import Excepciones.*;
import java.util.ArrayList;
/**
 *
 * @author asier
 */
public class Ejercicio2 {
public static Datos dt = new Datos();
    /**
     * @param args the command line arguments
     */
/*Ejercicio sin terminar, */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cod();
        Nom();
        JOptionPane.showMessageDialog(null, dt.getCodigo() + " y tb " + dt.getNombre());
        
    }
    
    private static void Cod(){
        boolean correcto = false;
        do {
            ArrayList<Integer>codigo = new ArrayList<>();
            try{
                codigo.add(Integer.parseInt(JOptionPane.showInputDialog("Comencemos almacenando la informacion de los alumnos"
                        + "\nIntroduce el codigo del alumno")));
                if (codigo.get(0)<=0) {
                    throw new NumeroNoValido();
                }
                
                correcto = true;
                dt.setCodigo(codigo);
                
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Introduce Solamente numeros enteros");
            }
            catch (NumeroNoValido e)
            {
                JOptionPane.showMessageDialog(null, "Introduce numeros mayores que 0");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problemas");
            }
        } while (correcto==false);
        
    }
    
    private static void Nom(){
        
        boolean correcto = false;
        do {
            String o="sgsrgrg";
            ArrayList<String>nombre = new ArrayList<>();
            try{
                nombre.add(JOptionPane.showInputDialog("Introduce el nombre del alumno"));
              /*  for (int i = 0; i < nombre.get(0).length(); i++) {
                    
               
                if (isNumeric.(nombre.get(0))) {
                    throw new NumeroNoValido();
                }
                }*/
                correcto = true;
                dt.setNombre(nombre);
                
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problemas");
            }
        } while (correcto==false);
        
        
    }
}