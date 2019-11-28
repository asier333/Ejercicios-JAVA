package t3p3e4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class T3p3e4 {

    /**
     * Crear un programa que calcule la diferencia en días entre dos fechas
      dadas por el usuario como cadenas con el formato dd/mm/yy.
     */
    public static void main(String[] args) {
        // Con Date
        try{
            String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
            Date fechaUno = formato.parse(fechaString);
        
            fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
            Date fechaDos = formato.parse(fechaString);
        
            // resta
            Long milisegundos = fechaUno.getTime() - fechaDos.getTime();
            // 24 horas * 60 minutos * 60 segundos * 1000 milisegundos = 86.400.000
            Long dias = milisegundos / 86400000;
            JOptionPane.showMessageDialog(null, "La diferencia entre " + fechaUno + " y " + fechaDos + " es de " + dias + " días");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
        
        // Con Calendar
        try{
            
            Calendar fechaUno = Calendar.getInstance();
            Calendar fechaDos = Calendar.getInstance();
            
            String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
            fechaUno.setTime(formatter.parse(fechaString));
           
            fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
            fechaDos.setTime(formatter.parse(fechaString));
            // resta
            Long milisegundos = fechaUno.getTimeInMillis() - fechaDos.getTimeInMillis();
            Long dias = milisegundos / 86400000;
            JOptionPane.showMessageDialog(null, "La diferencia es de " + dias + " días");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas "+ e.getClass());
        }
        
        // Con LocalDate
        try{
           
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
            LocalDate fechaUno = LocalDate.parse(fechaString, formatter);
           
        
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
            int año = Integer.parseInt(JOptionPane.showInputDialog("Teclea el año"));
            
            // Validaciones ???
            LocalDate fechaDos = LocalDate.of(año,mes,dia);
          
            Period period = Period.between(fechaUno, fechaDos);
            JOptionPane.showMessageDialog(null, "La diferencia es de " + period.getYears() + " años" + period.getMonths() + " meses y " + period.getDays() + " días");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
    }
    
}
