/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String detalle ="NOMBRE: " + JOptionPane.showInputDialog("Nombre del cliente") + "\nLINEAS DE DETALLE:\n";
        String sinIVA = "TOTAL SIN IVA = ";
        String fin = "";
        int cantidad = 0;
        int x = 1;
        int contNorm = 0;
            int contRedu =0 ;
            int contSuper = 0;
            float preNorm = 0;
            float preRedu = 0;
            float preSuper = 0;
        do {
            
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Que cantidad quieres del producto " + x));
            float precio = Float.parseFloat(JOptionPane.showInputDialog("Precio del producto " + x));
            String iva = JOptionPane.showInputDialog("IVA del producto " + x);
            detalle = detalle + cantidad + " x " + precio + " = " + (cantidad*precio) + "\n";
            iva = iva.toLowerCase();
            
            switch (iva)
            {
                case "normal":
                    preNorm = preNorm + precio*cantidad;
                    contNorm++;
                break;
                case "reducido":
                    preRedu = preRedu + precio*cantidad;
                    contRedu++;
                break;
                case "supereducido":
                    preSuper = preSuper + precio*cantidad;
                    contSuper++;
                break;
            }
            fin = JOptionPane.showInputDialog("Quieres seguir? Si/No");
        } while (fin.equalsIgnoreCase("si"));
        sinIVA = sinIVA + (preNorm + preRedu + preSuper) + "\n";
        if (contNorm>0) {
            sinIVA = sinIVA + "21% de " + preNorm + " = " + (preNorm*0.21) + "\n";
        }
        if (preRedu>0) {
            sinIVA = sinIVA + "10% de " + preRedu + " = " + (preRedu*0.1) + "\n";
        }
        if (preSuper>0) {
            sinIVA = sinIVA + "4% de " + preSuper + " = " + (preSuper*0.04) + "\n";
        }
        sinIVA = sinIVA + "TOTAL IVA = " + ((preNorm*0.21) + (preRedu*0.1) + (preSuper*0.04)) + "\nTOTAL CON IVA = " + ((preNorm*1.21) + (preRedu*1.1) + (preSuper*1.04)); 
        JOptionPane.showMessageDialog(null, detalle + sinIVA);
    }
     
}
