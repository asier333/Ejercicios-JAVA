/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

/**
 *
 * @author asier
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nota = javax.swing.JOptionPane.showInputDialog("dime tu nota");
        int a = Integer.parseInt(nota);
        if (a < 5){
            javax.swing.JOptionPane.showMessageDialog(null, "Has suspendido con un " + a);
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(null, "Has aprobado con un " + a);
        }
        
    }
   
}
