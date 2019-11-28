package t3p3e2;

import javax.swing.JOptionPane;

public class T3p3e2 {

    /**
     * Dada una cadena de caracteres invertir la misma y mostrar 
     * por pantalla.
    Ejemplo:
    Entrada: casa blanca
    Salida: acnalb asac
     */
    public static void main(String[] args) {
        // Supongo que la cadena es correcta. 
        // Serían las mismas validaciones que en el ejercicio anterior.
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        invertirCadena(cadena);
        invertirCadenaV2(cadena);
        invertirCadenaV3(cadena);
    }
    public static void invertirCadena(String cadena){
        String cadenaInvertida="";
        // Recorrer desde el final al principio.
        for(int y = cadena.length()-1; y >= 0; y--)
        {
            cadenaInvertida = cadenaInvertida + cadena.charAt(y);
        }
        JOptionPane.showMessageDialog(null, " La cadena invertida es " + cadenaInvertida);
    }
    public static void invertirCadenaV2(String cadena){
        StringBuilder cadenaInvertida = new StringBuilder(); 
        // Recorrer desdee el final al principio.
        for(int y = cadena.length()-1; y >= 0; y--)
        {
            cadenaInvertida.append(cadena.charAt(y)); 
        }
        JOptionPane.showMessageDialog(null, " La cadena invertida es " + cadenaInvertida);
    }
    
    public static void invertirCadenaV3(String cadena){
        StringBuilder cadenaInvertida = new StringBuilder(cadena); 
        JOptionPane.showMessageDialog(null, " La cadena invertida es " + cadenaInvertida.reverse());
    }
    
}
