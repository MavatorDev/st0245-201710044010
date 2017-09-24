import java.util.*;
/**
 * Estructura datos y algoritmos 1.
 * Ejercicio en linea
 * @author Manuela Valencia. 
 * @version 1.
 */
public class Ejercicio
{
    LinkedList lista= new LinkedList<String>();
    public LinkedList<String> Tecladoroto(String cadena){
    int cambiar=0;
    for(int i=0;i<cadena.length();i++){
    if(cadena.charAt(i)=='['){
    cambiar=0;
    }else if(cadena.charAt(i)==']'){
    cambiar=lista.size();
    }else{
    lista.add(cambiar, cadena.charAt(i));
    cambiar++;
    }
    }
    return lista;
    }
    public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    String frase;
    System.out.print("Introducir el texto");
    frase= sc.nextLine();
    Ejercicio ejercicio= new Ejercicio();
    String respuesta=ejercicio.Tecladoroto(frase).toString();
    System.out.println("Corrección: " + respuesta);
    }
}
