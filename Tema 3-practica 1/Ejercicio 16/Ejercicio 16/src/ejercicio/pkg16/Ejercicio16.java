/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16;
import javax.swing.JOptionPane;
/**
 *
 * @author asier
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double total = 0;
        int contador = 0;
        String fin = "si";
        do {
          float nota = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota"));
        total = total + nota;
        fin = JOptionPane.showInputDialog("Quieres continuar?   si / no");
        contador++;
        } while (fin.equals("si"));
      
    
       total=total/contador;
       JOptionPane.showMessageDialog(null, total + " es la nota media de los " + contador + " alumnos");
    }
}
