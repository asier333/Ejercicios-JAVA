package t3p2e4;

import javax.swing.JOptionPane;

public class T3p3e4 {
    
    final private static int NUMEROASIGNATURAS = 6;
    private static int numeroAlumnos;
    private static float totalNotas;

    public static void main(String[] args) {
        String  nombre = JOptionPane.showInputDialog("Teclear el nombre: ");
        while(nombre.compareToIgnoreCase("fin")!= 0 )
        {     
          
            float totalNotasAlumno = solicitarNotas();
            float medioAlumno=totalNotasAlumno / NUMEROASIGNATURAS;
            JOptionPane.showMessageDialog(null,nombre + " ha obtenido  " + medioAlumno + " de nota media");   
            
            calculosMediaAlumnos(medioAlumno);
            
            nombre = JOptionPane.showInputDialog("Teclear el nombre: "); 

         }      
         JOptionPane.showMessageDialog(null, "La nota media de todos los alumnos es: "+ (totalNotas / numeroAlumnos));

    }
    
    public static float solicitarNotas(){
            float totalNotasAlumno = 0;
            for (int x = 0; x < NUMEROASIGNATURAS; x++)
            {    
                float nota=0;
                boolean correcto;
                do
                {   
                    try
                    {
                        nota = Float.parseFloat(JOptionPane.showInputDialog("Teclear la nota de asignatura " + (x + 1) + ": "));
                        if (nota < 0 || nota > 10)
                            throw new NotaNoValida();
                        correcto = true;
                    }
                    catch(NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, " La nota tiene que ser un número");
                        correcto = false;
                    }
                    catch(NotaNoValida e)
                    {
                        JOptionPane.showMessageDialog(null, " La nota tiene que ser un número entre 0 y 10");
                        correcto = false;
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null, " Problemas");
                        correcto = false;
                    }
                }
                while(!correcto);
               totalNotasAlumno += nota;
            }
        return totalNotasAlumno; 
    }

    public static void calculosMediaAlumnos(float mediaAlumno){
        totalNotas += mediaAlumno;
        numeroAlumnos++;
    }
       
}
