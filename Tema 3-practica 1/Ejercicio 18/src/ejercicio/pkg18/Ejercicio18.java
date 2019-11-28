/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg18;
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
        int termino = Integer.parseInt(JOptionPane.showInputDialog("¿hasta que termino quieres llegar?"));
        if (termino == 1 || termino == 2) {
            JOptionPane.showMessageDialog(null, "El termino es el 1");
                    }
        else
                {
                    int num1 = 1;
                    int num2 = 1;
                    int numT = 0;
                    for (int i = 2; i < termino; i++) {
                        numT = num1 + num2;
                        num1=num2;
                        num2=numT;                    
        }
            JOptionPane.showMessageDialog(null, "El termino es el " + numT);
    }
    
}
}