

package ejercicio22;

import java.time.LocalDate;
import Excepciones.*;
import Modelo.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



public class Ejercicio22 {
public static ArrayList<Artista> listaArtista = new ArrayList();
public static ArrayList<Pelicula> listaPelicula = new ArrayList();
   

    public static void main(String[] args){
        // TODO code application logic here
        
        Libro();
        
        Disco disco = new Disco();
        Pelicula pelicula = new Pelicula();
        
        
        
        /*try {
        RellenaDatos();
        }
        catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "problemas " + e.getMessage());
                }*/
    }
    
    
    
    public static void Libro(){
        Libro libro = new Libro();
       
        libro.setEditorial("editorial libro 1");
        libro.setNumeroPaginas(65);
        libro.setTitulo("titulo libro 1");
        libro.setAnoEdicion(1990);
        
        
        Artista artista = new Artista();
        
        artista.setNombre("artista libro 1");
            String dato = "12/02/1980";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse(dato, formatter);
        artista.setFechaNacimiento(fecha);
        
        ArrayList<Artista> listaArtistaProvisional = new ArrayList();
        listaArtistaProvisional.add(artista);
     
        libro.setArtistaLista(listaArtistaProvisional);
        
        listaArtista.add(artista);
        
        ArrayList<Libro> listaLibro = new ArrayList();
        listaLibro.add(libro);
    }
    
/*
    public static void RellenaDatos() throws Exception{
        do {
            String dato = ObtenerDatos("tipo de obra","^(Libro|Disco|Pelicula)$");
            switch(dato){
                case "Libro":
                    
                break;
                case "Disco":
                    
                break;
                case "Pelicula":
                    
                break;
            }
            
        String titulo = ObtenerDatos("titulo de la obra","^[A-Z][a-z]+( [A-Z][a-z]+)*$");
        String anoEdicion = ObtenerDatos("año de edicion de la obra","^((19[2-9]\\d)|(2[01]\\d))$");
        
        String nombre = ObtenerDatos("nombre del artista","^[A-Z][a-z]+( [A-Z][a-z]+)*$");
        LocalDate fechaNaci = ObtenerFecha("fecha de nacimiento del artista","^\\d{2}/\\d{2}/\\d{4}$");
        
        
        } while (JOptionPane.showConfirmDialog(null, "Quieres seguir?")==0);
    }
    
    public static String ObtenerDatos(String campo, String expReg) throws Exception{
        boolean correcto = false;
        String dato = "";
        do {    
            try{
                dato = JOptionPane.showInputDialog("Introduce el " + campo);
                Pattern pat = Pattern.compile(expReg);
                Matcher validar = pat.matcher(dato);
                if (validar.matches()) {
                    correcto = true;
                }
                else
                    throw new DatoNoValido(campo);
                }
            catch (DatoNoValido e)
                {
                    JOptionPane.showMessageDialog(null, e.getMensaje());
                }
         } while (correcto==false);
        return dato;
    }
    
    public static LocalDate ObtenerFecha(String campo, String expReg) throws Exception{
        
        boolean correcto = false;
        LocalDate fecha = null;
        do {    
            try{
                String dato = JOptionPane.showInputDialog("Introduce el " + campo);
                Pattern pat = Pattern.compile(expReg);
                Matcher validar = pat.matcher(dato);
                if (validar.matches()) {
                    
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    fecha = LocalDate.parse(dato, formatter);
                    
                    correcto = true;
                }
                else
                    throw new DatoNoValido(campo);
                }
            catch (DatoNoValido e)
                {
                    JOptionPane.showMessageDialog(null, e.getMensaje());
                }
            catch(DateTimeParseException e)
            {
                JOptionPane.showMessageDialog(null, "La fecha no es válida");
            }
         } while (correcto==false);
        return fecha;
        
    }*/
}
