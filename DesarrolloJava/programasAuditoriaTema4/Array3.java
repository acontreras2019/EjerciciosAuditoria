public class Array3 {
    public int lastZero (int[] x) {
    //Devuelve el índice del último 0 en x
    //Si no existe 0 devuelve ‐1
        for (int i=0; i<=x.length-1; i++)
        {
            if (x[i] == 0)
            {
                return i;
            }
        }
            return -1;
    }
    public static void main(String[] args) {
    int x[]={1,1,0};
    Array3 a=new Array3();
    int resultado = a.lastZero (x);
    System.out.print ("El índice del último 0 es: ");  
    System.out.print (resultado);   
    }
}