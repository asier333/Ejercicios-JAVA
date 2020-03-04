/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author asier
 */
public class Empleado extends Persona{
    private float sueldo_bruto;

    public Empleado(float sueldo_bruto, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public float getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(float sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    
    
    
}
