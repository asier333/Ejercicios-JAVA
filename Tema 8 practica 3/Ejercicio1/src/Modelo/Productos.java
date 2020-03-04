/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author asier
 */
public class Productos {
    
    private String nombre;
    private int uDdispo;
    private double precio;

    private ArrayList<Proveedores> listaProveedores;

    public Productos() {
    }

    public Productos(String nombre, int uDdispo, double precio, ArrayList<Proveedores> listaProveedores) {
        this.nombre = nombre;
        this.uDdispo = uDdispo;
        this.precio = precio;
        this.listaProveedores = listaProveedores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getuDdispo() {
        return uDdispo;
    }

    public void setuDdispo(int uDdispo) {
        this.uDdispo = uDdispo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Proveedores> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(ArrayList<Proveedores> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }
    
    
    
    
    
    public double precioVenta(){
        return precio*2;
    }
    
}
