package t4p1e1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class T4p1e1 {

    public static void main(String[] args) {
             // Declaración y creación del array
             float[] arrayNumeros;
             arrayNumeros= new float[10];
             
             // Entrada de datos
             for(int x=0; x<arrayNumeros.length; x++)
             {
                    arrayNumeros[x] = Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor de la posición " + x));        
             }
             
          
             for(float elemento: arrayNumeros)
             {
                   JOptionPane.showMessageDialog(null,elemento);        
             }
             
             
             // Salida
            float cantidadMinima = arrayNumeros[0];
            float cantidadMaxima = arrayNumeros[0];
            // También podemos inicializar con cero y 999


             for (int x = 1; x < arrayNumeros.length; x++)
             {
                if (arrayNumeros[x] < cantidadMinima)  
                    cantidadMinima = arrayNumeros[x];
                else
                    if (arrayNumeros[x] > cantidadMaxima)
                        cantidadMaxima = arrayNumeros[x];
             }
             JOptionPane.showMessageDialog(null,"El maximo valor  " + cantidadMaxima+ " y el mínimo "+ cantidadMinima);      
             
             
             // Version dos: sort
            Arrays.sort(arrayNumeros);
            JOptionPane.showMessageDialog(null,"El maximo valor  " + arrayNumeros[arrayNumeros.length - 1] + " y el mínimo "+ arrayNumeros[0]);      
    }
}
