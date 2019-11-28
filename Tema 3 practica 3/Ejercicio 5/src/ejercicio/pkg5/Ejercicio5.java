/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import java.time.format.DateTimeFormatter;
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
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce un dia"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce un mes"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Introduce un año"));
        
    }
    
}
