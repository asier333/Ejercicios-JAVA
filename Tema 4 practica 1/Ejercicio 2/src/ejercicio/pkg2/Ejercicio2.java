/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean correcto = false;
        do {
            try{
                int[] numeros;
                int array = Integer.parseInt(JOptionPane.showInputDialog("introduce el tamaño del array"));
                     if (array<1) {
                        throw new NumeroNoValido();
                 }
                 numeros = new int[array];
                aleatorio(numeros);
                correcto=true;
                } 
            
        
        catch(NumeroNoValido e)
        {
            JOptionPane.showMessageDialog(null, "Introduce un numero mayor que 0");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Problemas");
        }
      }
        while (correcto==false);
    }
    



private static void aleatorio(int[] numeros)
{
    String valores = "";
    int suma = 0;
    for (int i = 0; i < numeros.length; i++) {
        numeros[i]=(int)(Math.random()*10);
        valores += "Posicion " + (i+1) + "=" + numeros[i] + "\n";
        suma += numeros[i];
    }
    valores += "y la suma de todos ellos es " + suma;
    JOptionPane.showMessageDialog(null, valores);
}
}