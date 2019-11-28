/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg19;
import javax.swing.JOptionPane;
/**
 *
 * @author asier
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
        int cuadrado = 1;
        int numAux = 1;
        for (int i = 1; i < numero; i++) {
            numAux = numAux + 2;
            cuadrado = cuadrado + numAux;
        }
        JOptionPane.showMessageDialog(null, cuadrado + " es el cuadrado de " + numero);
    }
    
}
