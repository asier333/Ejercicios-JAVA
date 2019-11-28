/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String vocal = JOptionPane.showInputDialog("Escribeme una frase, averiguaremos cuantas vocales tiene");
        int contador = 0;
        for (int i = 0; i < vocal.length(); i++) {
            /**char letra = vocal.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }*/
            switch (vocal.charAt(i)){
                case 'a':
                    contador++;
                break;
                case 'e':
                    contador++;
                break;
                case 'i':
                    contador++;
                break;
                case 'o':
                    contador++;
                break;
                case 'u':
                    contador++;
                break;
            }
                    
            }
        JOptionPane.showMessageDialog(null, contador + " vocales tiene la frase " + vocal);
        }
        
    }
    

