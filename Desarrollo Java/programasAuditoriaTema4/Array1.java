public class Array1 { 
public static void main(String[] args) {
    //Devuelve el número de ocurrencias de 0 en x 
    int x[]={1,0,0}; 
    int count=0; 
    for (int i=1 ;  i<x.length; i++)
    {
        if (x[i] == 0)
        {
            count ++;
        }
    }
    System.out.print ("Número de ceros: ");
    System.out.println(count) ;
    }
}
