/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio1 {
public static ArrayList <Double> valores = new ArrayList<Double>();
public static String valor = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menu;
        LlenarArrayList();
        do {
        menu = Menu();
        switch (menu){
            case 1:
                MaxMin();
            break;
            case 2:
                SolNum();
            break;
            case 3:
                SolNumBorr();
            break;
            case 4:
                ConvertArray();
            break;
            case 5:
                Tamaño();
            break;
            case 6:
                InsertFinal();
            break;
            case 7:
                InsertPosi();
            break;
            case 8:
                BorrarPosi();
            break;
            case 9:
                SumaMedia();
            break;
            case 10:
                JOptionPane.showMessageDialog(null, "Saliendo del programa");
            break;
        }
         } while (menu!=10);
    }
    
    public static void LlenarArrayList(){
        int contador=0;
        do {
            try{
            valores.add(Double.parseDouble(JOptionPane.showInputDialog("Introduce numero")));
            contador = JOptionPane.showConfirmDialog(null, "¿Quieres seguir?");
            }
            catch (NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce solamente numeros");
                    }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Problemas");
                    }
        } while (contador==0);
        
    }
    
    public static Integer Menu(){
        int menu=0;
        do {
            try{
                menu = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion:\n"
                        + "1-Visualizar el valor maximo y minimo\n"
                        + "2-Buscar un numero\n"
                        + "3-Borrar un numero\n"
                        + "4-Convertir en Array\n"
                        + "5-Mostrar el numero de elementos contenidos\n"
                        + "6-Insertar nuevo elemento al final\n"
                        + "7-Insertar nuevo elemento en la posicion indicada\n"
                        + "8-Borrar un elemento en la posicion indicada\n"
                        + "9-Suma de elementos y media\n"
                        + "10-Salir"));
                if (menu<1 || menu>10) {
                    throw new NumeroNoValido();
                }
        
            }
            catch (NumeroNoValido e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce solamente numeros del 1 al 10");
                    }
            catch (NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce solamente numeros");
                    }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Problemas");
                    }
        } while (menu<1 || menu>10);
        return menu;
    }
    
    public static void MaxMin(){
        int tamaño = valores.size();
        double max=-999999999;
        double min=999999999;
        for (int i = 0; i < tamaño; i++) {
            if (valores.get(i)>max) {
                max = valores.get(i);
            }
            if (valores.get(i)<min) {
                min = valores.get(i);
            }
        }
        Visualizar();
        JOptionPane.showMessageDialog(null,valor + "\nEl numero maximo es " + max + " y el numero minimo es " + min);
    }
    
    public static void SolNum(){
        double numero;
        boolean correcto = false;
        do {
            try{
                numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero a buscar"));
                for (int i = 0; i < valores.size() && correcto==false; i++) {
                    if (valores.get(i)==numero) {
                        Visualizar();
                        JOptionPane.showMessageDialog(null,valor + "\nEl numero numero " + numero + " se encuentra en la posicion " + i);
                        correcto=true;
                    }
                }
                    if (correcto==false) {
                    JOptionPane.showMessageDialog(null, "Siento decirte que tu numero no esta");
                }
                correcto=true;
                
            }
            catch (NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce solamente numeros");
                    }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Problemas");
                    }
        } while (correcto==false);
    }
    
    public static void SolNumBorr(){
        double numero;
        boolean correcto = false;
        do {
            try{
                numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero a borrar"));
                for (int i = 0; i < valores.size() && correcto==false; i++) {
                    if (valores.get(i)==numero) {
                        valores.remove(numero);
                        Visualizar();
                        JOptionPane.showMessageDialog(null,valor + "\nEl numero numero " + numero + " que se encuentra en la posicion " + i + " ha sido borrado");
                        correcto=true;
                    }
                }
                    if (correcto==false) {
                    JOptionPane.showMessageDialog(null, "Siento decirte que tu numero no esta");
                }
                correcto=true;
                
            }
            catch (NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce solamente numeros");
                    }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Problemas");
                    }
        } while (correcto==false);
    }
    
    public static void ConvertArray(){
        Double[]NuevaArray = valores.toArray(new Double[valores.size()]);
    /*Object[] NuevaArray = valores.toArray();*/
    String coso = "";
        for (int i = 0; i < NuevaArray.length; i++) {
            coso += NuevaArray[i] + " "; 
        }
        Visualizar();
        JOptionPane.showMessageDialog(null,(valor) +"\n" + (coso));
    }
    
    public static void Tamaño(){
        Visualizar();
        JOptionPane.showMessageDialog(null,valor + "\nEl arrayList contiene " + valores.size() + " elementos");
    }
    
    public static void InsertFinal(){
        try{
            valores.add(Double.parseDouble(JOptionPane.showInputDialog("Introduce numero")));
            Visualizar();
            JOptionPane.showMessageDialog(null, valor);
            }
            catch (NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce solamente numeros");
                    }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Problemas");
                    }
    }
    
    public static void InsertPosi(){
        int contador;
        try{
            contador = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion del numero"));
            valores.add(contador , Double.parseDouble(JOptionPane.showInputDialog("Introduce numero")));
            Visualizar();
            JOptionPane.showMessageDialog(null, valor);
            }
            catch (NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce solamente numeros");
                    }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Problemas");
                    }
    }
    
    public static void BorrarPosi(){
        
        try{
            int pos = Integer.parseInt(JOptionPane.showInputDialog("Introduce la poscion a borrar"));
            if (pos>(valores.size()-1)) {
                throw new NumeroNoValido();
            }
            valores.remove(pos);
            Visualizar();
            JOptionPane.showMessageDialog(null, valor);
            }
        catch (NumeroNoValido e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce solamente numeros entre 0 y " + (valores.size()-1));
                    }
            catch (NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce solamente numeros");
                    }
            catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Problemas");
                    }
    }
    
    public static void SumaMedia(){
        double suma=0;
        for (int i = 0; i < valores.size(); i++) {
            suma += valores.get(i);
        }
        Visualizar();
        JOptionPane.showMessageDialog(null,valor + "\nLa suma de los elementos es " + suma + " y la media es " + (suma/valores.size()));
    }
    
    public static void Visualizar(){
        valor = "";
        for (int i = 0; i < valores.size(); i++) {
            valor += valores.get(i) + "   ";
        }
    }
}
    