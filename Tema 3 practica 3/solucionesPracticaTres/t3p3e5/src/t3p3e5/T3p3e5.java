package t3p3e5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class T3p3e5 {

    /**
     * Crear un programa que recoja una fecha introducida por el usuario
    como 3 campos numéricos (día, mes, año) y devuelva la fecha 100 días
    posterior mostrada con el formato: Viernes, 16 de noviembre de 2018.
     */
    public static void main(String[] args) {
     try
     {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el día"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Teclea el año"));
        // Validaciones??
        // Construir la fecha
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
         Date fechaUno = formatter.parse(dia+"/"+mes+"/" + ano);
         
         // Para sumar 100 días hay que pasar de Date a Calendar    
         Calendar calendar = Calendar.getInstance();
         calendar.setTime(fechaUno); 
         calendar.add(Calendar.DAY_OF_YEAR, 100);  
         
         // Visualizaciones varias 
         JOptionPane.showMessageDialog(null, "Visualización con getTime \n" + calendar.getTime());
         
         JOptionPane.showMessageDialog(null," Visualización con constantes\n " + (calendar.get(Calendar.DAY_OF_WEEK)+1) + ", " +
                   calendar.get(Calendar.DAY_OF_MONTH) + " de " +
                   (calendar.get(Calendar.MONTH)+1) + " del " +
                   calendar.get(Calendar.YEAR));
         
         // Para visualizar el día y el mes en letras tendré que plantear switch
         String diaSemana="";
         switch((calendar.get(Calendar.DAY_OF_WEEK)+1))
         {
             case 1: 
                 diaSemana = "Lunes";
                 break;
             case 2: 
                 diaSemana = "Martes";
                 break;
             case 3: 
                 diaSemana = "Miercoles";
                 break;
             case 4: 
                 diaSemana = "Jueves";
                 break;
             case 5: 
                 diaSemana = "Viernes";
                 break;
             case 6: 
                 diaSemana = "Sábado";
                 break;
             case 7: 
                 diaSemana = "Domingo";
                 break;
                 
                 
         }
         
         String mesLetra="";
         switch(calendar.get(Calendar.MONTH)+1)
         {
             case 1: 
                 mesLetra = "Enero";
                 break;
             case 2: 
                mesLetra = "Febrero";
                 break;
             case 3: 
                 mesLetra = "Marzo";
                 break;
             case 4: 
                mesLetra = "Abril";
                 break;
             case 5: 
                mesLetra = "Mayo";
                 break;
             case 6: 
                mesLetra = "Junio";
                 break;
             case 7: 
                 mesLetra = "Julio";
                 break;
            case 8: 
                mesLetra = "Agosto";
                 break;
             case 9: 
                mesLetra = "Septiembre";
                 break;
             case 10: 
                 mesLetra = "Octubre";
                 break;
             case 11: 
                mesLetra = "Noviembre";
                 break;
             case 12: 
                mesLetra = "Diciembre";
                 break;
     
         }
         
          JOptionPane.showMessageDialog(null," Visualización tras los switch \n" + diaSemana + ", " +
                   calendar.get(Calendar.DAY_OF_MONTH) + " de " +
                   mesLetra + " del " + calendar.get(Calendar.YEAR));
          
          
          
          
         // Con LocalDate
          LocalDate fecha = LocalDate.of(ano,mes,dia);
          fecha = fecha.plusDays(100);
          JOptionPane.showMessageDialog(null, fecha.getDayOfWeek()+ ", " + fecha.getDayOfMonth() +
                  " de " + fecha.getMonth()+ " del " + fecha.getYear());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
    }
    
}
