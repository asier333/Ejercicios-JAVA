package t4p1e5;

import javax.swing.JOptionPane;

public class T4p1e5 {


    public static void main(String[] args) {
        float[][] arrayLitrosCaidos = new float[12][31];
        
        /*
        12 meses = 12 filas
        31 días por mes = 31 columnas
        */
        
        inicializaArrayLitrosCaidos(arrayLitrosCaidos);
        
        char continuar;
        do
        {
            solicitarDatosEntrada(arrayLitrosCaidos);
            continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo datos? <s/n>").toLowerCase().charAt(0);
        }
        while (continuar == 's');
        
        visualizarLitrosCaidos(arrayLitrosCaidos);
    }
    
    public static void inicializaArrayLitrosCaidos(float[][] arrayLitrosCaidos)
    {
        for (int x = 0; x < arrayLitrosCaidos.length; x++)
             for (int y = 0; y < arrayLitrosCaidos[x].length; y++)
                arrayLitrosCaidos[x][y] = 0;
    }

    private static void solicitarDatosEntrada(float[][] arrayLitrosCaidos)
    {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes<1..12>: "));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia (nro): "));
      
        // Validar día y mes.
        if (arrayLitrosCaidos[mes-1][dia-1] != 0)
        {
            JOptionPane.showMessageDialog(null, "Para este día y mes ya has indicado los litros caidos");
        }
        else
        {
            // Entrada y acumulacion de los litros caidos
            float litros = Float.parseFloat(JOptionPane.showInputDialog("Teclea los litros caídos: "));
            
            arrayLitrosCaidos[mes-1][dia-1] = litros;
        }
    }


    private static void visualizarLitrosCaidos(float[][] arrayLitrosCaidos)
    {
        String litrosCaidos = "";
        for (int x = 0; x < arrayLitrosCaidos.length; x++)
        {
           float litrosMes = 0;
           for (int y = 0; y < arrayLitrosCaidos[x].length; y++)  
                litrosMes += arrayLitrosCaidos[x][y];
           litrosCaidos = litrosCaidos + (x+1) + " - " + litrosMes+ "\n";
  
        }   
       JOptionPane.showMessageDialog(null, "Los litros recogidos durante el año son: \n" + litrosCaidos );        
    }
}
