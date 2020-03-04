
package Modelo;


public class Moto extends Vehiculo{
    
    public MarcasMoto moto;

    public Moto() {
    }

    public Moto(MarcasMoto moto, String matricula, Persona persona) {
        super(matricula, persona);
        this.moto = moto;
    }

    public MarcasMoto getMoto() {
        return moto;
    }

    public void setMoto(MarcasMoto moto) {
        this.moto = moto;
    }
    
    
}
