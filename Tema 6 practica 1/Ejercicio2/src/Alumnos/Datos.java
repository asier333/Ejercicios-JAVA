/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos;

import java.util.ArrayList;

/**
 *
 * @author asier
 */
public class Datos {
    
    //Atributos
    
    private ArrayList <Integer> codigo;
    private ArrayList <String> nombre;
    private ArrayList <String> direccion;
    private ArrayList <Integer> telefono;
    
    //Constructores

    public Datos() {
    }

    public Datos(ArrayList<Integer> codigo, ArrayList<String> nombre, ArrayList<String> direccion, ArrayList<Integer> telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Metodos set y get

    public ArrayList<Integer> getCodigo() {
        return codigo;
    }

    public ArrayList<String> getNombre() {
        return nombre;
    }

    public ArrayList<String> getDireccion() {
        return direccion;
    }

    public ArrayList<Integer> getTelefono() {
        return telefono;
    }

    public void setCodigo(ArrayList<Integer> codigo) {
        this.codigo = codigo;
    }

    public void setNombre(ArrayList<String> nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(ArrayList<String> direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(ArrayList<Integer> telefono) {
        this.telefono = telefono;
    }
    
    
    
}
