/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments("^[0-9]{1,}")
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pattern pat = Pattern.compile("\\d{1,}");/*("^[0-9]{1,}")*/
        Matcher validar = pat.matcher(JOptionPane.showInputDialog("Introduce un numero"));
        if (validar.matches()) {
            JOptionPane.showMessageDialog(null, "Yeah");
        }
         else
            JOptionPane.showMessageDialog(null, "ni de coña");
    }  
    
        
    }
    

