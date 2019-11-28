/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author asier
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Nombre del alumno?");
        String todoJunto = "";
        float notaMedia = 0;
        int contador = 0;
        float nota1=0;
        float nota2=0;
        float nota3=0;
        float nota4=0;
        float nota5=0;
        float nota6=0;
        do 
        {
            boolean correcto = false;
            while (!correcto)
            {
                try
                {
                    nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota de la asignatura 1"));
                        if (nota1<0 || nota1>10)
                        {
                            throw new Exception ();
                        }
                    correcto = true;
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "La nota debe estar comprendida entre 0 y 10");
                }
            }
            correcto = false;
            while (!correcto)
            {
                try
                {
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota de la asignatura 2"));
                        if (nota2<0 || nota2>10)
                        {
                            throw new Exception ();
                        }
                    correcto = true;
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "La nota debe estar comprendida entre 0 y 10");
                }
            }
            correcto = false;
            while (!correcto)
            {
                try
                {
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Nota de la asignatura 3"));
        if (nota3<0 || nota3>10)
                        {
                            throw new Exception ();
                        }
                    correcto = true;
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "La nota debe estar comprendida entre 0 y 10");
                }
            }
            correcto = false;
            while (!correcto)
            {
                try
                {
        nota4 = Float.parseFloat(JOptionPane.showInputDialog("Nota de la asignatura 4"));
        if (nota4<0 || nota4>10)
                        {
                            throw new Exception ();
                        }
                    correcto = true;
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "La nota debe estar comprendida entre 0 y 10");
                }
            }
            correcto = false;
            while (!correcto)
            {
                try
                {
        nota5 = Float.parseFloat(JOptionPane.showInputDialog("Nota de la asignatura 5"));
        if (nota5<0 || nota5>10)
                        {
                            throw new Exception ();
                        }
                    correcto = true;
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "La nota debe estar comprendida entre 0 y 10");
                }
            }
            correcto = false;
            while (!correcto)
            {
                try
                {
        nota6 = Float.parseFloat(JOptionPane.showInputDialog("Nota de la asignatura 6"));
        if (nota6<0 || nota6>10)
                        {
                            throw new Exception ();
                        }
                    correcto = true;
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "La nota debe estar comprendida entre 0 y 10");
                }
            }
        contador++;
        notaMedia = notaMedia + (nota1+nota2+nota3+nota4+nota5+nota6)/6;
        todoJunto = todoJunto + nombre + " tiene una nota media de " + (double)Math.round(((nota1+nota2+nota3+nota4+nota5+nota6)/6)*100)/100 + "\n";
        nombre = JOptionPane.showInputDialog("Nombre del alumno?\nPara salir teclea FIN");
            
            
        } while (!nombre.equalsIgnoreCase("fin"));
        todoJunto = todoJunto + (double)Math.round((notaMedia/contador)*100)/100 + " es la nota media del conjunto de alumnos";
        JOptionPane.showMessageDialog(null, todoJunto);
    }
    
}
