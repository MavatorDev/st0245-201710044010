 //****************REALIZADO POR: MANUELA VALENCIA TORO *************************************
import java.util.*;

/**
 *
 * @author 
 */
public class Taller8 {
	
      
    //Punto 2
    public static void cola (Queue<String> queue){
     
       while(queue.size()>0){
     System.out.println("Atendiendo a " +queue.remove());  
     }
    }
    //Punto 1
    public static Stack<Integer> inversa(Stack<Integer> stack){
     Queue<Integer> q = new LinkedList();
     while(stack.size()>0){
     q.add(stack.pop());  }
          while(q.size()>0){
     stack.push(q.remove());  
     }
    
     return stack;
    }
        //notacion polaca
    public static int polaca  (String string){
         Stack<Integer> s = new Stack();
       for(int i=0;i<string.length();i++)
       {
           if(Character.isDigit(string.charAt(i ))){  
             s.push(Integer.parseInt("" +string.charAt(i) ));           
            }else{
            if (string.charAt(i )=='*'){
            int a= s.pop() * s.pop();
            s.push(a);
            }
            if (string.charAt(i )=='-'){
            int a= s.pop() - s.pop();
            s.push(a);
            }
            if (string.charAt(i )=='+'){
            int a= s.pop() + s.pop();
            s.push(a);
            }
            if (string.charAt(i )=='/'){
            int a= s.pop() / s.pop();
            s.push(a);
            }
            
            }
       }
       
         return s.pop();
    }
   
   
}