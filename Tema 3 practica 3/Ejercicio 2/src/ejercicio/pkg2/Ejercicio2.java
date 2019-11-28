/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = JOptionPane.showInputDialog("Escribeme una frase");
        String fraseVuelta = funciVuelta(frase);
        
        JOptionPane.showMessageDialog(null, "'" + frase + "' dada la vuelta es '" + fraseVuelta + "'");
    }
    public static String funciVuelta(String frase){
        String fraseVuelta = "";
        for (int i = frase.length()-1; i > -1; i--) {
            fraseVuelta = fraseVuelta + frase.charAt(i);
            
    }
        return fraseVuelta;
}
}
