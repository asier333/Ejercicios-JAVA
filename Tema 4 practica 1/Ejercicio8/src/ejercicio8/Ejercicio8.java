/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int faltas[][]= new int [5][31];
        for (int i = 0; i < faltas.length; i++) {
            for (int j = 0; j < faltas[i].length ; j++) {
                faltas[i][j]=0;
            }
        }
        String fin="";
        int contador = 0;
           do {
            faltas[contador][0] = Integer.parseInt(JOptionPane.showInputDialog("Codigo del alumno " + (contador+1) + "?"));
            contador++;
               if (contador!=5) {
                   fin = JOptionPane.showInputDialog("¿Hay mas alumnos? si/no");
               }
           }while ((fin.equalsIgnoreCase("si")) && (contador!=5));
        do {
            int i;
            int alumno = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo de alumno sobre el que introducir las faltas"));
            for (i = 0; i < 6 && alumno==faltas[i][0]; i++) {
            }
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia de la falta"));
            faltas[i][dia] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de faltas"));
            fin = JOptionPane.showInputDialog("¿Quieres seguir? si/no");
        } while (fin.equalsIgnoreCase("si"));
        int suma=0;
        String total = "";
        for (int x = 0; x < 5; x++) {
            if (faltas[x][0]!=0) {
                for (int j = 1; j < 31; j++) {
               
                    suma+= faltas[x][j];
                
                
            }
             
            total += "El alumno " + faltas[x][0] + " tiene en total " + suma + " faltas\n";
            
            }
             suma=0;
        }
        JOptionPane.showMessageDialog(null, total);
    }
    
}
