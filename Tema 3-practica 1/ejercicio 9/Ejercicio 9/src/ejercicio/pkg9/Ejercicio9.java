/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

/**
 *
 * @author asier
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nota = javax.swing.JOptionPane.showInputDialog("Dime tu nota");
        int a = Integer.parseInt(nota);
        
        switch(a){
            case 0:
            javax.swing.JOptionPane.showMessageDialog(null, "Muy deficiente");
            break;
            case 1:
            case 2:
            case 3:
            case 4:
            javax.swing.JOptionPane.showMessageDialog(null, "insuficiente");
            break;        
            case 5:
            javax.swing.JOptionPane.showMessageDialog(null, "Suficiente");
            break;
            case 6:
            javax.swing.JOptionPane.showMessageDialog(null, "Bien");
            break;
            case 7:
            case 8:
            javax.swing.JOptionPane.showMessageDialog(null, "Notable");
            break;
            case 9:
            case 10:
            javax.swing.JOptionPane.showMessageDialog(null, "Sobresaliente");
            break;
    }
    
}
}
