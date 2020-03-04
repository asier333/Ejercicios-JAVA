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
public class Libro extends Obra{
    
    private String editorial;
    private Integer numeroPaginas;

    public Libro() {
    }

    public Libro(String editorial, Integer numeroPaginas, String titulo, int anoEdicion, ArrayList<Artista> artistaLista) {
        super(titulo, anoEdicion, artistaLista);
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    
}
