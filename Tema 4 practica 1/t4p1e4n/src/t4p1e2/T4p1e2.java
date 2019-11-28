package t4p1e2;

import java.util.Arrays;


public class T4p1e2 {

    
    public static void main(String[] args) {
        String[] meses = {"enero", "febrero","marzo", "abril","mayo", "junio","julio", "agosto","septiembre", "octubre","noviembre", "diciembre"};
       /* String[] meses= new String[12];
        meses[0] = "enero";
        meses[1] = "febrero";
        
        meses[11] = "diciembre";*/
        
        String mes= javax.swing.JOptionPane.showInputDialog("Teclea el mes");
        
        int x;
        // Versión uno: Buscar con un for
        for(x = 0; x < meses.length &&  meses[x].compareToIgnoreCase(mes)!= 0; x++){}
        if (x == meses.length)
            javax.swing.JOptionPane.showMessageDialog(null,"Mes no valido (opción uno)");
        else
            javax.swing.JOptionPane.showMessageDialog(null,"Mes correcto (opción uno)");
        
        // Versión dos del for
        boolean encontrado = false;
        for(x = 0; x < meses.length && encontrado == false; x++)
        {
            if (meses[x].compareToIgnoreCase(mes)== 0)
                encontrado = true;
            // CUIDADO CON ELSE DENTRO DE LA REPETITIVA
        }
        if (!encontrado)
            javax.swing.JOptionPane.showMessageDialog(null,"Mes no valido (opción dos)");
        else
            javax.swing.JOptionPane.showMessageDialog(null,"Mes correcto (opción dos)");
        
        
        // Versión tres: indexOf?? contains ...Sólo con String
        // Convierto el array en un string
        String todos = Arrays.toString(meses);
        if (todos.indexOf(mes)== -1)
            javax.swing.JOptionPane.showMessageDialog(null,"Mes no valido (opción tres)");
        else
            javax.swing.JOptionPane.showMessageDialog(null,"Mes correcto (opción tres)");
      
        // Versión cuatro: todos.contains(mes)
         if (todos.contains(mes)== false)
            javax.swing.JOptionPane.showMessageDialog(null,"Mes no valido (opción cuatro)");
        else
            javax.swing.JOptionPane.showMessageDialog(null,"Mes correcto (opción cuatro)");
        
    }
}
