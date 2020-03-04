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
public class Disco extends Obra{
    
    private String discografia;
    private int numeroCanciones;

    public Disco() {
    }
    
    public Disco(String discografia, int numeroCanciones, String titulo, int anoEdicion, ArrayList<Artista> artistaLista) {
        super(titulo, anoEdicion, artistaLista);
        this.discografia = discografia;
        this.numeroCanciones = numeroCanciones;
    }

    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

   
    
}
