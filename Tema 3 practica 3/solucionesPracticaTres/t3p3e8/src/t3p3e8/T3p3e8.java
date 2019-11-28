
package t3p3e8;

import javax.swing.JOptionPane;
import Excepciones.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/*
Desarrolla un proyecto que muestre en pantalla un menú con las siguientes opciones:
Calcular la edad de una persona.
Sumar dos números.
Contar cuantas vocales hay en una cadena.
Salir

Selecciona una opción:
	Si nos seleccionan la opción a, pediremos una fecha de nacimiento y restándosela al día de hoy, obtendremos la edad en años de esa persona.
	Si nos seleccionan la opción b, solicitaremos dos números y mostraremos el resultado de sumarlos.
	Si nos seleccionan la opción c, solicitaremos una cadena de caracteres y mostraremos en pantalla el número de vocales que la componen.
	Cuando nos seleccionen la opción d el programa terminará.
*/

public class T3p3e8 {

    public static void main(String[] args) {
        try
        {
            char opcion;
            do
            {
                opcion = mostrarMenu();
                switch (opcion)
                {
                    case 'a': calcularEdad();
                                   break;
                    case 'b': sumar();
                                   break;
                    case 'c': contar();
                                   break; 
                }
            }
            while (opcion != 'd');
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, " Problemas " + e.getClass());
        }
        
    }
    
    public static char mostrarMenu()throws Exception{
        char opcion=' ';
        boolean error;
        do
        {
            try
            {
                String opc = JOptionPane.showInputDialog(" a) Calcular edad \n"
                        + "b) Sumar dos números \n"
                        + "c) Contar vocales \n"
                        + "d) Salir \n\n"
                        + "Selecciona una opción: ");
                if (opc.length()!=1)
                    throw new OpcionNoValida();
                opcion = opc.toLowerCase().charAt(0);
                if (opcion != 'a' && opcion != 'b'&& opcion != 'c' && opcion != 'd')
                    throw new OpcionNoValida();
                
                error = false;
            }
            catch(OpcionNoValida e)
            {
                JOptionPane.showMessageDialog(null, "Opción no valida");
                error = true;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "Para salir pulsa d");
                error = true;
            }
        }
        while(error);
        return opcion;
        
    }
    public static void calcularEdad()throws Exception{
        // Sin repetitiva, que vuelva a seleccionar a en el menú
        try
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaString = JOptionPane.showInputDialog("Teclea tu fecha de nacimiento dd/MM/yyyy");
            LocalDate fechaNacimiento = LocalDate.parse(fechaString, formatter);
            
            LocalDate hoy = LocalDate.now();
            Period periodo = Period.between(fechaNacimiento, hoy);
            
            JOptionPane.showMessageDialog(null, "Tienes " + periodo.getYears()+ " años");
        }
        catch(DateTimeParseException e)
        {
            JOptionPane.showMessageDialog(null, "La fecha tecleada no es correcta");
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null, "Para salir pulsa d");
        }
    }
    public static void sumar()throws Exception{
        int n1 = solicitarNumero();
        int n2 = solicitarNumero();
        JOptionPane.showMessageDialog(null, " La suma de los dos números es igual a " + (n1+n2));
    }
    
    public static int solicitarNumero() throws Exception
    {
        boolean error;
        int n=0;
        do
        {
            try
            {
                n = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número"));
                error = false;
            }
            catch(NumberFormatException | NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "Teclea un número");
                error = true;
            }
        }
        while (error);
        return n;
    }
    
    public static void contar() throws Exception{
        boolean error;
        do
        {
            try
            {
                String cadena = JOptionPane.showInputDialog(null, "Teclea una cadena de caracteres").toLowerCase();
                int contadorVocales = 0;
                for(int x = 0; x < cadena.length(); x++)
                    if (cadena.charAt(x) == 'a' ||cadena.charAt(x) == 'e' || cadena.charAt(x) == 'i' || cadena.charAt(x) == 'o' || cadena.charAt(x) == 'u')
                        contadorVocales++;
                JOptionPane.showMessageDialog(null, "La cadena " + cadena + " contiene " + contadorVocales + " vocales");
                error = false;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "Teclea una cadena");
                error = true;
            }
        }
        while (error);
    }
    
}
