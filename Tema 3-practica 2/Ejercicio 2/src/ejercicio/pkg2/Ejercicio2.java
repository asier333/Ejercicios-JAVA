/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;
import javax.swing.JOptionPane;
/**
 *
 * @author asier
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String visual = JOptionPane.showInputDialog("¿Has aprobado Visual.Net? Si/No");
        String java = JOptionPane.showInputDialog("¿Has aprobado Java? Si/No");
        String cobol = JOptionPane.showInputDialog("¿Has aprobado Cobol? Si/No");
        String sql = JOptionPane.showInputDialog("¿Has aprobado SQL? Si/No");
        {
            int visualN;
            int javaN;
            int cobolN;
            int sqlN;        
        if (visual.equalsIgnoreCase("si")) {
           visualN = 1;
        }
        else{
            visualN = 0;
        }
        if (java.equalsIgnoreCase("si")) {
            javaN = 1;
        }
        else{
            javaN = 0;
        }
        if (cobol.equalsIgnoreCase("si")) {
            cobolN = 5;
        }
        else{
            cobolN = 0;
        }
        if (sql.equalsIgnoreCase("si")) {
            sqlN = 5;
        }
        else{
            sqlN = 0;
        }
        
        calificacion(visualN,cobolN,javaN,sqlN);
        
    }
    
}
    
    public static void calificacion(int visualN,int cobolN, int javaN, int sqlN){
        int total = visualN + cobolN + javaN + sqlN;
           switch (total){
               case 6:
                   JOptionPane.showMessageDialog(null, "Suficiente");
               break;
               case 10:
                   JOptionPane.showMessageDialog(null, "Bien");
               break;
               case 11:
                   JOptionPane.showMessageDialog(null, "Notable");
               break;
               case 12:
                   JOptionPane.showMessageDialog(null, "Sobresaliente");
               break;
               default:
                   JOptionPane.showMessageDialog(null, "Insuficiente");
               break;
           }
    }
}


