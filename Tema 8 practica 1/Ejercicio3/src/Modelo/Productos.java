
package Modelo;

/**
@author asier
 */
public class Productos {
    
    private String nombre;
    private double precioUd;
    private int numeroUd;

    public Productos(String nombre, double precioUd, int numeroUd) {
        this.nombre = nombre;
        this.precioUd = precioUd;
        this.numeroUd = numeroUd;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUd() {
        return precioUd;
    }

    public void setPrecioUd(double precioUd) {
        this.precioUd = precioUd;
    }

    public int getNumeroUd() {
        return numeroUd;
    }

    public void setNumeroUd(int numeroUd) {
        this.numeroUd = numeroUd;
    }
    
    public double importe(){
        double importe = precioUd * numeroUd;
        return importe;
    }
}
