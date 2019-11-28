package t3p2e2;

import javax.swing.JOptionPane;
import Excepciones.*;

public class T3p2e2 {

    public static void main(String[] args) {
        
        String nombreAlumno;
        String visual,cobol,java,sql;
        int respuesta=0;
        do
        {
        
            try
            {
                 nombreAlumno = JOptionPane.showInputDialog("Teclear el nombre del alumno: ");
                 visual = solicitarNota("visual");
                 cobol = solicitarNota("cobol");
                 java = solicitarNota("java");
                 sql = solicitarNota("sql");
                 
                 String nota = proceso(visual,cobol,java,sql);
                 
                 JOptionPane.showMessageDialog(null,"La calificación de "+ nombreAlumno + " es de " + nota );
                 
                 respuesta = JOptionPane.showConfirmDialog(null, "Si quieres continuar haz click en el botón aceptar");
                 
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Problemas: " + e.getClass());
            }
             
        }
        while(respuesta == 0);
        
    }
    
    public static String proceso(String visual,String cobol, String java, String sql) throws Exception
    {
       
             if (cobol.compareToIgnoreCase("apto")==0 && sql.compareToIgnoreCase("apto")==0)
             {
                 // Sobresaliente, notable o bien
                 if (visual.compareToIgnoreCase("apto")==0 && java.compareToIgnoreCase("apto")==0)
                     return "Sobresaliente";
                 // else no me hace falta por el return
                 if (visual.compareToIgnoreCase("apto")==0 || java.compareToIgnoreCase("apto")==0)
                        return "Notable";
                 return "Bien";
             }
             else
             {
                 // suficiente o insuficiente
                 if(sql.compareToIgnoreCase("apto")==0 || cobol.compareToIgnoreCase("apto")==0)
                 {
                     // ¿ Alguna de las otras?
                     if(java.compareToIgnoreCase("apto")==0 || visual.compareToIgnoreCase("apto")==0)
                         return "Suficiente";
                     return "Insuficiente";
                 }
                 else
                     // ninguna de las dos
                     return "Insuficiente";                       
             }
        }             
    
    public static String solicitarNota(String nombreAsignatura)throws Exception{
        // relanzo todas las excepciones excepto NotaNoValidaException
        boolean correcto;
        String nota="";
        do
        {
            try
            {
                nota = JOptionPane.showInputDialog("Introduzca si la calificacion de " + nombreAsignatura + " es apto o no apto");
                if(nota.compareToIgnoreCase("apto")!= 0 && nota.compareToIgnoreCase("no apto")!= 0)
                    throw new NotaNoValidaException();
                correcto = true;
            }
            catch(NotaNoValidaException e)
            {
                JOptionPane.showMessageDialog(null,"La nota tiene que ser apto o no apto");
                correcto = false;
            }
        }
        while(!correcto);
        return nota;
    }
}
