/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author Asier
 */
public class Ejercicio10 {
public static int matriz[][] = new int [4][4];
public static String array = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       RellenarMatriz();
       int menu;
        do {
       menu = Menu(); 
       switch (menu){
           case 1:
               SumaFila();
           break;
           case 2:
               SumaColumna();
           break;
           case 3:
               SumaDiaPri();
           break;
           case 4:
               SumaDiaInv();
           break;
           case 5:
               MediaMatriz();
           break;
           case 6:
              
           break;
            }
        } while (menu!=6);
    }
    
    public static void RellenarMatriz(){
        boolean correcto;
        for (int i = 0; i < matriz.length; i++) {
              for (int j = 0; j < matriz[i].length; j++) {
                 do {
                     correcto = false;
                        try{
                            matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para la posicion [" + i + "][" + j + "]"));
                                correcto = true;
                             }
                        catch (Exception e)
                        {
                            JOptionPane.showMessageDialog(null, "Introduce solo numeros enteros");
                        }
                    } while (correcto == false);
            }
                        
         }
        for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        array += "[" + matriz[i][j] + "]";
                    }
                   array += "\n";
                }
    }
    
    public static int Menu(){
        boolean correcto = false;
        int menu = 0;
        do {
            try{
                menu = Integer.parseInt(JOptionPane.showInputDialog("Intruce el numero de la operacion a ejecutar\n1-Suma de una fila\n2-Suma de una columna\n3-Suma de la diagonal principal\n4-Suma de la diagonal inversa\n5-Media de toda la matriz\n6-Salir"));
                if (menu<1 || menu>6) {
                    throw new NumeroNoValido();
                }
                correcto = true;
                
            }
            catch (NumeroNoValido e)
            {
                JOptionPane.showMessageDialog(null, "Introduce un numero del 1 al 6");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problemas");
            }
        } while (correcto==false);
        return menu;
    }
    
    public static void SumaFila(){
        boolean correcto=false;
        do {
            try{
                int suma=0;
                int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la fila que quieres sumar\n     0/1/2/3"));
                if (fila<0 || fila>3) {
                    throw new FilaColumnaNoValida();
                }
                for (int i = 0; i < matriz.length; i++) {
                    suma += matriz[fila][i];
                }
                correcto=true;
                JOptionPane.showMessageDialog(null, array + "\n\nLa suma de la fila " + fila + " es=" + suma);
            }
            catch (FilaColumnaNoValida e)
            {
                JOptionPane.showMessageDialog(null, "Introduce un numero del 0 al 3");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problemas");
            }
        } while (correcto==false);
    }
    
    public static void SumaColumna(){
        boolean correcto=false;
        do {
            try{
                int suma=0;
                int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la fila que quieres sumar\n     0/1/2/3"));
                if (fila<0 || fila>3) {
                    throw new FilaColumnaNoValida();
                }
                for (int i = 0; i < matriz.length; i++) {
                    suma += matriz[i][fila];
                }
                correcto=true;
                JOptionPane.showMessageDialog(null, array + "\n\nLa suma de la columna " + fila + " es=" + suma);
            }
            catch (FilaColumnaNoValida e)
            {
                JOptionPane.showMessageDialog(null, "Introduce un numero del 0 al 3");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problemas");
            }
        } while (correcto==false);
    }
    
    public static void SumaDiaPri(){
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        JOptionPane.showMessageDialog(null, array + "La suma de la diagonal principal es =" + suma);
    }
    
    public static void SumaDiaInv(){
        int suma = 0;
        for (int i = 0, x = matriz.length-1; i < matriz.length; i++,x--) {
            suma += matriz[i][x];
        }
        JOptionPane.showMessageDialog(null, array + "La suma de la diagonal inversa es =" + suma);
    }
    
    public static void MediaMatriz(){
        float suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, array + "La media de la matriz es =" + (suma/16));
    }
    
    
            
    
}
