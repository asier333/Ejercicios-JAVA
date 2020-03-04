
package Modelo;

public class Operaciones {
    
    
    //Atributo
    private double radio;
    
    //Constructores

    public Operaciones() {
    }

    public Operaciones(double radio) {
        this.radio = radio;
    }
    
    //Metodos set y get

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Metodos u operaciones
    
    public double getLong(double radio){
        return 2 * Math.PI * radio;
    }
    
    public double getArea(double radio){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double getVolumen(double radio){
        return (4 * Math.PI * Math.pow(radio, 3))/3;
    }
}
