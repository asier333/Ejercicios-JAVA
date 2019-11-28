package t3p2e1;

import javax.swing.JOptionPane;
import Excepciones.*;

public class T3p2e1 {

    // Variables globales
    private static byte horasTrabajadas;
    private static char estadoCivil;
    private static char nivelEstudios;
    
    public static void main(String[] args) {
        try
        {
        
            solicitarDatos();
            JOptionPane.showMessageDialog(null, "El sueldo de este trabajador asciende a " + calcularSueldo()); 
        }
        catch(Exception e )
        {
            JOptionPane.showMessageDialog(null, "Problemas en el main");
        }
    }
         
    public static void solicitarDatos(){
        boolean correcto = false;
        // Entrada y validación de las horas
        while(!correcto)
        {
            try
            {
                horasTrabajadas = Byte.parseByte(JOptionPane.showInputDialog("Teclea el número de horas que ha trabajado"));
                if (horasTrabajadas < 0)
                    throw new HorasException();
                correcto = true;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El dato tecleado no es del tipo correcto");
            }
            catch(HorasException e){
                JOptionPane.showMessageDialog(null, "Las horas no pueden ser negativas.");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getClass()+ e.getMessage());
            } 
        }
        
        // Entrada y validación del nivel de estudios
        correcto = false;
        while(!correcto)
        {
            try
            {
                String ne = JOptionPane.showInputDialog("Teclea el nivel de estudios del trabajador").toUpperCase();
                if (ne.length()!= 1)
                    throw new MuchosCaracteresException();
                nivelEstudios = ne.charAt(0);
                if (nivelEstudios != 'P'  && nivelEstudios != 'M' && nivelEstudios != 'S')
                    throw new NivelEstudiosException();
                correcto = true;
            }
            catch(MuchosCaracteresException e){
                JOptionPane.showMessageDialog(null, "El nivel de estudios no muy largo o está vacío");
            }
            catch(NivelEstudiosException e){
                JOptionPane.showMessageDialog(null, "El nivel de estudios no es correcto");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getClass()+ e.getMessage());
            } 
        }
        
        // Entrada y validación del estado civil
        correcto = false;
        while(!correcto)
        {
            try
            {
                estadoCivil = JOptionPane.showInputDialog("Teclea el estado civil del trabajador").charAt(0);
                estadoCivil = Character.toUpperCase(estadoCivil);

                if (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'D' && estadoCivil != 'V')
                     throw new EstadoCivilException();
                correcto = true;
            }
            catch(EstadoCivilException e){
                JOptionPane.showMessageDialog(null, "El estado civil no es correcto");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getClass()+ e.getMessage());
            } 
        }
    }
     
    public static float calcularSueldo(){
        float sueldo = 0;
        try
        {
            //Constantes
            final float PRECIOHORANORMAL = 10;
            final float PRECIOHORAEXTRA = 15;

           //Operaciones para calcular la nómina
           if (horasTrabajadas > 40) // 40 podría ser otra constante
               sueldo = (horasTrabajadas - 40) * PRECIOHORAEXTRA + 40 * PRECIOHORANORMAL;
           else
               sueldo = horasTrabajadas * PRECIOHORANORMAL; 

           final float plus = 100f;

           if (nivelEstudios == 'S')
                sueldo = sueldo + plus;
            else
                if (estadoCivil == 'S')
                    sueldo += plus;
                else
                    if (estadoCivil == 'V' && nivelEstudios == 'P')
                        sueldo += plus;
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e.getClass()+ e.getMessage());
        }
        finally
        {
            return sueldo;
        }
                
    }
    
    
}
