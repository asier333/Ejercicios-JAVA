package t3p3e6;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class T3p3e6 {

    /**
     * Crear un programa que reciba una fecha y que devuelva el nombre
        de la estación en la que está ubicado dicha fecha
        * 
        Primavera.  21 de marzo.
        Verano.  21 de junio.
        Otoño. 21 de septiembre.
        Invierno. 21 de diciembre
     */
    public static void main(String[] args) {
       // constantes
       final LocalDate PRIMAVERA = LocalDate.of(2019,3,21);
       final LocalDate VERANO = LocalDate.of(2019,6,21);
       final LocalDate OTOÑO = LocalDate.of(2019,9,21);
       final LocalDate INVIERNO = LocalDate.of(2019,12,21);
       
       boolean error = false;
       do
       {
           try
           {
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el día"));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
                LocalDate fecha = LocalDate.of(2019,mes,dia);

               if (fecha.isBefore(PRIMAVERA))
                   JOptionPane.showMessageDialog(null,"Invierno");
               else
                     if (fecha.isBefore(VERANO))
                        JOptionPane.showMessageDialog(null,"Primavera");
                    else
                           if (fecha.isBefore(OTOÑO))
                                JOptionPane.showMessageDialog(null,"Verano");
                           else
                                JOptionPane.showMessageDialog(null,"Otoño");
               error = false;
           }
           catch(DateTimeException e)
           {
               JOptionPane.showMessageDialog(null," Valores invalidos para convertirlos en fecha");
               error = true;
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,"Problemas");
               error = true;
           }
       }
       while(error);
    }
    
}
