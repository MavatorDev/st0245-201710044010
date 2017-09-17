import java.util.*;
/**
 * Labratorio 2, Estructura de datos 1.
 * 
 * @author Manuela Valencia Toro 
 * @version 1
 */
public class EjercicioenLinea
{
   //Array-2
   public int[] fizzArray(int n) {
  int [] array= new int[n];  
  for(int i=0; i<n;i++){
    array[i]=i;                 
  }
  return array;
}
    
public int bigDiff(int[] nums)
{
  Arrays.sort(nums); 
  if(nums.length>1){  
  return (Math.abs(nums[0]-nums[nums.length-1]));  
}
  else{
    return 0;
  }
}
 
public int countEvens(int[] nums) {
  int contador=0;   
  for(int i=0; i<nums.length;i++){
    if(nums[i]%2==0){ 
      contador++;    
    }
  }return contador;
}
 public int sum13(int[] nums) {
  int a=0;   
 for(int i=0;i<nums.length;i++){
   if(nums[i]!=13){
     a+=nums[i];   
   }else{  
     i++; 
   }
 }return a;
}

public boolean has22(int[] nums) {
  boolean boleano=false;   
  for(int i=0;i<nums.length-1;i++){
    if(nums[i]==2 && nums[i+1]==2){ 
      boleano= true;}   
  
  }return boleano;
}
public boolean sum28(int[] nums) {
  int suma=0; 
  for(int i=0;i<nums.length;i++){
    if(nums[i]==2){ 
      suma+=2;      }
  }if(suma==8){
    return true;
  }else{
    return false;
  }
}

//Array-3
public  boolean canBalance(int[] nums) {
  int a=0;  
  int b=0;  
  for(int i=0;i<nums.length-1;i++){
      for (int j=0;j<=i;j++){
      a= a + nums[j]; 
      }
      for(int k =i+1 ; k<nums.length;k++){
        b=b + nums[k];
      }
      if (a==b){
        return true;       }
      a=0; 
      b=0; 
  }
  return false;
}

public int[] seriesUp(int n) {
  int [] matriz= new int [n*(n+1)/2]; 
  for (int i=matriz.length-1; i>=0;i--){ 
  for (int j=n;j>0;j--){
    matriz [i]=j; 
    i=i-1;  
 }
  n=n-1;   
i=i+1;    
}
   return matriz; 
  }

public int[] fix34(int[] nums) {
    for(int i=0;i<nums.length;i++){
     if(nums[i]==3 ){ 
         int a= nums[i+1];
        nums[i+1]=4;   
        for(int t=i;t<nums.length;t++){
          if (nums[t]==4 && nums[t-1]!=3){ 
            nums[t]=a; 
          }
        }
      }
    }
    return nums;
}

public boolean linearIn(int[] outer, int[] inner) {
  int algo=0;  
  boolean alg=false; 
  for(int i=0;i<inner.length;i++){
    alg=false;  
    for (int e=0;e<outer.length;e++){
      if(inner[i]==outer[e]){ 
          alg=true; 
      }        
    }
    if (alg==true){
      algo++;  
    }
  }
  if(algo==inner.length){
    return true; 
  }
  else{
    return false;
  }}

public int countClumps(int[] nums) {
  int count=0;
  for(int i=0; i<nums.length-1;i++){
    if(i>=1 && nums[i]==nums[i-1]){
continue; 
}
    if(nums.length>1 && nums[i]==nums[i+1]){
      count=count + 1; 
    i=i+1; 
    }
  }
  return count;
}

}
