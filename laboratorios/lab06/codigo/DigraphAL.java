import java.util.ArrayList;
/**
 * Esta clase es una implementación de un digrafo usando listas de adyacencia
 * 
 * @author Manuela Valencia 
 * @version 1
 */
public class DigraphAL extends Graph
{
   private ArrayList<ArrayList<Integer>> peso;
   private ArrayList<ArrayList<Integer>> grafo;
   
   
   public DigraphAL(int size)
   {
       super(size);
       grafo = new ArrayList<ArrayList<Integer>>();
       peso = new ArrayList<ArrayList<Integer>>();
       for (int i = 0; i <= size-1; i++)
       {
        ArrayList<Integer> Aristas = new ArrayList<Integer>();
        ArrayList<Integer> pesos = new ArrayList<Integer>();
        grafo.add(Aristas);
        peso.add(pesos);
       }
   }
   
   /**
    * Este metodo recibe tres enteros y almacena el destino y peso en las listas.
    */public void addArc(int source, int destination, int weight)
   {
       grafo.get(source).add(destination);
       peso.get(source).add(weight);
   }
   
   /**
    * Este metodo recibe dos enteros y retorna el peso del arco.
    */public int getWeight(int source, int destination)
   {
      int num=0;
      while(num<grafo.get(source).size()){
        if (grafo.get(source).get(num) == destination)
            return peso.get(source).get(num);
            num++;
      }
      return num;
   }
  
   /**
    * este metodo recibe un entero y retorna una lista de enteros con los sucesores del vertice ingresado.
    */public ArrayList<Integer> getSuccessors(int vertices)
   {
      return grafo.get(vertices);
   }
}