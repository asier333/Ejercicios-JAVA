/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

/**
 *
 * @author asier
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String dia = javax.swing.JOptionPane.showInputDialog("Dime un nuemero entre el 1 y el 7");
            int a = Integer.parseInt(dia);
            switch(a){
                case 1:
                    javax.swing.JOptionPane.showMessageDialog(null, "Lunes");
                    break;
                case 2:
                    javax.swing.JOptionPane.showMessageDialog(null, "Martes");
                    break;
                case 3:
                    javax.swing.JOptionPane.showMessageDialog(null, "Miercoles");
                    break;
                case 4:
                    javax.swing.JOptionPane.showMessageDialog(null, "Jueves");
                    break;
                case 5:
                    javax.swing.JOptionPane.showMessageDialog(null, "Viernes");
                    break;
                case 6:
                    javax.swing.JOptionPane.showMessageDialog(null, "Sabado");
                    break;
                case 7:
                    javax.swing.JOptionPane.showMessageDialog(null, "Domingo");
                    break;
            }   
            
        
    }
    
}
    
    

