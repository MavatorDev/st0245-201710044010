/**
 * Estructura datos y algoritmos 1.
 * 
 * @author Manuela Valencia. 
 * @version 1.
 */
import java.util.*;

public class Laboratory3 {


    /**
     * Returns the product of the numbers in the list. 
     * @param list - List of integers.
     * @return An integer.
     */
    public static int multiply(List<Integer> list) {
        Iterator iter = list.iterator();
        int a =1;
        while(iter.hasNext()){    
            a=a*(Integer)iter.next();
     }
    return a;
   }
     /**
     * Add an integer to end of a list. 
     * @param list - List of integers and an integer data.
     * @return A String.
     */public static String  SmartInsert(List<Integer> list, int data){
         if(!list.contains(data)){
             list.add(data);
            }       
            return (Arrays.toString(list.toArray()));
     }
     /**
     * Returns the pivote of the numbers in the list. 
     * @param list - List of integers.
     * @return An integer.
     */public static int pivote(List<Integer> list){
        Iterator iter = list.iterator();
        int result =-1;
        int sum1;
        int sum2;
        int mientras=1000000;
        while(iter.hasNext()){    
            sum1=0;
            sum2=0;
            int a=list.lastIndexOf((Integer)iter.next());
            List<Integer> b= list.subList(0,a);
              Iterator itera = b.iterator();
           while(itera.hasNext()){  
            sum1=sum1+(Integer)itera.next();
            }
            List<Integer> c= list.subList(a,list.size());
           Iterator iterb = c.iterator();   
           while(iterb.hasNext()){
           sum2=sum2+(Integer)iterb.next(); 
            }
           if(Math.abs(sum1-sum2)<=mientras){
            mientras=Math.abs(sum1-sum2);
            result=a-1;
            }}
        return result;
        }
    /**
     * Print the refrigerators sold  to stores. 
     * @param neveras - List of Strings, solicitudes - list of Strings .
     * @print A String.
     */public static void Ejercicio4(List<String> neveras,List<String> solicitudes){
     System.out.println("");
        Queue<String> solicitud = new LinkedList();
     Stack<String> nevera = new Stack();
     Iterator iternev= neveras.iterator();
     
     while(iternev.hasNext()){
        nevera.push((String)iternev.next());
        }
     Iterator itersol= solicitudes.iterator();
     while(itersol.hasNext()){
        solicitud.add((String)itersol.next());
        }
      for(int i=nevera.size();i>=0;i--){
          String solicitu=solicitud.remove();
        System.out.print( solicitu);
           int k=i;
           int j=Integer.parseInt(solicitu.charAt(solicitu.length()-1)+"");
        while(k>i-Integer.parseInt(solicitu.charAt(solicitu.length()-1) + "")){
            if(nevera.size()>0){
         System.out.print( " " + "( " + k + ", " + nevera.pop() + " )");
         k--;
         }else{
            return ;
            }
        
        }
        i=k+1;
         System.out.println("");
        }
    }
    
    
    
    /**
     * Tests the methods.
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> linked = new LinkedList<>();
        linked.addAll(Arrays.asList(new Integer[] {1, 3, 5, 7}));

        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[] {2, 4, 6, 8}));
        
      LinkedList<Integer> linked2 = new LinkedList<>();
        linked2.addAll(Arrays.asList(new Integer[] {2, 6, 7, 1,20}));

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.addAll(Arrays.asList(new Integer[] {20, 8, 14, 7,1}));
        
         LinkedList<String> linknev = new LinkedList<>();
        linknev.addAll(Arrays.asList(new String[] {"Kaley","Samsung","LG", "Algunaotra","Haceb"}));

        ArrayList<String> arraynev = new ArrayList<>();
        arraynev.addAll(Arrays.asList(new String[] {"haceb", "LG", "Samsung","whirpool","haceb","Kontrol"}));
        
        LinkedList<String> linksolic = new LinkedList<>();
        linksolic.addAll(Arrays.asList(new String[] {"exito2","Las marias1","Homcenter3","Falabella4"}));
        
          ArrayList<String> arraysolic = new ArrayList<>();
        arraysolic.addAll(Arrays.asList(new String[] {"Constructor3","Exito1","Falabella4"}));
        
        //pivote
        System.out.println("pivote  for "+ Arrays.toString(array2.toArray()) + " : " +pivote(array2));     
        System.out.println("pivote for  " + Arrays.toString(linked2.toArray()) + " : "  +pivote(linked2));
        
        // Multiply        
        System.out.println("multiply for " +  Arrays.toString(linked.toArray()) + " : " + multiply(linked));
        System.out.println("multiply for " +  Arrays.toString(array.toArray()) + " : " +multiply(array));
        
        //SmartInsert
        System.out.println(" Insert 4 in " + Arrays.toString(linked.toArray()) + " : " +SmartInsert(linked,4));
        System.out.println("Insert 10 in " +  Arrays.toString(array.toArray()) + " : " +SmartInsert(array,10));
        
        //Almacén
        Ejercicio4(arraynev,arraysolic);
        System.out.println("");
        Ejercicio4(linknev,linksolic);
    }

}