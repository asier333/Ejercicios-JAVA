/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pattern pat = Pattern.compile("^\\d{4}[BCDFGHJKLMNÑPRSTVWXYZ]{3}$");
        Matcher validar = pat.matcher(JOptionPane.showInputDialog("introduce una matricula"));
        if (validar.matches()) {
            JOptionPane.showMessageDialog(null, "Buena matricula");
        }
        else
            JOptionPane.showMessageDialog(null, "No eres buen LADRON");
    }
    
}
