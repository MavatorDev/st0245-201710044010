/**
 * Basado de: https://www.lawebdelprogramador.com/codigo/Java/2257-Arboles-binarios-de-busqueda.html
 */
import java.util.*;
public class EjercicioEnLinea {
 
    private class nodoArbol {
        private EjercicioEnLinea hd;
        private EjercicioEnLinea hi;
        private int dato;
 
        private void nodoArbol(){
            hd = null;
            hi = null;
            dato = 0;
        }
    }
 
    public nodoArbol raiz;
        public void imprimir(){
        if (!esVacio()) {
            raiz.hi.imprimir();            
            raiz.hd.imprimir();
            System.out.print( raiz.dato + ", "  );
        }
    }
    
    public void EjercicioEnLinea(){
        nodoArbol raiz = new nodoArbol();
    }
 
    private boolean esVacio(){
        return (raiz == null);
    }
 
    private void insertar(int a){
        if (esVacio()) {
            nodoArbol nuevo = new nodoArbol();
            nuevo.dato = a;
            nuevo.hd = new EjercicioEnLinea();
            nuevo.hi = new EjercicioEnLinea();
            raiz = nuevo;
        }
        else {
            if (a > raiz.dato) {
                (raiz.hd).insertar(a);
            }
            if (a < raiz.dato){
                (raiz.hi).insertar(a);
            }
        }
    }
 
    public void solucion(){
         int numero;
      Scanner i=new Scanner(System.in);
      numero=i.nextInt();
        if(numero==-1){ 
            imprimir();}else{
           insertar(numero);
          solucion();
     }
    }
 
    
 
    
}