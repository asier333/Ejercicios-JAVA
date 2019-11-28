/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

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
        
        String cadena = JOptionPane.showInputDialog("Escribeme una frase");
        char letras[] = new char [cadena.length()];
        int contador[] = new int [cadena.length()];
        String total = "";
        for (int i = 0; i < cadena.length(); i++) {
            letras[i] = cadena.charAt(i);   
                for (int j = 0; j < i+1; j++) {
                    if (cadena.charAt(i)==cadena.charAt(j)) {
                        contador[i] += +1;
                }
            }
        }
        for (int i = 0; i < cadena.length(); i++) {
            int contador2=0;
            for (int j = 0; j < i+1; j++) {
       
                if (cadena.charAt(i)==cadena.charAt(j)) {
                    contador2+= +1;
                }
                   
                    }
             if (letras[i]!=' ' && contador2<2) {
                total += letras[i] + " aparece " + contador[i] + " veces\n";
                        }

                }
        JOptionPane.showMessageDialog(null, total);
    }
    
}
