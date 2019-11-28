/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg20;
import javax.swing.JOptionPane;
/**
 *
 * @author asier
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = (int) (Math.random()*100);
        String fin = "si";
        do {
            int posible = Integer.parseInt(JOptionPane.showInputDialog("cual crees que es el numero?"));
            if (numero!=posible) {
                if (numero>posible) {
                    JOptionPane.showMessageDialog(null, "Tu numero es mas alto");
                    }
                else{
                    JOptionPane.showMessageDialog(null, "Tu numero es mas bajo");
                }
            fin = JOptionPane.showInputDialog("¿Quieres seguir? si / no");
            }
            else    {
                JOptionPane.showMessageDialog(null, "Correcto, el numero era " + numero);
                fin = "no";
            }
        } while (fin.equals("si"));
        
    }
    
}
