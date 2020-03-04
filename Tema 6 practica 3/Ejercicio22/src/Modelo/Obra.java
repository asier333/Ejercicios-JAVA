
package Modelo;

import java.util.ArrayList;

public class Obra {
    
    private String titulo;
    private int anoEdicion;
    
    private ArrayList<Artista> artistaLista;

    public Obra() {
    }

    public Obra(String titulo, int anoEdicion, ArrayList<Artista> artistaLista) {
        this.titulo = titulo;
        this.anoEdicion = anoEdicion;
        this.artistaLista = artistaLista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoEdicion() {
        return anoEdicion;
    }

    public void setAnoEdicion(int anoEdicion) {
        this.anoEdicion = anoEdicion;
    }

    public ArrayList<Artista> getArtistaLista() {
        return artistaLista;
    }

    public void setArtistaLista(ArrayList<Artista> artistaLista) {
        this.artistaLista = artistaLista;
    }
    
    
}
