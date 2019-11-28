/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;

import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Escribeme el primer numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Escribeme el segundo numero"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Escribeme el tercer numero"));
        if (a>b && a>c){
            JOptionPane.showMessageDialog(null, a + " el el numero mas grande");
            if (b>c){
                JOptionPane.showMessageDialog(null, b + " el el numero del medio");
                JOptionPane.showMessageDialog(null, c + " el el numero menor");
                    }
            else{
                JOptionPane.showMessageDialog(null, c + " el el numero del medio");
                JOptionPane.showMessageDialog(null, b + " el el numero menor");
                }
        }
        if (b>a && b>c){
            JOptionPane.showMessageDialog(null, b + " el el numero mas grande");
            if (a>c){
                JOptionPane.showMessageDialog(null, a + " el el numero del medio");
                JOptionPane.showMessageDialog(null, c + " el el numero menor");
            }
            else{
                JOptionPane.showMessageDialog(null, c + " el el numero del medio");
                JOptionPane.showMessageDialog(null, a + " el el numero menor");
            }
        }
        if (c>a && c>b){
            JOptionPane.showMessageDialog(null, c + " el el numero mas grande");
            if (a>b){
                JOptionPane.showMessageDialog(null, a + " el el numero del medio");
                JOptionPane.showMessageDialog(null, b + " el el numero menor");
            }
            else{
                JOptionPane.showMessageDialog(null, b + " el el numero del medio");
                JOptionPane.showMessageDialog(null, a + " el el numero menor");
            }  
        }
       }
}
    
    
    

