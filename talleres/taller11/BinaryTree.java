//Realizado por: Manuela Valencia Toro.
public class BinaryTree {
  class Node {
    public Node left;
    public Node right;
    public int data;
    public Node(int d){ 
	  data = d;
   }
}
  private boolean buscar(Node nodo, int n){
      if (nodo == null)
     return false;
    if (nodo.data == n)
      return true;
    if (n < nodo.data)
      return buscar(nodo.left, n);
    return buscar(nodo.right, n);    
  }
	private Node root;
  public boolean buscar(int n){
    return buscar(root, n);
  }
  
    public void borrar(int n){
      if(buscar(n)){
        root=null;
        }  
    }
    
    
    
    

public void insertar (int n)
      {
          Node aux = new Node (n);   
          
          if (root== null)
              root= aux;
              
          else
          {
              Node anterior = null;
              Node otro = root;
              while (otro != null)
              {
                  anterior = otro;
                  if (n < otro.data)
                      otro = otro.left;
                  else
                      otro = otro.right;
              }
              if (n < anterior.data)
                  anterior.left = aux;
              else
                  anterior.right = aux;
                  root=anterior;
          }
        
      }
    }

