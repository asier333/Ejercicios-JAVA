/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg17;
import javax.swing.JOptionPane;
/**
 *
 * @author asier
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float notaMax = 0;
        float notaMin = 11;
        String nombreMax = "";
        String nombreMin = "";
        for (int i = 0; i < 40; i++) {
            String nombre = JOptionPane.showInputDialog("Nombre del alumno?");
            float nota = Float.parseFloat(JOptionPane.showInputDialog("Nota?"));
            if (nota>notaMax) {
                nombreMax = nombre;
                notaMax = nota;
            }
                if (nota<notaMin) {
                nombreMin = nombre;
                notaMin = nota;
            }
        }
        JOptionPane.showMessageDialog(null, nombreMax + " es el alumno con la mayor calificacion, un " + notaMax + " y " + nombreMin + " es el alumno con la menor calificacion, un " + notaMin);
    }
    
}
