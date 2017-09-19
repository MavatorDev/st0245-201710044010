
/**
 * Taller 9 Estructura de datos 1.
 * 
 * @author Manuela Valencia Toro 
 * @version 1
 */
import java.util.*;
public class UnaTablaDeHash
{
   private int[] tabla;
   public UnaTablaDeHash(){
      tabla = new int[10];
   }
   private int funcionHash(String k){
       int hash=0;
       for(int i=1;i<k.length();i++){
        hash=hash+ ((int) k .charAt(i-1)*i); 
        }
       return hash % 10;
   }
   public int get(String k){
    return tabla[funcionHash(k)];
    
   }
   public void put(String k,int v){
       tabla[funcionHash(k)]=v;
   }
   
   public static void main(String [] args){
    Hashtable empresas = new Hashtable();
    empresas.put("Google", "Estados Unidos");
    empresas.put("La locura", "Colombia");
    empresas.put("Nokia", "Finlandia");
    empresas.put("Sony", "Japon");
    if(empresas.containsKey("Google")){
    System.out.println("Google pertenece a: " + empresas.get("Google"));
 }else{
 System.out.println("Google no está");
 }

 if(empresas.containsKey("motorola")){
    System.out.println("motorola pertenece a: " + empresas.get("motorola"));
 }else{
 System.out.println("motorola no está");
 }
    Enumeration e = empresas.elements();
   Object valor;
  if(empresas.containsValue("India")){
    System.out.println( "India está " );
    }else{
    System.out.println( "India no está " );
    }
 if(empresas.containsValue("Estados Unidos")){
    System.out.println( "Estados Unidos está " );
    }else{
    System.out.println( "Estados Unidos no está " );
    }
      
}
}
