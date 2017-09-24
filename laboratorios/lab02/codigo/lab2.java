
/**
 * Laboratorio 2 de Estructuras de Datos 1
 * 
 * @author Manuela Valencia Toro 
 * @version 1
 */

import java.util.*;
import java.util.concurrent.TimeUnit;
public class Laboratory1
{
 /**
  * Este algoritmo caicula la suma de los elementos de un arreglo, secibe un arreglo y retorna la suma de sus elementos.
  */
  public static int ArraySum(int[] A)
  {                    try        
   {
      TimeUnit.SECONDS.sleep(1);
   } 
   catch(InterruptedException ex) 
   {
    Thread.currentThread().interrupt();
  }    
      int sum = 0;
      for (int i = 0; i < A.length; i++)
         sum = sum + A[i];
      return sum;
  }
   /**
     * Este metodo calcula el tiempo para el algoritmo ArraySun, recibe un entero y retorna el tiempo en milisegundos en que dicho algoritmo tardo en ejecutar.
     */public static long tomarElTiempoParasum(int n){
    int[] arreglo = crearUnArregloAleatorio(n);
    long startTime = System.currentTimeMillis();
    ArraySum(arreglo);
    long estimatedTime = System.currentTimeMillis() - startTime;
    return estimatedTime;
 }
 /**
 * Este algoritmo crea un arreglo aleatorio, recibe un entero n y retorna un arreglo de tamaño n.
 */ public static int[] crearUnArregloAleatorio(int n){
  int max = 5000;
  int[] array = new int[n];
  Random generator = new Random();
  for (int i =0; i<n; i++)
     array[i] = generator.nextInt(max);
  return array;
 }
  /**
   * Este algoritmo retorna el elemento mayor de un arreglo de enteros que recibe como parametro.
   */
  public static int ArrayMax(int[] A)
  {        try        
   {
      TimeUnit.SECONDS.sleep(1);
   } 
   catch(InterruptedException ex) 
   {
    Thread.currentThread().interrupt();
  }    
      int max = A[0];
      for (int i = 0; i < A.length; i++)
         if (A[i] > max)
           max = A[i];
      return max;
    }
    /**
     * Este método toma el tiempo que tarda en ejecutarse ArrayMax, recibe un entero y retorna dicho timepo en milisegundos.
     */
  public static long tomarElTiempoParamax(int n){
    int[] arreglo = crearUnArregloAleatorio(n);
    long startTime = System.currentTimeMillis();
    ArrayMax(arreglo);
    long estimatedTime = System.currentTimeMillis() - startTime;
    return estimatedTime;
}
  /**
   * Este es el arreglo de ordenamiento InsertionSort, recibe un arreglo como paramentro e imprime un string con el arreglo ordenado.
   */
  public static void InsertionSort(int[] A)
  {
       int temp,j;
       for (int i = 0; i < A.length; i++)
       {
         j = i;
         while (j > 0 && A[j-1] > A[j])
           {
               temp = A[j];
               A[j] = A[j-1];
               A[j-1] = temp;
               j = j-1;
            }           
       }
       System.out.println(Arrays.toString(A));
  }
  /**
   * este metodo toma el tiempo de ejecucion del metodo insertionsort, recibe un entero y retorna dicho tiempo.
   */
public static long tomarElTiempoParainsertion(int n){
    int[] arreglo = crearUnArregloAleatorio(n);
    long startTime = System.currentTimeMillis();
    InsertionSort(arreglo);
    long estimatedTime = System.currentTimeMillis() - startTime;
    return estimatedTime;
}
      /**
       * Este metodo hace parte del arreglo de ordenamiento MergeSort, recibe un arreglo e invoca el metodo MergeSort con otros parametros.
       */
	public static void mergeSort(int [ ] a)
	{
		int[] tmp = new int[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}
	
/**
 * este metodo Toma el tiempo para Mergesort, recibe un entero, ejecuta el metodo, y  cuando este estermina retorna el tiempo que tardó en milisegundos.
 */public static long tomarElTiempoParamerge(int n){
    int[] arreglo = crearUnArregloAleatorio(n);
    long startTime = System.currentTimeMillis();
    mergeSort(arreglo);
    long estimatedTime = System.currentTimeMillis() - startTime;
    return estimatedTime;
}

	/**
	 * Este metodo hace parte del algoritmo de ordenamiento mergeSort, recibe dos arreglos y dos enteros, e invoca al metodo merge y al mergeSort.
	 */private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}
	


    /**
     * este metodo es el encargado de ordenar el arreglo en el algoritmo merge sort, recibe dos arreglos y tres enteros y es de tipo viod.
     */private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
  
  public static void main(String[] args)
  {
      for(int i=1000000; i <= 10000000; i = i + 1000000){
     System.out.println("Max "+i+" "+tomarElTiempoParamax(i));

    }
    for(int i=10000; i <= 100000; i = i + 10000){
     System.out.println("insertionsort "+i+" "+ tomarElTiempoParainsertion(i));

    }
    for(int i=1000000; i <= 10000000; i = i + 1000000){
        System.out.println("");
     System.out.println("ArraySum "+i+" "+tomarElTiempoParasum(i));
       System.out.println("");
    }
    for(int i=1000000; i <= 10000000; i = i + 1000000){
        System.out.println("");
     System.out.println("MergeSort "+i+" "+tomarElTiempoParamerge(i));
       System.out.println("");
    }
    
      
  
}}