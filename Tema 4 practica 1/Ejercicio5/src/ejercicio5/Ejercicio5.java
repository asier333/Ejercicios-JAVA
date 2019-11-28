/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fin="";
        int lluvia[] = new int [3];
        int contador=0;
        do {
            for (int i = 0; i < 3; i++) {
                lluvia[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dato del array " + i));
            }
            contador += lluvia[2];
            fin = JOptionPane.showInputDialog("Quieres continuar? Si/No");
        } while (fin.equalsIgnoreCase("si"));
        JOptionPane.showMessageDialog(null, "Han llovido " + contador + " litros de agua en todo el año");
    }
    
}
