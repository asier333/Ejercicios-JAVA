/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author asier
 */
public class Artista {
    
    private String nombre;
    private LocalDate fechaNacimiento;
    
    private ArrayList<Obra> obraLista;
    private ArrayList<Pelicula> peliculaLista;

    public Artista() {
    }

    public Artista(String nombre, LocalDate fechaNacimiento, ArrayList<Obra> obraLista, ArrayList<Pelicula> peliculaLista) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.obraLista = obraLista;
        this.peliculaLista = peliculaLista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Obra> getObraLista() {
        return obraLista;
    }

    public void setObraLista(ArrayList<Obra> obraLista) {
        this.obraLista = obraLista;
    }

    public ArrayList<Pelicula> getPeliculaLista() {
        return peliculaLista;
    }

    public void setPeliculaLista(ArrayList<Pelicula> peliculaLista) {
        this.peliculaLista = peliculaLista;
    }


}
