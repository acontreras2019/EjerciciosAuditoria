public class Array4 {

    public int countPositive (int[] x) {
        //Devuelve el número de elementos positivos en x
        int count=0;
        for (int i=0; i<x.length; i++)
        {
            if (x[i] >= 0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int x[]={-44,2,0,2};
        Array4 a=new Array4();
        int resultado = a.countPositive (x);
        System.out.print ("El número de elementos positivos es: ");  
        System.out.print (resultado);   
    }
   
}
