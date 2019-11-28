/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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
       boolean correcto = false;
        int menu=0;
        do 
         {
            try{
       menu = Integer.parseInt(JOptionPane.showInputDialog("Dime que operacion quieres realizar\n1-Calculo de edad\n2-Sumar dos numeros\n3-Contar cuantas vocales hay en una cadena\n4-salir")); 
                if (menu<1 || menu>4) {
                    throw new NumeroNoValido();
                }
            correcto = true;
            }
            catch (NumeroNoValido e)
            {
                JOptionPane.showMessageDialog(null, "introduce numeros del 1 al 4");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "introduce un solamente un numero");
            }
         } 
        while (correcto == false);           
              correcto = false;
       switch (menu)
       {
           case 1:
               do {
                   try { 
               DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");
               String fechaNaci = JOptionPane.showInputDialog("Introduce tu fecha de nacimiento con el formato dd/MM/yyyy");
               LocalDate fechaNaciForma = LocalDate.parse(fechaNaci, forma);
               
               LocalDate fechaHoy = LocalDate.now();
               
               Period period = Period.between(fechaNaciForma, fechaHoy);
               JOptionPane.showMessageDialog(null, "Tienes " + period.getYears() + " años");
               correcto = true;
                   }
               catch (Exception e)
               {
                   JOptionPane.showMessageDialog(null, "Introduce solo numeros con el formato dd/MM/yyyy");
               }
                } 
               while (correcto == false);
            break;
           case 2:
               do {
                   try{
                       int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1"));
                       int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2"));
                       JOptionPane.showMessageDialog(null, num1 + " + " + num2 + "=" + (num1+num2));
                       correcto = true;
                   }
                   catch (Exception e)
                           {
                               JOptionPane.showMessageDialog(null, "Introduce solo caracteres numericos");
                           }
               } while (correcto == false);
           break;
           case 3:
               do {
                   try{
                       int contador=0;
                       String cadena = JOptionPane.showInputDialog("Escribeme una frase");
                       for (int i = 0; i < cadena.length(); i++) {
                           char dato = cadena.charAt(i);
                           if (Character.isDigit(dato) || !Character.isAlphabetic(dato)) {
                               throw new DigitoNoValido();
                           }
                            switch (dato)
                            {
                                case 'a':
                                case 'e':
                                case 'i':
                                case 'o':
                                case 'u':
                                   contador++;
                            }
                                    
                           
                       }
                       JOptionPane.showMessageDialog(null, cadena + " tiene exactamente " + contador + " vocales");
                       correcto=true;
                   }
                   catch (DigitoNoValido e)
                   {
                       JOptionPane.showMessageDialog(null, "Introduce solamente letras");
                   }
                   catch (Exception e)
                           {
                               JOptionPane.showMessageDialog(null, "Problemas");
                           }
               } while (correcto == false);               
           break;
           case 4:
              
           break;
           
       }
       
            
        
            
       
    
    
}
}
    
    

