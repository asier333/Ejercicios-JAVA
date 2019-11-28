/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import javax.swing.JOptionPane;

/**
 *
 * @author Asier
 */
public class Ejercicio11 {
public static String Productos[][] = {{"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},{"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},{"Kinder Bueno", "M&M", "Papa Delta", "Chicles de menta"},{"Lacasitos", "Crunch", "Milkybar", "KitKat"}};
public static float Precio[][] = {{1.1f, 0.8f, 1.5f, 0.9f},{1.8f, 1f, 1.2f, 1f},{1.8f, 1.3f, 1.2f, 0.8f},{1.5f, 1.1f, 1.1f, 1.1f}};
public static int Cantidad[][] = new int [4][4];
public static int Ventas[][] = new int [4][4];
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        LlenarCantidad();
        int menu;
        do {
        menu = Menu();
                switch (menu){
                case 1:
                    Pedir();
                break;
                case 2:
                    Mostrar();
                break;
                case 3:
                    Rellenar();
                break;
                case 4:
                    Salir();
                break;
            }
        } while (menu!=4);
    }
    
    public static void LlenarCantidad(){
        for (int i = 0; i < Cantidad.length; i++) {
            for (int j = 0; j < Cantidad[i].length; j++) {
                Cantidad[i][j] = 5;
            }
        }
        
    }
    
    public static int Menu(){
        boolean correcto = false;
        int menu = 0;
        do {
            try{
        
                menu = Integer.parseInt(JOptionPane.showInputDialog("1-Pedir golosina\n2-Mostrar golosinas\n3-Rellenar golosinas\n4-Apagar máquina"));
                if (menu<1 || menu>4) {
                    throw new NumeroNoValido();
                }
                correcto = true;
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Introduce solamente digitos");
            }
            catch (NumeroNoValido e)
            {
                JOptionPane.showMessageDialog(null, "Introduce un numero del 1 al 4");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problemas");
            }
        } while (correcto==false);
        return menu;
    }
    
    public static void Pedir(){
        boolean correcto=false;
        do {
            try{
                String posicion = JOptionPane.showInputDialog("Introduce el codigo de la golosina");
                    
                    if (posicion.length()==2) {
                        for (int i = 0; i < posicion.length(); i++) {
                            char pos = posicion.charAt(i);
                            if (!Character.isDigit(pos)) {
                                throw new NumeroNoValido();
                            }
                        }
                    }
                    else{
                        throw new Cantidad();
                    }
                    String poso1 = String.valueOf(posicion.charAt(0));
                    String poso2 = String.valueOf(posicion.charAt(1));
                    int pos1 = Integer.parseInt(poso1);
                    int pos2 = Integer.parseInt(poso2);
                   if (pos1<0 || pos1>3 || pos2<0 || pos2>3) {
                         throw new ArrayNoValida();
                }
                   
                if (Cantidad[pos1][pos2]>0) {
                    Cantidad[pos1][pos2]--;
                    JOptionPane.showMessageDialog(null, Productos[pos1][pos2] + " vale " + Precio[pos1][pos2] + "€\nToma la golosina");
                    Ventas[pos1][pos2]++;
               }
                else{
                    JOptionPane.showMessageDialog(null, "No quedan existencias de " + Productos[pos1][pos2] + ", posicion " + pos1 + pos2);
                }
                correcto=true;
            }
            catch (ArrayNoValida e)
            {
                JOptionPane.showMessageDialog(null, "Introduce los numeros:\n00-01-02-03\n10-11-12-13\n20-21-22-23\n30-31-32-33");
            }
            catch (NumeroNoValido e)
            {
                JOptionPane.showMessageDialog(null, "Introduce solamente numeros");
            }
            catch (Cantidad e)
            {
                JOptionPane.showMessageDialog(null, "Introduce solo 2 digitos");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problemas");
            }
            
        } while (correcto==false);
        
    }
    
    public static void Mostrar(){
        String cadena1 = "";
        for (int i = 0; i < Productos.length; i++) {
            /*cadena1 += "\n";*/
            for (int j = 0; j < Productos[0].length; j++) {
                cadena1 += "Codigo[" + i + "" + j + "] -- " + Productos[i][j] + "   [" + Precio[i][j] + "€]\n";
            }
        }
        JOptionPane.showMessageDialog(null, cadena1);
    }
    
    public static void Rellenar(){
        boolean correcto=false;
        String contraseña = JOptionPane.showInputDialog("Introduzca contraseña");
        if (contraseña.equals("MaquinaExpendedora2019")) {
        do {
            try{
                String posicion = JOptionPane.showInputDialog("Introduce el codigo de la golosina");
                    
                    if (posicion.length()==2) {
                        for (int i = 0; i < posicion.length(); i++) {
                            char pos = posicion.charAt(i);
                            if (!Character.isDigit(pos)) {
                                throw new NumeroNoValido();
                            }
                        }
                    }
                    else{
                        throw new Cantidad();
                    }
                    String poso1 = String.valueOf(posicion.charAt(0));
                    String poso2 = String.valueOf(posicion.charAt(1));
                    int pos1 = Integer.parseInt(poso1);
                    int pos2 = Integer.parseInt(poso2);
                   if (pos1<0 || pos1>3 || pos2<0 || pos2>3) {
                         throw new ArrayNoValida();
                }
                   int cantidad = Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad a añadir a " + Productos[pos1][pos2]));
                   if (cantidad<1) {
                       throw new NegativoNoValido();
                }
                   Cantidad[pos1][pos2] += cantidad;
                correcto=true;
             }
            catch (NegativoNoValido e)
            {
                JOptionPane.showMessageDialog(null, "Introduce numeros mayores que 0");
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Introduce solamente numeros");
            }
            catch (ArrayNoValida e)
            {
                JOptionPane.showMessageDialog(null, "Introduce los numeros:\n00-01-02-03\n10-11-12-13\n20-21-22-23\n30-31-32-33");
            }
            catch (NumeroNoValido e)
            {
                JOptionPane.showMessageDialog(null, "Introduce solamente numeros");
            }
            catch (Cantidad e)
            {
                JOptionPane.showMessageDialog(null, "Introduce solo 2 digitos");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Problemas");
            }
            
        } while (correcto==false);
        }
        else  
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
       }
    
    public static void Salir(){
        String ventas="";
        for (int i = 0; i < Ventas.length; i++) {
            for (int j = 0; j < Ventas[0].length; j++) {
                if (Ventas[i][j]>0) {
                    ventas+= "Codigo [" + i + "" + j + "] -- " + Productos[i][j] + " vendidas " + Ventas[i][j] + " unidades\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, ventas);
    }
    }
