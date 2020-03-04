/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Modelo.*;
import Vista.*;
import java.util.ArrayList;
/**
 *
 * @author asier
 */
public class Ejercicio1 {

    public static ArrayList<Proveedores> listaProveedores;
    public static ArrayList<Productos> listaProductos;
    public static ArrayList<Clientes> listaClientes;
    public static vAlmacen v;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RellenarProveedores();
        RellenarProductos();
         v = new vAlmacen();
         v.setVisible(true);
        
    }
    
    public static void RellenarProveedores(){
        Proveedores p = new Proveedores("Britney");
        listaProveedores = new ArrayList();
        listaProveedores.add(p);
        p = new Proveedores("Melendi");
        listaProveedores.add(p);
        p = new Proveedores("Luciano");
        listaProveedores.add(p);
        p = new Proveedores("Doña Dolores");
        listaProveedores.add(p);
        p = new Proveedores("Eminem");
        listaProveedores.add(p);
    }
    
    public static void RellenarProductos(){
        ArrayList<Proveedores> pro = new ArrayList();
        pro.add(listaProveedores.get(0));
        pro.add(listaProveedores.get(2));
        Productos p = new Productos("Manzanas", 73, 7.14, pro);
        listaProductos = new ArrayList();
        listaProductos.add(p);
        
        pro = new ArrayList();
        pro.add(listaProveedores.get(1));
        pro.add(listaProveedores.get(4));
        p = new Productos("Limones", 37, 3.56, pro);
        listaProductos.add(p);
        
        pro = new ArrayList();
        pro.add(listaProveedores.get(3));
        p = new Productos("Tomates", 37, 2.84, pro);
        listaProductos.add(p);
    }
}
