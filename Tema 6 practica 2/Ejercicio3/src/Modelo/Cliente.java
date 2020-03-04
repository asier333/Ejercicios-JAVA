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
public class Cliente extends Persona{
    
    private int telefono_de_contacto;

    public Cliente() {
    }

    public Cliente(int telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public int getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(int telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }
    
    
}
