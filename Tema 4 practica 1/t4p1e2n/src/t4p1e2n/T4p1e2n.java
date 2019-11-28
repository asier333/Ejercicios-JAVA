
package t4p1e2n;

import javax.swing.JOptionPane;

/*
Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9, 
al ﬁnal muestra por pantalla el valor de cada posición y la suma de todos los valores
*/

public class T4p1e2n {

    private static int[] numeros; // Declaración como global

    public static void main(String[] args) {
       try
       {
          numeros=new int[Integer.parseInt(JOptionPane.showInputDialog("Indica el número de elementos"))]; // Creación
          llenado();
          mostrar();
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "Problemas: " + e.getMessage());
       }
    }
    
    public static void llenado() throws Exception
    {
       for(int x=0; x < numeros.length; x++)
       {
            numeros[x] = (int) (Math.random() * 10);
       }
    }
    
    public static void mostrar() throws Exception
    {
        int suma = 0;
        String datos = "";
        for(int x=0; x < numeros.length; x++)
        {
            datos += "Posición: " + x + " contenido: " + numeros[x] + "\n";
            suma += numeros[x];
        }
        JOptionPane.showMessageDialog(null, datos + " La suma asciende a: " + suma);
        
    }
    
}
