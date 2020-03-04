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
public class Pelicula extends Obra{
    
    private String productora;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String productora, int duracion, String titulo, int anoEdicion, ArrayList<Artista> artistaLista) {
        super(titulo, anoEdicion, artistaLista);
        this.productora = productora;
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    
}
