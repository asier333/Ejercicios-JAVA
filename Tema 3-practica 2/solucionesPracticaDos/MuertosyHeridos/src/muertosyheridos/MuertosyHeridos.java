
package muertosyheridos;

import javax.swing.JOptionPane;
import Excepciones.*;

public class MuertosyHeridos {
    
    public static void main(String[] args) {
        try
        {
            String numero = generarNumero();
            jugar(numero);
        }
        catch(Exception e )
        {
            JOptionPane.showMessageDialog(null, "Problemas en el main");
        }
    }
    
    public static String generarNumero()
    {
        // No codifico un try porque no son errores del usuario
        String numero;
        boolean error;
        do
        {
            error = false;
            Integer n1 = (int) (Math.random() * 999) + 1;
      
            // Comprobar que los tres dígitos son distintos. Para acceder a cada dígito convierto en String
            numero = String.valueOf(n1);
            // También se puede convertir así n1.toString()
            if (numero.charAt(0) == numero.charAt(1) || numero.charAt(0) == numero.charAt(2) || numero.charAt(1) == numero.charAt(2))
                error = true;
           // Si son más de tres dígitos habrá que plantearse una repetitiva
        }
        while (error);
        
        System.out.println(numero);
        return numero;
    }
    
    public static String entrada(){
        boolean correcto;
        String numero="";
        do
        {
            correcto = true;
            try
            {
                numero = JOptionPane.showInputDialog(null, "Teclea un número de tres cifras.");
                     
                // Tiene que ser un número de 3 cifras.
                if (numero.length()!= 3)
                {
                    throw new LongitudNoValida();
                }
                // Compruebo que son numeros
                for (int x=0;x < numero.length(); x++)
                {
                    if (!Character.isDigit(numero.charAt(x)))
                    {
                        throw new DatoNoNumerico();
                    }
                }
                // Tengo tres números. Ahora compruebo que son distintos
                if (numero.charAt(0) == numero.charAt(1) || numero.charAt(0) == numero.charAt(2) || numero.charAt(1) == numero.charAt(2))
                    throw new NumerosDistintos();
                        
            }
            catch(LongitudNoValida e)
            {
                JOptionPane.showMessageDialog(null,"Tres dígitos");
                correcto = false;
            }
            catch(DatoNoNumerico e)
            {
                JOptionPane.showMessageDialog(null,"Solo números");
                correcto = false;
            }
            catch(NumerosDistintos e)
            {
                JOptionPane.showMessageDialog(null,"Los tres números tienen que ser diferentes");
                correcto = false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Problemas con el número tecleado");
                correcto = false;
            }
        }
        while(!correcto);
        return numero;
    }
    
    public static void jugar(String numero) throws Exception{
        JOptionPane.showMessageDialog(null, "Empezamos a jugar");
        boolean continuar = true;
        do{
            String nro=entrada();
            
            if (nro.equals(numero))
            {
                continuar = false;
                JOptionPane.showMessageDialog(null, "ENHORABUENA");
            }
            else
            {
                String mensaje = buscarMuertos(nro,numero) + buscarHeridos(nro,numero);
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }
        while(continuar);
    }
    
    public static String buscarMuertos(String nro, String numero){
        int contador = 0;
        for(int x=0; x < numero.length();x++)
            if (nro.charAt(x)== numero.charAt(x))
                contador = contador + 1;
        return " Hay " + contador + " muertos \n";
    }
    
    public static String buscarHeridos(String nro, String numero){
        int contador = 0;
       /* for(int x=0; x < numero.length();x++)
        {
            int y;
            for(y=0; y < nro.length() && nro.charAt(y)!= numero.charAt(x) ;y++){}
            if (y != nro.length() && x != y)
                contador = contador + 1;
            
        }*/
        if (numero.charAt(0) == nro.charAt(1) || numero.charAt(0) == nro.charAt(2))
            contador ++;
        if (numero.charAt(1) == nro.charAt(0) || numero.charAt(1) == nro.charAt(2))
            contador ++;
        if (numero.charAt(2) == nro.charAt(0) || numero.charAt(2) == nro.charAt(1))
            contador ++;
        return " Hay " + contador + " heridos";
    }
}
