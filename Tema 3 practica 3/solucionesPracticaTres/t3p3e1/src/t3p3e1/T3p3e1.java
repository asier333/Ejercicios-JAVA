
package t3p3e1;

import javax.swing.JOptionPane;

public class T3p3e1 {

    /**
     * Dada una cadena de caracteres mostrar por pantalla la cantidad de
        vocales que tiene. 
    * Ejemplo:
        Entrada: Hola tu
        Salida: La cantidad de vocales es 3
     */
    public static void main(String[] args) {
        String cadena = entradaCadena();
        int numero = contarVocales(cadena);
        JOptionPane.showMessageDialog(null, " La cadena tiene " + numero + " vocales");
    }
    
    public static String entradaCadena(){
        String cadena="";
        boolean correcto;
        do
        {
            try
            {
                cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
                if (cadena.isEmpty())
                    throw new CadenaNoValida();
                int x;
                for(x = 0; x < cadena.length() && !Character.isDigit(cadena.charAt(x)); x++){};
                if (x != cadena.length())
                    // Salimos de for por isAlphabetic == false
                    throw new CadenaNoValida();
                correcto = true;
                
            }
            catch(CadenaNoValida e)
            {
                JOptionPane.showMessageDialog(null,"Cadena no valida. No puede estar vacía  contener números.");
                correcto = false;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null,"No pulses cancelar o x");
                correcto = false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Problemas");
                correcto = false;
            }
           
        }
        while (!correcto);
        return cadena;
    }
    
    public static int contarVocales(String cadena){
        int contador = 0;
        // Repetitiva para ir recorriendo la cadena
        for(int x = 0; x < cadena.length(); x++)
        {
            // charAt(x) == caracter de la posición x
            switch (cadena.charAt(x))
            {
                case 'a':     case 'A':
                case 'e':     case 'E':
                case 'i':     case 'I':
                case 'o':     case 'O':
                case 'u':     case 'U':
                    contador = contador +1;
                    break;
            }
        }
        return contador; 
    }
    
}
