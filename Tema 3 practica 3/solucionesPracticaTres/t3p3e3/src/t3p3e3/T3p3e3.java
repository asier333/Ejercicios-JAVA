
package t3p3e3;

import javax.swing.JOptionPane;

public class T3p3e3 {

    /**
     * Dada una cadena de caracteres y un carácter, verificar cuántas veces
    se repite el carácter en la cadena, por ejemplo:
    Entrada: casa blanca ’a’
    Salida: El carácter ’a’ se repite 4 veces
     */
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        char caracter = JOptionPane.showInputDialog("Teclea el carácter").charAt(0);
       
        //int veces = buscar(cadena, caracter);
        int veces = buscar2(cadena, caracter);
        
        String mensaje = String.format("El carácter %c aparece %d veces en la cadena %s",caracter,veces,cadena);
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
    public static int buscar(String cadena, char c){
        int contador = 0;
        for(int y = 0; y < cadena.length(); y++)
            if ( cadena.charAt(y)== c)
                contador++;
        return contador;
    }
    
    public static int buscar2(String cadena, char c){
       int contador = 0;
       int posicion;
       do
       {
           posicion = cadena.indexOf(c);
           if (posicion != -1)
           {
               // Lo encuentra
               contador++;
               // Me quedo con la parte en la que tengo que seguir buscando
               cadena = cadena.substring(posicion + 1, cadena.length());
           }
           
       }
       while(posicion != -1);
       return contador;
    }
    
}
