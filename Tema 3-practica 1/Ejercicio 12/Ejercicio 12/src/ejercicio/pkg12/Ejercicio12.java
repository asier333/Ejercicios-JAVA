/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg12;

/**
 *
 * @author asier
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int min = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Cuantos minutos has consumido"));
        double factura;
        if (min<300) {
            factura = min * 0.04;
        }
        else
            if (min>=300 && min<500){
            factura = min * 0.03;
            }
            else
                if (min>=500 && min<=800){
                factura = (300*0.03)+(min-300)*0.02;
                }
                else
                   factura = ((300*0.03)+(min-300)*0.02)*0.9875;
    javax.swing.JOptionPane.showMessageDialog(null, factura + "€ tienes que pagar");
        }
        
        }
        

