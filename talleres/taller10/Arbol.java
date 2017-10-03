
/**
 * Write a description of class Arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arbol
{
    public Nodo raiz;
    public Arbol(){
    raiz=null;
    }
    public void imprimir(){
    imprimirr(raiz);
    }
    private void imprimirr(Nodo r){
    if(r!= null){
    imprimirr(r.izq);
    imprimirr(r.der);
    System.out.println(r.dato);
    }
    }
    public static void dibujarArbol(Arbol a){
    System.out.println("/* arbolito para http://www.webgraphviz.com/ */"); 
       System.out.println("digraph arbolito {");
       System.out.println("size=\"6,6\";");
       System.out.println("Nodo [color=aquamarine, style=filled];");
       dibujarArbolAux(a.raiz);
       System.out.println("}");
    }
    public static void dibujarArbolAux(Nodo nodo)
   {
      if (nodo != null)
         //"x_\n__" -> "xo\n__";
         for(Nodo n: new Nodo[] {nodo.izq, nodo.der} ){
            if (n != null)
               System.out.println("\"" + nodo.dato + "\" -> \"" + n.dato + "\";");
            dibujarArbolAux(n);
        }
   }
    
}
