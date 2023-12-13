public class Array5 {
  public int oddOrPositive (int[] x) {
  //Devuelve el número de elementos en x que son impares o positivos  
    int count=0;
    for (int i=0; i<x.length; i++)
    {  
        if (x[i]%2 != 0 || x[i]>0)
        {
          count++;
        }
     }
    return count;
  }
  public static void main(String[] args) {
    int x[]={-1,-3,-5,-7};
    Array5 a=new Array5();
    int resultado = a.oddOrPositive (x);
    System.out.print ("El número de elementos impares o positivos es: ");  
    System.out.print (resultado); 
  }        
}
