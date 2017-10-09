/**
 * Realizado por: Manuela Valencia Toro
 */
import java.util.*;
public class Banco{
    
    Queue [] filas = new Queue[3];   

    /**
     * Este método se encarga de la simucacion de 4 filas que esperan ser atendidas en un banco.
     * Recibe 4 colas llamadas fila1, fila2, fila3, fila4. es un metodo void por lo que no retorna nada.
     */public static void simular(Queue<String> fila1, Queue<String> fila2, Queue<String> fila3, Queue<String> fila4){
        boolean  pasar = false;
        Queue[] personas = {fila1, fila2, fila3, fila4};        
        while(pasar != true){          
            for(int i = 0; i < personas.length; i++){                       
                int j = 1;
                if(fila1.isEmpty() && fila2.isEmpty() && fila3.isEmpty() && fila4.isEmpty()){
                    pasar = true;
                    break;
                }
                else if(personas[i].isEmpty()){
                    while(personas[i].isEmpty()){ 
                        if(i>2){
                            i=0;
                        }
                        else{
                            i++;
                        }
                    }
                    System.out.println(j + ". " + personas[i].poll());
                } 
                else{ 
                    System.out.println(j + ". " + personas[i].poll());
                }
                j = 2;
                i++;
                if(i>3){
                    i=0;
                }
                if(personas[i].isEmpty()){ 
                    while(personas[i].isEmpty()){
                        if(i>2){
                            i=0;
                        }
                        else{
                            i++;
                        }
                    }
                    System.out.println(j + ". " + personas[i].poll());
                } 
                else{
                    System.out.println(j + ". " + personas[i].poll());
                }
            }  
        }
    }
}