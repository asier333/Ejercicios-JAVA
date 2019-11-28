/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        String meses[] = new String[12];
        meses[0]="Enero";
        meses[1]="Febrero";
        meses[2]="Marzo";
        meses[3]="Abril";
        meses[4]="Mayo";
        meses[5]="Junio";
        meses[6]="Julio";
        meses[7]="Agosto";
        meses[8]="Septiembre";
        meses[9]="Octubre";
        meses[10]="Noviembre";
        meses[11]="Diciembre";
        String mes = JOptionPane.showInputDialog("Introduce un mes");
         while (i<12){
            if (mes.equalsIgnoreCase(meses[i])) {
                JOptionPane.showMessageDialog(null, "El mes introducido es correcto");
                i=17;
            }
            i++;
        } 
        
            if (i<17) {
            JOptionPane.showMessageDialog(null, "El mes introducido es incorrecto");
        }
            
        
    }
    
}
