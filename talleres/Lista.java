 

/**
 *
 * @author 
 */
public class Lista {
      Nodo inicio; 
       
       public class Nodo {    
           int data;     
           Nodo siguiente;            
           public Nodo(int data){    
               this.data = data;
           }
       }  
       
       public Lista(){ 
           inicio= null;
       } 
       
      
       
    public void imprimir() {
        System.out.println("Lista: ");
          Nodo nodo=inicio;
          while(nodo!=null){
            System.out.println(nodo.data + " ");
            nodo=nodo.siguiente;
            }
           
       } 
       
       
       public void agregar_al_final(int n) {
         Nodo nuevo = new Nodo(n);
         Nodo temp = inicio;
        if (temp == null) {
             inicio = nuevo;
        } else {
            while(temp.siguiente!=null){
             temp=temp.siguiente;
            }   
            temp.siguiente = nuevo;
        }
       }
       
       
       
       //Punto 2-a Imprimir los elementos de la lista en orden inverso
       public void imprimir_inverso() { 
          Nodo nodo=inicio;
          String algo="";
          while (nodo!=null){
          algo= "\n" + nodo.data + " " + algo  ;
          nodo=nodo.siguiente;
       }
        System.out.println("Inverso: " +algo);
    }
       
       
       //Punto 2-b Imprimir el valor que se encuentre en la posición n. 
       public void imprimir(int n) { 
           Nodo nodo=inicio;
           for(int i=0;i<n;i++){
               if(nodo!=null){
             nodo=nodo.siguiente;
             }else{
             System.out.println("Ingrese una posicion valida");   
             return ;
            }
          }
           System.out.println(" posicion " + n +" " +nodo.data);
       }  
       
       
       //Punto 2-c Eliminar el nodo del final   
       public void borrarFinal() { 
          Nodo temp = inicio;
          Nodo tmp=temp.siguiente;
          if(inicio.siguiente!=null){
        if (tmp!= null) {
           while(tmp.siguiente!=null){
             temp=temp.siguiente;
             tmp=tmp.siguiente;
            }   
            temp.siguiente = null;
        } 
       }else{
        inicio=null;
        }}
        
         public void agregar_inicio(int n) {  
                   Nodo nuevo = new Nodo(n);
        if (inicio != null) {
            nuevo.siguiente = inicio;
            inicio = nuevo;
        } else {
            inicio = nuevo;
        }
    }       
       
       //Punto 2-d Eliminar el primer nodo de una lista 
       public void borrarInicio() { 
           Nodo temp= inicio;
        if (inicio != null) {
           inicio=inicio.siguiente; 
        }
       }
       
       
       //Punto 3 Comparar el contenido de dos listas.
      public boolean comparar(Lista lista) {  
            Nodo nodoa = inicio;       
           Nodo nodob= lista.inicio; 
           while (nodoa!= null) {  
               if(nodob == null || nodoa.data != nodob.data)
                   return false; 
               nodoa = nodoa.siguiente;
               nodob = nodob.siguiente;
           }        
           if(nodob != null)
               return false;
           return true;
       }
      }  
