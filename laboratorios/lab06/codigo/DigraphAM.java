import java.util.*;
/**
 * Esta clase es una implementación de un digrafo usando matrices de adyacencia
 * 
 * @author Mauricio Toro 
 * @version 1
 */
public class DigraphAM extends Graph
{
   private int[][] grafo;
    
   public DigraphAM(int size)
   {
       super(size);
       grafo = new int[size][size];
       for (int i = 0; i < size; i++)
       {
              for (int h = 0; h < size; h++)
                grafo[i][h] = -1;
       
   }
   }
   
   
   /**
    * Este metodo recibe dos enteros y retorna el peso del arco.
    */public int getWeight(int source, int destination)
   {
    return grafo[source][destination];
    }
   
   /**
    * Este metodo recibe tres enteros y almacena el destino y peso en la matriz.
    */public void addArc(int source, int destination, int weight)
   
     {
		 this.grafo[source][destination] = weight;		
		 this.grafo[destination][source] = weight;
	}
	
   
   /**
    * este metodo recibe un entero y retorna una lista de enteros con los sucesores del vertice ingresado.
    */public ArrayList<Integer> getSuccessors(int vertex)
   {
    ArrayList<Integer> lista =new ArrayList<Integer>() ;
    for(int i=0; i<size; i++){
        if(grafo[vertex][i]!=-1)
    lista.add(i);
    }
    return lista;
   }}