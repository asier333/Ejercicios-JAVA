
package Modelo;


public class Camion extends Vehiculo{
    
    public MarcasCamion camion;

    public Camion() {
    }

    public Camion(MarcasCamion marca, String matricula, Persona persona) {
        super(matricula, persona);
        this.camion = marca;
    }

    public MarcasCamion getCamion() {
        return camion;
    }

    public void setCamion(MarcasCamion marca) {
        this.camion = marca;
    }

    
    
}
