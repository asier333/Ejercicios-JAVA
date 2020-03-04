/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;
import java.util.regex.*;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Modelo.*;
import java.util.ArrayList;
/**
 *
 * @author asier
 */
public class Ejercicio21 {
public static ArrayList<Alumno> lista = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        do {
            Alumno alumno = new Alumno();
            alumno.setCodigo(Codigo());
            alumno.setNombre(Nombre());
            alumno.setDomicilio(Domicilio());
            alumno.setTelefono(Telefono());
            alumno.setEdad(Edad());
            alumno.setSexo(Sexo());
            alumno.setFechaNaci(FechaNaci());
            alumno.setCorreoPerso(CorreoPerso());
            alumno.setCorreoEgi(CorreoEgi());
            alumno.setPaginaWeb(PaginaWeb());
            alumno.setCurso(Curso());
            alumno.setEstadoCivil(EstadoCivil());
        lista.add(alumno);
      } while (JOptionPane.showConfirmDialog(null, "¿Quieres seguir?")==0);
        String cod = JOptionPane.showInputDialog("Teclea el codigo del alumno a visualizar");
        boolean correcto = false;
        int i;
        for ( i = 0; i < lista.size() && correcto==false; i++) {
            if (cod.equalsIgnoreCase(lista.get(i).getCodigo())) {
                correcto=true;
                JOptionPane.showMessageDialog(null, "Alumno " 
                + lista.get(i).getCodigo() 
                + " " + lista.get(i).getNombre()
                + " " + lista.get(i).getDomicilio()
                + " " + lista.get(i).getTelefono()
                + " " + lista.get(i).getEdad()
                + " " + lista.get(i).getSexo()
                + " " + lista.get(i).getFechaNaci()
                + " " + lista.get(i).getCorreoPerso()
                + " " + lista.get(i).getCorreoEgi()
                + " " + lista.get(i).getPaginaWeb()
                + " " + lista.get(i).getCurso()
                + " " + lista.get(i).getEstadoCivil());
            }
            
        }
        
        
    }
    
    public static String Codigo(){
        boolean correcto = false;
        String codigo = "";
            do {
                codigo = JOptionPane.showInputDialog("Introduce el codigo del alumno (5 digitos numericos)");
                Pattern pat = Pattern.compile("^\\d{5}$");
                Matcher validar = pat.matcher(codigo);
                if (validar.matches()) {
                    correcto = true;
                }
                else
                    JOptionPane.showMessageDialog(null, "Codigo no valido");
            } while (correcto==false);
        return codigo;
    }
    
    public static String Nombre(){
        /*boolean correcto=false;
        String nombre="";
        do {
            nombre = JOptionPane.showInputDialog("Nombre del alumno(primera letra mayuscula)");
            Pattern pat = Pattern.compile("^[A-Z][a-z]+");
            Matcher validar = pat.matcher(nombre);
            if (validar.matches()) {
                correcto=true;
            }
            else
                JOptionPane.showMessageDialog(null, "Nombre no valido");
        } while (correcto==false);
        return nombre;*/return "";
    }
    
    public static String Domicilio(){
        /*boolean correcto=false;
        String domicilio="";
        do {
            domicilio = JOptionPane.showInputDialog("Domicilio del alumno(calle)");
            Pattern pat = Pattern.compile("^([A-Z][a-z]+)|([A-Z][a-z]+)[ ]([A-Z][a-z]+)");
            Matcher validar = pat.matcher(domicilio);
            if (validar.matches()) {
                correcto=true;
            }
            else
                JOptionPane.showMessageDialog(null, "Domicilio no valido");
        } while (correcto==false);
        return domicilio;*/return "";
    }
    
    public static String Telefono(){
        /*boolean correcto=false;
        String telefono="";
        do {
            telefono = JOptionPane.showInputDialog("Telefono del alumno(9 numeros)");
            Pattern pat = Pattern.compile("^\\d{9}$");
            Matcher validar = pat.matcher(telefono);
            if (validar.matches()) {
                correcto=true;
            }
            else
                JOptionPane.showMessageDialog(null, "Telefono no valido");
        } while (correcto==false);
        return telefono;*/return "";
    }
    
    public static String Edad(){
        boolean correcto=false;
        String edad="";
        do {
            edad = JOptionPane.showInputDialog("Edad del alumno(1 o 2 numeros)");
            Pattern pat = Pattern.compile("^\\d{1,2}$");
            Matcher validar = pat.matcher(edad);
            if (validar.matches()) {
                correcto=true;
            }
            else
                JOptionPane.showMessageDialog(null, "Edad no valido");
        } while (correcto==false);
        return edad;
    }
    
    public static String Sexo(){
        /*boolean correcto=false;
        String sexo="";
        do {
            sexo = JOptionPane.showInputDialog("Sexo del alumno(H, M, O)");
            Pattern pat = Pattern.compile("^[HMO]$");
            Matcher validar = pat.matcher(sexo);
            if (validar.matches()) {
                correcto=true;
            }
            else
                JOptionPane.showMessageDialog(null, "Sexo no valido");
        } while (correcto==false);
        return sexo;*/return "";
    }
    
    public static String FechaNaci(){
        /*boolean correcto=false;
        String fechaNaci="";
        do {
            fechaNaci = JOptionPane.showInputDialog("Fecha de nacimiento del alumno(dd/mm/yyyy)");
            Pattern pat = Pattern.compile("^([1-9]|[12]\\d|3[01])[/]([1-9]|1[012])[/][0-9]{4}$");
            Matcher validar = pat.matcher(fechaNaci);
            if (validar.matches()) {
                correcto=true;
            }
            else
                JOptionPane.showMessageDialog(null, "Fecha de nacimiento no valida");
        } while (correcto==false);
        return fechaNaci;*/return "";
    }
    
    public static String CorreoPerso(){
        /*boolean correcto=false;
        String correoPerso="";
        do {
            correoPerso = JOptionPane.showInputDialog("Correo personal del alumno(todas minusculas - xx@xx.com/es)");
            Pattern pat = Pattern.compile("^[a-z]+@[a-z]+[.](com|es)$");
            Matcher validar = pat.matcher(correoPerso);
            if (validar.matches()) {
                correcto=true;
            }
            else
                JOptionPane.showMessageDialog(null, "Correo personal no valida");
        } while (correcto==false);
        return correoPerso;*/return "";
    }
    
    public static String CorreoEgi(){
        /*boolean correcto=false;
        String correoEgi="";
        do {
            correoEgi = JOptionPane.showInputDialog("Correo de clase del alumno(todas minusculas - xx@xx.com/es/org|| xx.xx@xx.xx.com/es/org)");
            Pattern pat = Pattern.compile("^(([a-z]+)|([a-z]+[.][a-z]))@(([a-z]+)|([a-z]+[.][a-z]+))[.](com|es|org)$");
            Matcher validar = pat.matcher(correoEgi);
            if (validar.matches()) {
                correcto=true;
            }
            else
                JOptionPane.showMessageDialog(null, "Correo de clase no valido");
        } while (correcto==false);
        return correoEgi;*/return "";
    }
    
    public static String PaginaWeb(){
        /*boolean correcto=false;
        String paginaWeb="";
        do {
            paginaWeb = JOptionPane.showInputDialog("pagina web(o www.xxx.com|es");
            Pattern pat = Pattern.compile("^www.[a-z]+[.](com|es)$");
            Matcher validar = pat.matcher(paginaWeb);
            if (validar.matches()) {
                correcto=true;
            }
            else
                JOptionPane.showMessageDialog(null, "Pagina web no valida");
        } while (correcto==false);
        return paginaWeb;*/return "";
    }
    
    public static String Curso(){
        /*boolean correcto=false;
        String curso="";
        do {
            curso = JOptionPane.showInputDialog("curso (1[1-4][1-4][A-M][ABD]");
            Pattern pat = Pattern.compile("^1[1-4][1-4][A-M][ABD]$");
            Matcher validar = pat.matcher(curso);
            if (validar.matches()) {
                correcto=true;
            }
            else
                JOptionPane.showMessageDialog(null, "Curso no valido");
        } while (correcto==false);
        return curso;*/return "";
    }
    
    public static String EstadoCivil(){
        /*boolean correcto=false;
        String estadoCivil="";
        do {
            estadoCivil = JOptionPane.showInputDialog("Estado civil ( C o S)");
            Pattern pat = Pattern.compile("^[CS]$");
            Matcher validar = pat.matcher(estadoCivil);
            if (validar.matches()) {
                correcto=true;
            }
            else
                JOptionPane.showMessageDialog(null, "Estado no valido");
        } while (correcto==false);
        return estadoCivil;*/return "";
    }
}
