
public class BinaryTree {
    public Node root;

    public BinaryTree(){
        root = null;
    }

    /**
     * este metodo recibe dos enteros, y retorna el mayor de ellos.
     */private int max2(int i, int j)
    {
        if (i > j)
            return i;
        return j;
    }

    /**
     * Este método recibe un parámetro tipo Node, y retorna un int indicando la altura del árbol.
     */private int maxheightAUX(Node node)
    {
        if (node == null)
            return 0;
        else 
            return max2(maxheightAUX(node.left), maxheightAUX(node.right))+1;
    }

    /**
     * Este metodo se encarga de invocar el método maxgeightAUX, pone como parámetro "root", y retorna la altura de este.
     */public int maxheight()
    {
        return maxheightAUX(root);
    }

    /**
     * Este metodo recibe un parámetro tipo Node, y retorna los elementos de este.
     */private void recursivePrintAUX(Node node)
    {
        if (node != null)
        {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.data);
        }

    }

    /**
     * Este metodo invoda al metodo recursiveprintAUX, y pasarle como parametro el nodo root.
     */public void recursivePrint()
    {
        recursivePrintAUX(root);
    }

    
   
    /**
     * Este metodo se encarga de invocar el metodo buscara y pasarle como parámetros el nodo root, y un string n.
     */public boolean buscara( String n){
        return buscara(root, n);
    }

    /**
     * Este metodo recibe un parámetro tipo Node y un String, y retorna true o false si el elemento n está o no está.
     */private boolean buscara(Node nodo , String n){
        boolean temp=false; 
        if(nodo == null)return false;
        else {
            if (nodo.data != n)
            {
                return buscara(nodo.left, n)||buscara(nodo.right, n);
            }else{
                return true;
            }
        }

    }
    
    /**
     * Este método se encarga de imprimir el nombre de la abuela de la persona ingresada, recibe un String con el nombre de esta e imprime el nombre de la abuela.
     */public void getGrandMothersName(String name){
        Node nodo;
        nodo= buscarAbuAux(name);
        if(nodo!=null){
        if(nodo.left!=null){
        if(nodo.left.left!=null){
        System.out.println("Nombre: " + nodo.left.left.data);
    return;}}}
        
         System.out.println( "En el árbol no está su abuela");
    }
    Node nodo;
    /**
     * Este método se encarga de buscar en un nodo un String, recibe como parámetros un nodo y un String.
     */public void buscarAbue(Node node,String n){
    if (node != null)
        {
            buscarAbue(node.left,n);
            buscarAbue(node.right,n);
            if(node.data.equals(n)){
               nodo=node;
                return ;
             
            }
        }
    }
     /**
      * Este método recibe un String e invoca al metodo buscarAbue pasandole como parámetro el nodo root y un string n.
      */public Node buscarAbuAux(String n){
        buscarAbue(root, n);
        return nodo;
    }
    
    
}