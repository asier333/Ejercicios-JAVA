/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author asier
 */
public class Pelicula {
    
    private String titulo;
    private int año;
    private float duracion;
    private String tipo;    

    private ArrayList<Estudio> listaEstudios;
    
    private Pelicula(String titulo, int año, float duracion, String tipo, ArrayList<Estudio> listaEstudio) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
        this.listaEstudios = listaEstudios;
    }

    private String getTitulo() {
        return titulo;
    }

    private int getAño() {
        return año;
    }

    private float getDuracion() {
        return duracion;
    }

    private String getTipo() {
        return tipo;
    }

    public ArrayList<Estudio> getListaEstudios() {
        return listaEstudios;
    }

    
    
    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private void setAño(int año) {
        this.año = año;
    }

    private void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setListaEstudios(ArrayList<Estudio> listaEstudios) {
        this.listaEstudios = listaEstudios;
    }
    
    
    
    private String modificaPelicula(){
        return null;
    }
    
    private String despliegaPelicula(){
        return null;
}
    
    private String eliminaPelicula(){
        return null;
}
}