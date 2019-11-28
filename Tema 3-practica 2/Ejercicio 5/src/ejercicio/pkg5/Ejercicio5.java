/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

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
        int aleatorio = (int) (Math.random()*1000);
        String aleatorioCadena = aleatorio + "";
        String posAle1 = aleatorioCadena.substring(1);
        String posAle2 = aleatorioCadena.substring(2);
        String posAle3 = aleatorioCadena.substring(3);
        boolean salir = true;
        do {
            
       
        
        String numero = JOptionPane.showInputDialog("¡Juguemos a muertos y heridos!\nDime un numero de 3 cifras");
        String posNum1 = numero.substring(1);
        String posNum2 = numero.substring(2);
        String posNum3 = numero.substring(3);
        int contadorMuertos = 0;
        int contadorHeridos = 0;
        if (posAle1.equals(posNum1)) {
            contadorMuertos++;
        }
        else
            if (posAle1.equals(posNum2) || posAle1.equals(posNum3)) {
                contadorHeridos++;
            }
        
        if (posAle2.equals(posNum2)) {
            contadorMuertos++;
        }
        else
            if (posAle2.equals(posNum1) || posAle2.equals(posNum3)) {
                contadorHeridos++;
            }
        
        if (posAle3.equals(posNum3)) {
            contadorMuertos++;
        }
        else
            if (posAle3.equals(posNum2) || posAle3.equals(posNum1)) {
                contadorHeridos++;
            }
        
        switch (contadorMuertos){
            case 3:
                JOptionPane.showMessageDialog(null, "¡Exacto! El numero es " + aleatorio);
                salir = false;
            default:
                JOptionPane.showMessageDialog(null, "Tienes " + contadorMuertos + " numeros muertos y " + contadorHeridos + " numeros heridos");
        }
         } while (salir==true);
    }
   
}
