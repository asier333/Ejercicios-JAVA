/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Pattern pat = Pattern.compile("^([1-9]|[12]\\d|3[01])[/]([1-9]|1[012])[/][0-9]{4}$");
        Matcher validar = pat.matcher(JOptionPane.showInputDialog("Introduce una fecha dd/mm/yyyy"));
        
        if (validar.matches()) {
            JOptionPane.showMessageDialog(null ,"eres un fenomeno");
        }
        else
            JOptionPane.showMessageDialog(null ,"Emosido engañado");
        
    }
    
}
