package t3p2e1;

import javax.swing.JOptionPane;

public class T3p2e1 {

    // Variables globales
    private static byte horasTrabajadas;
    private static char estadoCivil;
    private static char nivelEstudios;
    
    public static void main(String[] args) {
        
        solicitarDatos();
       // float sueldo = calcularSueldo();   
        JOptionPane.showMessageDialog(null, "El sueldo de este trabajador asciende a " + calcularSueldo()); 
    }
         
    public static void solicitarDatos(){
        try
        {
            //Datos de entrada que se guardan en variables globales.
             horasTrabajadas = Byte.parseByte(JOptionPane.showInputDialog("Teclea el número de horas que ha trabajado"));

             // solicito y valido el estado civil.
             do
             {
                estadoCivil = JOptionPane.showInputDialog("Teclea el estado civil del trabajador").charAt(0);

                // paso a mayúsculas.
                estadoCivil = Character.toUpperCase(estadoCivil);
             }
             while (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'D' && estadoCivil != 'V');

            // solicito y valido el nivel de estudios
             do
             {
                 nivelEstudios = JOptionPane.showInputDialog("Teclea el nivel de estudios del trabajador").charAt(0);

                 nivelEstudios = Character.toUpperCase(nivelEstudios);
             }
             while (nivelEstudios != 'P'  && nivelEstudios != 'M' && nivelEstudios != 'S');
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El dato tecleado no es del tipo correcto");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getClass()+ e.getMessage());
        } 
    }
     
    public static float calcularSueldo(){
         //Constantes
         final float PRECIOHORANORMAL = 10;
         final float PRECIOHORAEXTRA = 15;
         
        //Operaciones para calcular la nómina
        float sueldo;
        if (horasTrabajadas > 40) // 40 podría ser otra constante
            sueldo = (horasTrabajadas - 40) * PRECIOHORAEXTRA + 40 * PRECIOHORANORMAL;
        else
            sueldo = horasTrabajadas * PRECIOHORANORMAL; 
                
        final float PLUS = 100.0f;
                
        if (nivelEstudios == 'S')
            sueldo = sueldo + PLUS;
        else
            if (estadoCivil == 'S')
                sueldo += PLUS;
            else
                if (estadoCivil == 'V' && nivelEstudios == 'P')
                    sueldo += PLUS;
        
        return sueldo;
                
    }
    
    
}
