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
public class Alumno {
    
    private String codigo;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String edad;
    private String sexo;
    private String fechaNaci;
    private String correoPerso;
    private String correoEgi;
    private String paginaWeb;
    private String curso;
    private String estadoCivil;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String domicilio, String telefono,String edad, String sexo, String fechaNaci, String correoPerso, String correoEgi, String paginaWeb, String curso, String estadoCivil) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.sexo = edad;
        this.sexo = sexo;
        this.fechaNaci = fechaNaci;
        this.correoPerso = correoPerso;
        this.correoEgi = correoEgi;
        this.paginaWeb = paginaWeb;
        this.curso = curso;
        this.estadoCivil = estadoCivil;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public String getCorreoPerso() {
        return correoPerso;
    }

    public void setCorreoPerso(String correoPerso) {
        this.correoPerso = correoPerso;
    }

    public String getCorreoEgi() {
        return correoEgi;
    }

    public void setCorreoEgi(String correoEgi) {
        this.correoEgi = correoEgi;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
    
    
}
