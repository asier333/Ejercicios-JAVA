/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15;
import javax.swing.JOptionPane;
        
/**
 *
 * @author asier
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aprobados = 0;
        int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos?"));
        for (int i = 0; i < alumnos; i++) {
            float nota = Float.parseFloat(JOptionPane.showInputDialog("¿nota de este alumno?"));
            if (nota >= 6) {
                aprobados++;
            }
        }
        JOptionPane.showMessageDialog(null, aprobados + " alumnos han aprobado");
    }
    
}
