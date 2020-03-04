/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import Modelo.*;
import Excepciones.*;
import java.text.DecimalFormat;
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
        
        try{
            double r = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
            if (r<=0) {
                throw new DatoNoValido();
            }
            Operaciones op = new Operaciones();
            op.setRadio(r);
            DecimalFormat DosDeci = new DecimalFormat("#.00");
            JOptionPane.showMessageDialog(null, "Resultados de las operaciones con radio " + r + ":"
                    + "\n1-Longitud circunferencia:" + DosDeci.format(op.getLong(r))
                    + "\n2-Area circulo: " + DosDeci.format(op.getArea(r))
                    + "\n3-Volumen esfera: " + DosDeci.format(op.getVolumen(r)));
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Introduce solamente numeros");
        }
        catch (DatoNoValido e)
        {
            JOptionPane.showMessageDialog(null, "El radio no puede ser menor o igual que 0");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Problemas");
        }
        
    }
    
}
