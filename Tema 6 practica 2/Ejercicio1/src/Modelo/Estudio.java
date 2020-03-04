/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author asier
 */
public class Estudio {
    
    private String nombre;
    private String ciudad;
    private String direccion;
    private String dirWeb;
    private LocalDate fechaFundacion;
    private String pais;
    private ArrayList<Integer> telefonos;

    public Estudio(String nombre, String ciudad, String direccion, String dirWeb, LocalDate fechaFundacion, String pais, ArrayList<Integer> telefonos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirWeb = dirWeb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.telefonos = telefonos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDirWeb() {
        return dirWeb;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public String getPais() {
        return pais;
    }

    public ArrayList<Integer> getTelefonos() {
        return telefonos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDirWeb(String dirWeb) {
        this.dirWeb = dirWeb;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setTelefonos(ArrayList<Integer> telefonos) {
        this.telefonos = telefonos;
    }

   private String modificaEstudio(){
       return null;
   }
   
   private String cierraEstudio(){
       return null;
   }
    
   private String despliegaEstudio(){
       return null;
   }
}
