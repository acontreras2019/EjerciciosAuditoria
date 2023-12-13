public class ProgramaT5 {

    public double VentaMayor (int[] x, double c) {
        //Devuelve la Venta Mayor calculando el precio de Venta con base a las cantidades vendidas.  
        // Rangos para calcular el Precio de Venta dependiento de la cantidades de producto facturado:
        // de 1 a 400  unidades PrecioVenta = costo +55%
        // de 401 a 1000  unidades PrecioVenta = costo +45%
        // de mayor o igual a 1001 unidades PrecioVenta = costo +30%     
          double precioVenta = 0;
          double venta = 0;
          double ventaMayor = 0;
          for (int i=0; i<x.length; i++) // 1
          {  
              double factor = 0;
              if (x[i]>=1 && x[i]<=400) // 2 - > 3
              {
                factor = 1.55; // > 4
              }
              else if (x[i]>400 && x[i]<=1000) //>5 ->6
              {
                factor = 1.45; // >7
              }
               else if (x[i]>1000) // 8
              {
                factor = 1.30; // 9
              }
              precioVenta = Math.abs(c)*factor; // 10
              venta = Math.abs(precioVenta*x[i]); // 11

              System.out.println("Para la Cantidad "+ x[i]+" el Precio de venta es: " + precioVenta + " euros, haciendo un total en Venta de:"+venta); // 12
              if (venta > ventaMayor) // 13 >
              {
                ventaMayor = venta; // 14
              }
           }
          return ventaMayor; // 15
        }
    public static void main(String[] args) {
        double costoPorUnidad = 10; // Costo por unidad (en euros)
        int x[]={-100, -999, -400};// posibles cantidades vendidas para proyectar la mayor venta
      
        ProgramaT5 a=new ProgramaT5();
        double PrecioVenta = a.VentaMayor(x, costoPorUnidad);
        System.out.print ("Venta Mayor es: ");  
        System.out.print (PrecioVenta);     
    } 
}
