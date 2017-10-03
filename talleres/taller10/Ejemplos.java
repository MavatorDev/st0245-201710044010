
public class Ejemplos
{
   Arbol ejemplo= new Arbol();
   public static void main(String [] args){
     //Crea el árbol familiar
        Arbol arbolGenealogico = new Arbol();
        Nodo raiz = new Nodo("Wilkenson");
        arbolGenealogico.raiz = raiz;
        Nodo hijo1 = new Nodo("Joaquina");
        raiz.izq = hijo1;
        Nodo hijo2 = new Nodo("Sufranio");
        raiz.der = hijo2;
        Nodo nieto1 = new Nodo("Eustaquia");
        hijo1.izq = nieto1;
        Nodo nieto2 = new Nodo("Eustaquio");
        hijo1.der = nieto2;
        Nodo bisnieto1 = new Nodo("Florinda");
        nieto1.izq = bisnieto1;
        Nodo bisnieto2 = new Nodo(" ");
        nieto1.der = bisnieto2;
        Nodo bisnieto12 = new Nodo(" ");
        nieto2.izq = bisnieto12;
        Nodo bisnieto22 = new Nodo("Jovin");
        nieto2.der = bisnieto22;
        Nodo nieto12 = new Nodo("Piolina");
        hijo2.izq = nieto12;
        Nodo nieto22 = new Nodo("Piolín");
        hijo2.der = nieto22;
        Nodo bisnietoder = new Nodo("Wilberta");
        nieto12.izq = bisnietoder;
        Nodo bisnietoder2 = new Nodo(" ");
        nieto12.der = bisnietoder2;
        Nodo bisnietoderp = new Nodo(" ");
        nieto22.izq = bisnietoderp;
        Nodo bisnietoderp2 = new Nodo("Usvany");
        nieto22.der = bisnietoderp2;
        
        //Imprime el árbol familiar
        arbolGenealogico.imprimir();

        //Dibuja el árbol familiar
       arbolGenealogico.dibujarArbol(arbolGenealogico);
    } 
}
