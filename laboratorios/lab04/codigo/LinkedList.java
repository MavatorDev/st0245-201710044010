import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
/**
 * Esta clase contiene los metodos que permiten realizarle modificaciones a la lista.
 */
public class LinkedList{
      private Node first;
      private int size;
    public LinkedList()
    {
    	size = 0;
    	first = null;	
    }

	/**
	 * Returns the node at the specified position in this list.
	 * @param index - index of the node to return
	 * @return the node at the specified position in this list
	 * @throws IndexOutOfBoundsException
	 */
	private Node getNode(int index) throws IndexOutOfBoundsException {
		if (index >= 0 && index < size) {
			Node temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * Returns the element at the specified position in this list.
	 * @param index - index of the element to return
	 * @return the element at the specified position in this list
	 */
	public int get(int index) {
		if (index >= 0 && index < size()) {
			Node temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp.data;
		} else {
			throw new IndexOutOfBoundsException("ingrese valor correcto");
		}

	}

    // Retorna el tamaño actual de la lista
    /**
     * Este medodo retorna el tamaño actual de la lista, no reibe paramentros y retorna un entero indicando el tamaño..
     */public int size()
    {
        Node temp=first;
         int index=0;
         while(temp!=null){
            index++;
            temp=temp.next;
            }
             return index;
    }
    /**
     * Este metodo añade un elemento al final de la lista, recibe un entero con el indice, y es de tipo void por lo que no retorna ningun valor.
     */public void addf(int n) {
         Node first = new Node(n);
         Node temp = first;
        if (temp == null) {
             first= first;
        } else {
            while(temp.next!=null){
             temp=temp.next;
            }   
            temp.next = first;
        }
       }
      /**
       * Este metodo añade un elemento al inicio de la lista, recibe un entero y es de tipo void.
       */  public void addi(int n) {  
                   Node nuevo = new Node(n);
        if (first != null) {
            nuevo.next = first;
            first = nuevo;
        } else {
            first = nuevo;
        }
    }       
    // Inserta un dato en la posición index
    /**
     * Este método inserta un daro en la posicion index de la lista.
     * recibe un entero con el dato, y otro con la posicion donde será almacenado.
     */public void insert(int data, int index)
    {
        Node temp= first;
        Node aux= null;
        Node ant=first;
        int contador=0;
        int s=size();
        if(index<0 || index>size()){
        throw new IndexOutOfBoundsException();
        }else{
            if(index==0){
            addi(data);
            }else if(index==size()){
            addf(data);
            }else{
        while(temp!=null){
        if(index==contador){
        aux= new Node(data);
        aux.next=temp;
        ant.next=aux;
        }
        ant=temp;
        contador++;
        temp=temp.next;
      }
        }
        
   
    }
        }
    
    // Borra el dato en la posición index
    /**
     * Este metodo borra un dato de una posicion especifica de la lista.
     * recibe un entero con la posicion que será eliminada.
     */public boolean remove(int index)
    {
    	Node temp=first;
    	Node ant= null;
    	int contador=0;
    	if(index <0 || index> size()){
    	    return false;
    	   //throw new IndexOutOfBoundsException("Error");
    	      }else{
    	   while(temp!=null){
    	   if(index==contador){
    	       if(ant==null){
    	   first=first.next;
    	   }else{
    	   ant.next=temp.next;
    	   }
    	   temp=null;}else{
    	   ant=temp;
    	   temp=temp.next;
    	   contador++;
    	   }
    	   }
    	   return true;    	
    }
    }
    
    // Verifica si está un dato en la lista
    /**
     * Este metodo verifica si algun dato esta contenido en la lista.
     * Recibe un entero a buscar y retorna un valor booleano que indica si está o no.
     */public boolean contains(int datad)
    {
        boolean existe=false;
        Node temp=first;
        while(temp!=null && !existe){
        if((temp.data)==datad){
        existe=true;
        }
        temp=temp.next;
        }
    	return existe;
    }

}