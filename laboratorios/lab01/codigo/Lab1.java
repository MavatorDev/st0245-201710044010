import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Realizado por: Manuela Valencia Toro
 */

public class Lab1  {
  
  /**
   * Este metodo calcula el numero de la sucesion de fibonacci en la posicion entera que recibe, a su vez, retorna un entero con el resultado. 
   */
   
 public static int Fibonnacci(int n) {
        int result;
     if (n == 0 || n == 1)
       result = n;
     else
       result = Fibonnacci(n-1) + Fibonnacci(n-2);
     return result;
     }
     
    /**
     * Este metodo calcula el tiempo para el algoritmo ArrayMay, recibe un entero y retorna el tiempo en milisegundos en que dicho algoritmo tardo en ejecutar.
     */public static long tomarElTiempoParamax(int n){
    int[] arreglo = crearUnArregloAleatorio(n);
    long startTime = System.currentTimeMillis();
    ArrayMax(arreglo, arreglo.length -1);
    long estimatedTime = System.currentTimeMillis() - startTime;
    return estimatedTime;
}
/*
 * */
/**
 * Este Método calcula el tiempo para el algoritmo Fibonacci, recibe un valor entero, ejecta dicho algoritmo y retorna el tiempo que se demoro en terminar su ejecución en milisegundos.
 
 */public static long tomarElTiempoParafibo(int n){
    
    long startTime = System.currentTimeMillis();
    Fibonnacci(n);
    long estimatedTime = System.currentTimeMillis() - startTime;
    return estimatedTime;
}

/**
 * * Este método calcula el tiempo en que Arraysum demora en terminar su ejecución, recibe un entero y retorna un entero con el tiempo en milisegundos.

 */public static long tomarElTiempoParasum(int n){
    int[] arreglo = crearUnArregloAleatorio(n);
    long startTime = System.currentTimeMillis();
    ArraySum(arreglo, arreglo.length-1);
    long estimatedTime = System.currentTimeMillis() - startTime;
    return estimatedTime;
}
/*
 */
/**
 *  Este metodo crea un arreglo aleatorio, recibe un entero el cual será la lungitud y retorna el arreglo creado.
 
 */public static int[] crearUnArregloAleatorio(int n){
  int max = 5000;
  int[] array = new int[n];
  Random generator = new Random();
  for (int i =0; i<n; i++)
     array[i] = generator.nextInt(max);
  return array;
 }


/*
 * */
/**
 * Este método recibe un arreglo y un entero, y se encarga de retornar un entero con el numero mas grande del arreglo.
 * para poder tomar el tiempo de esta metodo, ya que tiene una complejidad baja, se le agregó un tiempo de reposo.
 
 */public static int ArrayMax(int[] A, int n)
  { try        
   {
      TimeUnit.MILLISECONDS.sleep(1);
   } 
   catch(InterruptedException ex) 
   {
    Thread.currentThread().interrupt();
  }    
      int max;
      if (n == 0)
        max = A[0];
      else
        max = Math.max(A[n],ArrayMax(A, n-1));
      return max;
  }

/*
 **/
/**
 * Este método recibe un arreglo y un entero, y retorna un entero con la suma de todos los elementos de dicho arreglo.
 * Ya que la complejidad de este arreglo es baja, se le añadió un tiempo de reposo de 1 milisegundo.
  
 */public static int ArraySum(int[] A, int n)
  {           try        
   {
      TimeUnit.MILLISECONDS.sleep(1);
   } 
   catch(InterruptedException ex) 
   {
    Thread.currentThread().interrupt();
  }    
      int sum;
      if (n == 0)
        sum = A[0];
      else 
        sum = A[n] + ArraySum(A,n-1);
      return sum;
  }
  
  public static void main(String[] args){
  for(int i=100; i <= 1000; i = i + 100){
     System.out.println("Max "+i+" "+tomarElTiempoParamax(i));

    }
    for(int i=10; i <= 50; i = i + 5){
     System.out.println("Fibonacci "+i+" "+ tomarElTiempoParafibo(i));

    }
    for(int i=100; i <= 1000; i = i + 100){
        System.out.println("");
     System.out.println("groupSum "+i+" "+tomarElTiempoParasum(i));
       System.out.println("");
    }
 
}}
