/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pattern pat = Pattern.compile("[0-9]{8}[A-Z]");
        Matcher validar = pat.matcher(JOptionPane.showInputDialog("Introduce tu DNI"));
        if (validar.matches()) {
            JOptionPane.showMessageDialog(null, "De puta madre");
        }
        else
            JOptionPane.showMessageDialog(null, "Try again");
    }
    
}
