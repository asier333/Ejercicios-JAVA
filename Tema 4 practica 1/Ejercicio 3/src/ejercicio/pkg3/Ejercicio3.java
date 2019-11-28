/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] abecedario;
        abecedario = new char[26];
        RellenaAbece(abecedario);
        PosiArray(abecedario);
        
    }
    public static void RellenaAbece(char [] abecedario){
        for (int i = 0; i < abecedario.length; i++) {
            abecedario[i]=(char)('A' + i);
        }
    }
    public static void PosiArray(char [] abecedario){
        String cadena = "Cadena resultante:\n";
        int posicion=0;
        do {
            try{
                
           posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion del abecedario que quieras\n\nIntroduce '-1' para salir"));
            if ((posicion<0 || posicion>25) && posicion!=-1) {
                throw new NumeroNoValido();
            }
            else
                if (posicion!=-1) {
                    cadena += abecedario[posicion];
                }
            }
            catch (NumeroNoValido e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce un numero entre el 0 y el 25");
                    }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Problemas");
                    }
        } while (posicion!=-1);
        JOptionPane.showMessageDialog(null, cadena);
    }
}
