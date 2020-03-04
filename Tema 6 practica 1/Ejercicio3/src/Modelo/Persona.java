/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author asier
 */
public class Persona {
    private String nombre;
    private String dNacimiento;
    private String mNacimiento;
    private String aNacimiento;
    private String direccion;
    private String codigo_postal;
    private String ciudad;

    public Persona(String nombre, String dNacimiento, String mNacimiento, String aNacimiento, String direccion, String codigo_postal, String ciudad) {
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
        this.mNacimiento = mNacimiento;
        this.aNacimiento = aNacimiento;
        this.direccion = direccion;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getdNacimiento() {
        return dNacimiento;
    }

    public String getmNacimiento() {
        return mNacimiento;
    }

    public String getaNacimiento() {
        return aNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setdNacimiento(String dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public void setmNacimiento(String mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public void setaNacimiento(String aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
    
}
