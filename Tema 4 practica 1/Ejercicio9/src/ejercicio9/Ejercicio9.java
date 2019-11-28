/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author Asier
 */
public class Ejercicio9 {
/*private static int productos[][]*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fin;
        int productos[][] = new int [10][2];
        boolean correcto=false;
        productos[0][0]=10;
        productos[1][0]=23;
        productos[2][0]=30;
        productos[3][0]=47;
        productos[4][0]=55;
        productos[5][0]=65;
        productos[6][0]=135;
        productos[7][0]=256;
        productos[8][0]=526;
        productos[9][0]=663;
        do {
        int codigo = ComprobarCodigo(productos);
        int unidades = NumeroUnidades(productos, codigo);
        productos[codigo][1] += unidades;
        fin = Seguir();
        } while (fin.equalsIgnoreCase("si"));
        Total(productos);
    }
    
    public static int ComprobarCodigo(int productos[][]){
        boolean correcto=false;
        int codigo=0;
        do {
            try{
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del producto"));
                if (codigo<1) {
                    throw new NumeroNoValido();
                }
                for (int i = 0; i < productos.length && correcto!=true; i++) {
                    if (codigo==productos[i][0]) {
                        correcto=true;
                        codigo=i;
                    }
                        
                }
                if (correcto==false) {
                    JOptionPane.showMessageDialog(null, "Introduce un codigo de producto valido\n10, 23, 30, 47, 55, 65, 135, 256, 526, 663");
                }
                /*switch (codigo){
                    case 10:
                    case 23:
                    case 30:
                    case 47:
                    case 55:
                    case 65:
                    case 135:
                    case 256:
                    case 526:
                    case 663:
                        correcto=true;
                    break;
                    default:
                            JOptionPane.showMessageDialog(null, "Introduce un codigo de producto valido\n10, 23, 30, 47, 55, 65, 135, 256, 526, 663");
                }*/
            }
            catch (NumeroNoValido e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce un numero entero mayor que 0");
                    }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Problemas");
                    }
        } while (correcto==false);
        return codigo;
    }
    
    public static int NumeroUnidades(int productos[][], int codigo){
        boolean correcto=false;
        int unidades=0;
        do {
            try{
                unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de unidades adquiridas del producto " + productos[codigo][0]));
                if (unidades<1) {
                    throw new NumeroNoValido();
                }
                correcto=true;
            }
            catch (NumeroNoValido e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce un numero entero mayor que 0");
                    }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Problemas");
                    }
        } while (correcto==false);
        return unidades;
    }
    
    public static String Seguir(){
        String fin = "";
        boolean correcto = false;
        do {
            try{
                fin = JOptionPane.showInputDialog("¿Quieres seguir? si/no");
                if (fin.equalsIgnoreCase("si") || fin.equalsIgnoreCase("no")) {
                    correcto = true;
                }
                else
                    JOptionPane.showMessageDialog(null, "Introduce solamente   si/no");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problemas");
            }
        } while (correcto==false);
        return fin;
    }
    
    public static void Total(int productos[][]){
        String total = "";
        for (int i = 0; i < productos.length; i++) {
            
            for (int j = 0; j < productos.length-1; j++) {
                if (productos[j][1]>productos[j+1][1]) {
                    int cambio = productos[j][1];
                    productos[j][1]=productos[j+1][1];
                    productos[j+1][1] = cambio;
                    cambio = productos[j][0];
                    productos[j][0]=productos[j+1][0];
                    productos[j+1][0] = cambio;
                    }
                }
            }

        for (int i = 0; i < productos.length; i++) {
            if (productos[i][1]!=0) {
                total += "Se han vendido " + productos[i][1] + " unidades del producto " + productos[i][0] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, total);
    }
}
