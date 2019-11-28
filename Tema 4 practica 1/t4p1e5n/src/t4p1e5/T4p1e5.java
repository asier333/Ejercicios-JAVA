package t4p1e5;

import javax.swing.JOptionPane;

public class T4p1e5 {


    public static void main(String[] args) {
        // Guardo los datos por mes.
        float[] arrayLitrosCaidos = new float[12];
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
    
    public static void inicializaArrayLitrosCaidos(float[] arrayLitrosCaidos)
    {
        for (int x = 0; x < arrayLitrosCaidos.length; x++)
            arrayLitrosCaidos[x] = 0;
        
        // java.util.Arrays.fill
   
    }

    private static void solicitarDatosEntrada(float[] arrayLitrosCaidos)
    {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes<1..12>: "));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia (nro): "));
      
        // Entrada y acumulación de los litros caidos
        float litros = Float.parseFloat(JOptionPane.showInputDialog("Teclea los litros caídos: "));
        arrayLitrosCaidos[mes-1] += litros;
        // Falta la validación del mes.
    }


    private static void visualizarLitrosCaidos(float[] arrayLitrosCaidos)
    {
        String litrosCaidos = "";
        for (int x = 0; x < arrayLitrosCaidos.length; x++)
        {
          litrosCaidos = litrosCaidos + (x+1) + " - " + arrayLitrosCaidos[x]+ "\n";
  
        }   
       JOptionPane.showMessageDialog(null, "Los litros recogidos durante los doce meses del año son: \n" + litrosCaidos );        
    }
}
