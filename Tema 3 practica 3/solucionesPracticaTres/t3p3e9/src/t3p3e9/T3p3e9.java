
package t3p3e9;

import javax.swing.JOptionPane;
import Excepciones.*;
import java.time.LocalDate;

public class T3p3e9 {
    
    // Datos de entrada por producto y cliente
    private static int unidades,iva;
    private static float precio;
    
    // Totales para la factura de un cliente
    private static double totalSinIva;
    private static double total4=0,total10=0,total21=0;

    public static void main(String[] args) {
        try 
        {
            String nombre =JOptionPane.showInputDialog(null, "Nombre del cliente o fin para finalizar");
            while (!nombre.equalsIgnoreCase("fin"))
            {
               String lineasPedido="";
               inicializarTotales();
                
                do
                {
                    solicitarProductos(); // Pedir y validar los datos de entrada
                    lineasPedido += generarLinea(); // generar la línea de pedido y guardar en totales.
                }
                while(JOptionPane.showConfirmDialog(null, "¿ Hay más productos?")==0);
                
                calcularTotales(nombre,lineasPedido); // Calculo totales e imprimo factura
                nombre =JOptionPane.showInputDialog(null, "Nombre del cliente o fin para finalizar");
            }
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Problemas: " + e.getMessage());
        }
    }
    
    public static void inicializarTotales()
    {
        totalSinIva = 0;
        total4 = 0;
        total10 = 0;
        total21= 0;
    }
    
    public static void solicitarProductos() throws Exception
    {
        boolean correcto;
        
        // solicitar unidades
        do
        {
            try
            {
                unidades = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de unidades: "));
                if(unidades < 1)
                    throw new UnidadesNoValidas();
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Es necesario un dato numérico");
                correcto = false;
            }
            catch(UnidadesNoValidas e)
            {
                JOptionPane.showMessageDialog(null,"Las unidades indicadas no son válidas");
                correcto = false;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null,"No se puede salir");
                correcto = false;
            }
        }
        while (!correcto);
        
        
        // solicitar precio
        do
        {
            try
            {
                precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Precio unitario: "));
                if(precio <= 0)
                    throw new PrecioNoValido();
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Es necesario un dato numérico");
                correcto = false;
            }
            catch(PrecioNoValido e)
            {
                JOptionPane.showMessageDialog(null,"El precio no puede ser menor o igual que cero");
                correcto = false;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null,"No se puede salir");
                correcto = false;
            }
        }
        while (!correcto);
        
        
        // Solicitar iva
        do
        {
            try
            {
                iva = Integer.parseInt(JOptionPane.showInputDialog(null, "% de IVA "));
                if (iva != 4 && iva!= 10 && iva != 21)
                    throw new IvaNoValido();
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Es necesario un dato numérico");
                correcto = false;
            }
            catch(IvaNoValido e)
            {
                JOptionPane.showMessageDialog(null,"El iva tiene que ser 4, 10 o 21");
                correcto = false;
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null,"No se puede salir");
                correcto = false;
            }
        }
        while (!correcto);
        
        // Un método por dato???
    }
    
    public static String generarLinea() throws Exception
    {
        float totalLinea = unidades * precio;
        // guardo para luego totales
        totalSinIva += totalLinea;
        
        gestionIva(totalLinea);
        
        return unidades + " * " + precio + " = " + totalLinea + "\n";
    }
    
    public static void calcularTotales(String nombre, String lineasPedido)
    {
        String factura = "NOMBRE: " +  nombre + "\n" +
                "FECHA: " + LocalDate.now() + "\n\n"+
                "LINEAS DEL PEDIDO" + "\n" +
                lineasPedido + "\n" +
                "TOTAL SIN IVA: " + totalSinIva + "\n\n" ;
        double totalIva = 0;
        double subtotal = 0;
        if (total4 != 0)
        {
            subtotal = total4*0.04;
            factura += "4% de " + total4 + " = " + subtotal + "\n";
            totalIva += subtotal;
        }
        if (total10 != 0)
        {
            subtotal = total10*0.1;
            factura += "10% de " + total10 + " = " + subtotal + "\n";
            totalIva += subtotal;
        }
        if (total21 != 0)
        {
            subtotal = total21*0.21;
            factura += "21% de " + total21 + " = " + subtotal+ "\n";
            totalIva += subtotal;
        }
        
        factura += "TOTAL IVA: " + totalIva + "\n";
        factura += "\n\nTOTAL FACTURA " + (totalIva + totalSinIva);
        JOptionPane.showMessageDialog(null,factura );
               
    }
    
    public static void gestionIva(float total){
        switch(iva)
        {
            case 4:
                total4+=total;
                break;
            case 10:
                total10+=total;
                break;
            case 21:
                total21+=total;
                break;
        }
    }
    
}
