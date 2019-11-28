/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13;

/**
 *
 * @author asier
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contadorV=0;
        int contadorM=0;
        for (int i = 0; i < 30; i++) {
        
            String nombre = javax.swing.JOptionPane.showInputDialog("¿Nombre?");
            String genero = javax.swing.JOptionPane.showInputDialog("¿Genero? V o M");
            int peso = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("¿Peso? En Kg."));
            int edad = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("¿Edad?"));
            float estatura = Float.parseFloat(javax.swing.JOptionPane.showInputDialog("¿estatura? En metros."));
        
            if (genero.equals("V") && peso>70 && estatura>1.7) {
                contadorV++;
            }
            else
                if (genero.equals("M") && peso>60 && estatura>1.6) {
                    contadorM++;
            }
        }
        javax.swing.JOptionPane.showMessageDialog(null, contadorV + " niños y " + contadorM + " niñas pueden jugar");
    }
    
}
