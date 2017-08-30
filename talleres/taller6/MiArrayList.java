
import java.util.Arrays;
public class MiArrayList {
        private int size;
        private static final int DEFAULT_CAPACITY = 10;
        private int elements[];
          // Inicializa los atributos size en cero y elements como un arreglo de tamaño  DEFAULT_CAPACITY. No, no recibe parámetros.
        public MiArrayList() {
         size=0;
         elements= new int [DEFAULT_CAPACITY];
       
        }

               public int size() {
           return size;
        }
                
        public void add(int e) {
            if(size<elements.length){
                elements[size] = e;
            
            }else{
            agrandar(size,e);
            }
            size++;
        }
        
        public int get(int i) {
           return elements[i];
        }
         
         public void add(int index, int e) {
             if(size< elements.length-1){
                  if(size>=index){
                    for(int i=size; i>=index;i--){
                       elements[i+1]= elements [i];
                   
                        }
                    elements[index]=e;

                    }
                    else{elements[index]=e;
                    }
                
                }
                else{
                    agrandar(index,e);
                      
                }
            size=size+1;
        }
                 
        public void agrandar(int index, int e){
             
             int elements2[]=new int [(elements.length *2) ];
                       for(int i=0;i<elements.length; i++){
                elements2[i]=elements[i];
                }
               elements=elements2;
               elements[index]=e;
            }


    }
    
    //REALIZADO POR: MANUELA VALENCIA TORO