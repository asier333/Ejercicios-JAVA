/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

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
        try
        {
        int caso = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("1-Suma\n2-Resta\n3-tabla multiplicar\n4-Cociente y resto\n5-Salir"));
        switch  (caso){
            case 1:{
                int n1 = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Dime el primer numero"));
                int n2 = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Dime el segundo numero"));
                int n3 = n1 + n2;
                javax.swing.JOptionPane.showMessageDialog(null, n1 + " + " + n2 + "=" + n3);
            break;}
            case 2:{
                int n1 = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Dime el primer numero"));
                int n2 = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Dime el segundo numero"));
                int n3 = n1 - n2;
                javax.swing.JOptionPane.showMessageDialog(null, n1 + " - " + n2 + "=" + n3);
            break;}
            case 3:{
                String cadena = "";
                int n1 = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("la tabla de multiplicar de que numero quieres?"));
                int multi;
                for (int i = 0; i < 11; i++) {
                    multi = i * n1;
                    cadena = cadena + "\n" + n1 + " * " + i + " = " + multi;
                }
                javax.swing.JOptionPane.showMessageDialog(null, cadena);
            break;}
            case 4:{
                int n1 = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Dime el primer numero"));
                int n2 = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Dime el segundo numero"));
                int resto = n1 % n2;
                int entero = n1 / n2;
                javax.swing.JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " da lugar a " + entero + " como parte entera y " + resto + " como resto");
            break;}
            default:{
                System.exit(0);
            break;}
            }
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Dame un valor numerico");
        }
        
    }
}
   

