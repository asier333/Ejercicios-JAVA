
package t3p3e7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class T3p3e7 {

    /**
     *Crear un programa que reciba dos fechas y que devuelva la cantidad
      de domingos comprendidos entre ambas fechas
     */
    
    public static void main(String[] args) {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
         String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
         LocalDate fechaUno = LocalDate.parse(fechaString, formatter);
           
         fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
         LocalDate fechaDos = LocalDate.parse(fechaString, formatter);
         
         int contador = 0;
         while(fechaUno.isBefore(fechaDos))
         {
             if (fechaUno.getDayOfWeek()==DayOfWeek.SUNDAY)
                 contador++;
             fechaUno = fechaUno.plusDays(1);
         }
         JOptionPane.showMessageDialog(null, "Hay " + contador + " domingos");
         
         // Solución dos: Buscar el primer domingo y luego ir sumando siete
    }
    
}
