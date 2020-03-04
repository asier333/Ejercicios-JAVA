
package Modelo;


public class Coche extends Vehiculo{
    
    public MarcasCoche coche;

    public Coche() {
    }
    
    public Coche(MarcasCoche coche, String matricula, Persona persona) {
        super(matricula, persona);
        this.coche = coche;
    }

    public MarcasCoche getCoche() {
        return coche;
    }

    public void setCoche(MarcasCoche coche) {
        this.coche = coche;
    }
    
    
}
