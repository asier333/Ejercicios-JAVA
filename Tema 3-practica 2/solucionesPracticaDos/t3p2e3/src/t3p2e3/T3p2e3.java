
package t3p2e3;

import javax.swing.JOptionPane;
import Excepciones.*;

public class T3p2e3 {

    public static void main(String[] args) {
       char opc=' ';
       do
       {
           try
           {
               opc = mostrarMenu();
               switch(opc){
                   case '1':
                       funcionSumar();
                       break;
                   case '2':
                       funcionRestar();
                       break;
                   case '3':
                       funcionTabla();
                       break;
                   case '4':
                       funcionDivision();
                       break;
               }
           }
           catch(OpcionNoValida e)
           {
               JOptionPane.showMessageDialog(null,"La opción elegida en el menú no es válida");
           }
           catch(NumberFormatException e)
           {
               JOptionPane.showMessageDialog(null,"Hay que teclear numeros");
           }
            catch(ArithmeticException e)
           {
               JOptionPane.showMessageDialog(null,"No se puede realizar la operación con los numeros introducidos");
           }
            catch(NullPointerException | StringIndexOutOfBoundsException e)
           {
               // pulsan x en el cuadro de dialogo de entrada o en el botón de cancelar
               // charAt(0)
               JOptionPane.showMessageDialog(null,"Es obligatorio proporcionar el dato de entrada");
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,"Problemas " + e.getClass() + e.getMessage());
           }
           
       }
       while(opc != '5');
    }
    
    public static char mostrarMenu() throws Exception
    {
         char opc =  JOptionPane.showInputDialog("1.- Sumar dos numeros \n"
                + "2.- Restar dos numeros \n"
                + "3.- Visualizar la tabla de multiplicar de un número \n"
                + "4.- Visualizar el cociente y el resto de una división \n"
                + "5.- Salir del programa\n\n"
                + "Elige una opción").charAt(0);
        if (opc < '1' || opc > '5')
            throw new OpcionNoValida();
        return opc;
                
    }
    
    public static int solicitarNumero() throws Exception
    {
        return Integer.parseInt(JOptionPane.showInputDialog("Teclea un número entero"));
    }
    
    public static void funcionSumar() throws Exception
    {
        int n1 = solicitarNumero();
        int n2 = solicitarNumero();
        JOptionPane.showMessageDialog(null," El resultado de la suma es: " + (n1 + n2));
    }
    public static void funcionRestar() throws Exception
    {
        int n1 = solicitarNumero();
        int n2 = solicitarNumero();
        JOptionPane.showMessageDialog(null," El resultado de la resta es: " + (n1 - n2));
    }
    public static void funcionTabla() throws Exception
    {
        String tabla="";
        int nro = solicitarNumero();
        for (int x = 0; x < 11; x++)
            tabla = tabla + nro + " x " + x + " = " + (nro * x) + "\n";
        JOptionPane.showMessageDialog(null, tabla);
    }
    public static void funcionDivision() throws Exception
    {
        int n1 = solicitarNumero();
        int n2 = solicitarNumero();
        JOptionPane.showMessageDialog(null," El cociente es " + (n1 / n2) + " y el resto " + (n1 % n2));
    }
    
}
