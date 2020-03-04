/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Pattern pat = Pattern.compile("^((\\w+)|(\\w+[.]\\w+))[@]((\\w+)|(\\w+[.]\\w+))[.]((com)|(COM)|(es)|(ES)|(org)|(ORG))$");
        Matcher validar = pat.matcher(JOptionPane.showInputDialog("Introduce un email"));
        
        if (validar.matches()) {
            JOptionPane.showMessageDialog(null ,"eres un fenomeno");
        }
        else
            JOptionPane.showMessageDialog(null ,"Emosido engañado");
        
    }
    
}
