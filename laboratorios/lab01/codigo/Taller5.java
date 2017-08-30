import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Taller5  {
 public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

public static long tomarElTiempoParamax(int n){
    int[] arreglo = crearUnArregloAleatorio(n);
    long startTime = System.currentTimeMillis();
    ArrayMax(arreglo, arreglo.length -1);
    long estimatedTime = System.currentTimeMillis() - startTime;
    return estimatedTime;
}
public static long tomarElTiempoParafibo(int n){
    
    long startTime = System.nanoTime();
    fibonacci(n);
    long estimatedTime = System.currentTimeMillis() - startTime;
    return estimatedTime;
}
public static long tomarElTiempoParagroup(int n){
    int[] arreglo = crearUnArregloAleatorio(n);
    long startTime = System.nanoTime();
    groupSum(arreglo, arreglo.length-1);
    long estimatedTime = System.nanoTime() - startTime;
    return estimatedTime;
}
public static int[] crearUnArregloAleatorio(int n){
  int max = 5000;
  int[] array = new int[n];
  Random generator = new Random();
  for (int i =0; i<n; i++)
     array[i] = generator.nextInt(max);
  return array;
 }

public static int ArrayMax(int A[], int n){
     try        
   {
      TimeUnit.NANOSECONDS.sleep(1);
   } 
   catch(InterruptedException ex) 
   {
    Thread.currentThread().interrupt();
  }    
 int temp;
if(n==0){
int max=A[0];
return max;
}else{
    int max= A[n];
temp = ArrayMax(A, n-1);
if (temp>max ){
max=temp;
}
return max;
}
}

public static int ArraySum(int[] A, int n)
  {          
      int sum;
      if (n == 0)
        sum = A[0];
      else 
        sum = A[n] + ArraySum(A,n-1);
      return sum;
  }
  
  // Computes the maximum value of an array recursively
  public static int ArrayMax(int[] A, int n)
  {
      int max;
      if (n == 0)
        max = A[0];
      else
        max = Math.max(A[n],ArrayMax(A, n-1));
      return max;
  }

public static void main(String[] args){
  for(int i=1; i <= 20; i = i + 1){
     System.out.println("Max "+i+" "+tomarElTiempoParamax(i));

    }
    for(int i=1; i <= 20; i = i + 1){
     System.out.println("Fibonacci "+i+" "+ tomarElTiempoParafibo(i));

    }
    for(int i=1; i <= 20; i = i + 1){
        System.out.println("");
     System.out.println("groupSum "+i+" "+tomarElTiempoParagroup(i));
       System.out.println("");
    }
 
}}
