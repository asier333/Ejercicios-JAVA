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
        float horas = Float.parseFloat(JOptionPane.showInputDialog("¿Cuantas horas has trabajadado?"));
        String estado = JOptionPane.showInputDialog("¿Estado civil? S(soltero), C(casado), V(viudo) y D(divorciado)");
        float total;
        if (horas>40) {
            float extra = horas - 40;
            total = ((horas-extra) * 10) + (extra * 15);
        }
        else  {  
            total = horas * 10;
        }
        if (estado.equalsIgnoreCase("S")) {
            total = total + 100;
        }
        else 
           {
            String estudios = JOptionPane.showInputDialog("¿Estudios realizados? P(primarios, M(medios) y S(superiores)");
            if (estado.equalsIgnoreCase("V") && (estudios.equalsIgnoreCase("P") || estudios.equalsIgnoreCase("S"))){
                total = total + 100;
            }
            else
                if (estudios.equalsIgnoreCase("S") && (estado.equalsIgnoreCase("C") || estado.equalsIgnoreCase("D"))) {
                    total = total + 100;            
        }
                }

        JOptionPane.showMessageDialog(null, total + "€ le corresponden al currela");
    }
    
}
