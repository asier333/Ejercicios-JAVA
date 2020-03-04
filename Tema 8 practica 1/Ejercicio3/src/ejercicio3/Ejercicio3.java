
package ejercicio3;

import Modelo.*;
import Vista.*;
import java.util.ArrayList;
/**
 *
 * @author asier
 */
public class Ejercicio3 {

    public static vEleccion vE;
    public static vCompras vC;
    public static vVentas vV;
    public static ArrayList<Productos>listaProductos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RellenarProductos();
        VentanaElec();
    }
    
    public static void RellenarProductos(){
        listaProductos = new ArrayList();
        Productos p = new Productos("Manzanas", 3.2, 50);
        listaProductos.add(p);
        p = new Productos("Patatas", 2.4, 70);
        listaProductos.add(p);
        p = new Productos("Tomates", 2.8, 100);
        listaProductos.add(p);
    }
    
    public static void VentanaElec(){
        vE = new vEleccion();
        vE.setVisible(true);
    }
    
    public static void VentanaCompras(){
        vE.dispose();
        vC = new vCompras();
        vC.setVisible(true);
    }
    
    public static void VentanaVentas(){
        vE.dispose();
        vV = new vVentas();
        vV.setVisible(true);
    }
    
    
    
    public static void SalirElec(){
        vE.dispose();
        System.exit(0);
    }
    
    public static void SalirCompras(){
        vC.dispose();
        System.exit(0);
    }
    
    public static void SalirVentas(){
        vV.dispose();
        System.exit(0);
    }
}
