package t4p1e1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class T4p1e1 {

    public static void main(String[] args) {
        try
        {
             // Declaración y creación del array
             float[] arrayNumeros= new float[10];
             entradaDatos(arrayNumeros);
             salidaDatos(arrayNumeros);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas: " + e.getMessage());
        }
    }

    private static void entradaDatos(float[] arrayNumeros) throws Exception
    {
        
            for(int x=0; x<arrayNumeros.length; x++)
            {
                try
                {
                    arrayNumeros[x] = Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor de la posición " + x));        
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null,"Los números han de ser de tipo float");
                    x--;
                }
            }
            // return ?
        
    }

    private static void salidaDatos(float[] arrayNumeros) throws Exception
    {
       float cantidadMinima = arrayNumeros[0];
       float cantidadMaxima = arrayNumeros[0];
             

        for (int x = 1; x < arrayNumeros.length; x++)
        {
            if (arrayNumeros[x] < cantidadMinima)  
                cantidadMinima = arrayNumeros[x];
            else
                if (arrayNumeros[x] > cantidadMaxima)
                    cantidadMaxima = arrayNumeros[x];
        }
          
        JOptionPane.showMessageDialog(null,"El maximo valor  " + cantidadMaxima+ " y el mínimo "+ cantidadMinima);      
        
        // Versión dos: for mejorado
        cantidadMinima = 99;
        cantidadMaxima = 0;
        for(float dato : arrayNumeros)
        {
            if (dato > cantidadMaxima)
                cantidadMaxima = dato;
            if (dato < cantidadMinima)
                cantidadMinima = dato;
        }
        JOptionPane.showMessageDialog(null,"El maximo valor  " + cantidadMaxima+ " y el mínimo "+ cantidadMinima);      
        
        // Versión tres: sort
        Arrays.sort(arrayNumeros);
        JOptionPane.showMessageDialog(null,"El maximo valor  " + arrayNumeros[arrayNumeros.length - 1] + " y el mínimo "+ arrayNumeros[0]);      
        
        
    }
}
