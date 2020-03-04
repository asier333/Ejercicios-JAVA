
package ejercicio1;

import Modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Excepciones.*;

public class Ejercicio1 {
public static ArrayList<Persona>listaPersona = new ArrayList();
public static ArrayList<Vehiculo>listaVehiculo = new ArrayList();
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            do {
                RellenarPersona();
                
                } while (JOptionPane.showConfirmDialog(null, "Quieres Seguir?")==0);
            }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "problemas");
        }
        Mostrar();
        MostrarVehi();
    }
    
   
    public static void RellenarPersona(){
        
        Persona persona = new Persona();
        
        persona.setDni(JOptionPane.showInputDialog("Introduce el dni"));
        persona.setNombre(JOptionPane.showInputDialog("Introduce el nombre"));
        persona.setApellidos(JOptionPane.showInputDialog("Introduce los apellidos"));
        persona.setDireccion(JOptionPane.showInputDialog("Introduce la direccion"));
        persona.setTelefono(JOptionPane.showInputDialog("Introduce el telefono"));
        
        ArrayList<Vehiculo>vehiculo =RellenarVehiculo(persona);
        persona.setListaVehiculo(vehiculo);
        listaPersona.add(persona);
       
    }
    
    public static ArrayList<Vehiculo> RellenarVehiculo(Persona persona){
        
        ArrayList<Vehiculo>vehiculo = new ArrayList();
               
                    do {
            String modelo = JOptionPane.showInputDialog("Que tipo de vehiculo tienes?");            
        switch (modelo){
            case "Coche":
                String marcaC = JOptionPane.showInputDialog("Marca de tu " + modelo + "?");
                MarcasCoche marcaCo = MarcasCoche.valueOf(marcaC);
                Coche coche = new Coche();
                coche.setMatricula(JOptionPane.showInputDialog("Matricula de tu " + modelo + "?"));
                coche.setCoche(marcaCo);
                coche.setPersona(persona);
                vehiculo.add(coche);
                listaVehiculo.add(coche);
            break;
            case "Moto":
                String marcaM = JOptionPane.showInputDialog("Marca de tu " + modelo + "?");
                MarcasMoto marcaMo = MarcasMoto.valueOf(marcaM);
                Moto moto = new Moto();
                moto.setMatricula(JOptionPane.showInputDialog("Matricula de tu " + modelo + "?"));
                moto.setMoto(marcaMo);
                moto.setPersona(persona);
                vehiculo.add(moto);
                listaVehiculo.add(moto);
            break;
            case "Camion":
                String marcaCa = JOptionPane.showInputDialog("Marca de tu " + modelo + "?");
                MarcasCamion marcaCam = MarcasCamion.valueOf(marcaCa);
                Camion camion = new Camion();
                camion.setMatricula(JOptionPane.showInputDialog("Matricula de tu " + modelo + "?"));
                camion.setCamion(marcaCam);
                camion.setPersona(persona);
                vehiculo.add(camion);
                listaVehiculo.add(camion);
            break;
                        
        }
                    
                    
                    } while (JOptionPane.showConfirmDialog(null, "Hay mas vehiculos?")==0);
                    
        
        
        return vehiculo;
    }
    
    public static void Mostrar(){
        
        String dni = JOptionPane.showInputDialog("introduce el dni de la persona que quieras mostrar");
        boolean correcto = false;
        String resultados = "";
        String coches = "Coches:\n";
        String motos = "Motos:\n";
        String camiones = "Camiones:\n";
        for (int i = 0; i < listaPersona.size() && correcto==false; i++) {
            if (dni.equals(listaPersona.get(i).getDni())) {
                
                resultados = "DNI: " + listaPersona.get(i).getDni() + 
                        "\nNombre: " + listaPersona.get(i).getNombre() + 
                        "\nApellidos: " + listaPersona.get(i).getApellidos() +
                        "\nDireccion: " + listaPersona.get(i).getDireccion() +
                        "\nTelefono: " + listaPersona.get(i).getTelefono() + 
                        "\n\n";
                for (int j = 0; j < listaPersona.get(i).getListaVehiculo().size(); j++) {
                    
                    if (listaPersona.get(i).getListaVehiculo().get(j) instanceof Coche) {
                        Coche c = (Coche)listaPersona.get(i).getListaVehiculo().get(j);
                        coches += "Marca " + c.getCoche() + " matricula " + c.getMatricula() + "\n";
                    }
                    else
                        if (listaPersona.get(i).getListaVehiculo().get(j) instanceof Moto) {
                        Moto m = (Moto)listaPersona.get(i).getListaVehiculo().get(j);
                        motos += "Marca " + m.getMoto() + " matricula " + m.getMatricula() + "\n";
                    }
                    else
                            if (listaPersona.get(i).getListaVehiculo().get(j) instanceof Camion) {
                        Camion ca = (Camion)listaPersona.get(i).getListaVehiculo().get(j);
                        camiones += "Marca " + ca.getCamion() + " matricula " + ca.getMatricula() + "\n";
                    }
                }
                        
                correcto = true;
            }
        }
        resultados += coches + motos + camiones;
        JOptionPane.showMessageDialog(null, resultados);
    }
    
    public static void MostrarVehi(){
        
        String matricula = JOptionPane.showInputDialog("Introduce la matricula de un vehiculo");
        String resultados = "";
        String coches = "El coche de matricula:\n";
        String motos = "La motos:\n";
        String camiones = "El camiones:\n";
        boolean correcto = false;
        for (int i = 0; i < listaVehiculo.size() && correcto==false; i++) {
            if (matricula.equals(listaVehiculo.get(i).getMatricula())) {
                
                    
                    if (listaVehiculo.get(i) instanceof Coche) {
                        Coche c = (Coche)listaVehiculo.get(i);
                        coches += c.getMatricula() + "y marca " + c.getCoche() + "pertenece:\n";
                        resultados += coches;
                    }
                    else
                        if (listaVehiculo.get(i) instanceof Moto) {
                        Moto m = (Moto)listaVehiculo.get(i);
                        motos += m.getMatricula() + "Marca " + m.getMoto() + "peretene:\n";
                        resultados += motos;
                    }
                    else
                            if (listaVehiculo.get(i) instanceof Camion) {
                        Camion ca = (Camion)listaVehiculo.get(i);
                        camiones += ca.getMatricula() + "Marca " + ca.getCamion() + "pertenece:\n";
                        resultados += camiones;
                    }
                
                    resultados += "DNI:" + listaVehiculo.get(i).getPersona().getDni()
                            + "\nNombre: " + listaVehiculo.get(i).getPersona().getNombre()
                            + "\nApellidos " + listaVehiculo.get(i).getPersona().getApellidos()
                            + "\nDireccion " + listaVehiculo.get(i).getPersona().getDireccion()
                            + "\nTelefono " + listaVehiculo.get(i).getPersona().getTelefono();
                
                correcto = true;
            }
        }
        JOptionPane.showMessageDialog(null, resultados);
        }
    
}
