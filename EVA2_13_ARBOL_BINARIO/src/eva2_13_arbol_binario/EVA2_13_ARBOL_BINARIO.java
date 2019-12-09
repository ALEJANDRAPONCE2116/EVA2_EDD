//ARBOL BINADIO ORDENADO
//almacenar los numeros en un criterio de menor a mayor
package eva2_13_arbol_binario;
public class EVA2_13_ARBOL_BINARIO {
    public static void main(String[] args) {
        Arbol miArbol = new Arbol();
        miArbol.agregarNodo(new NodoArbol(13));
        miArbol.agregarNodo(new NodoArbol(10));
        miArbol.agregarNodo(new NodoArbol(18));
        miArbol.agregarNodo(new NodoArbol(2));
        miArbol.agregarNodo(new NodoArbol(11));
        miArbol.agregarNodo(new NodoArbol(17));
        miArbol.agregarNodo(new NodoArbol(20));
        
        miArbol.imprimePostOrder(); System.out.println("");
        miArbol.imprimePreOrder(); System.out.println("");
        miArbol.imprimeInOrder(); System.out.println("");
    }
    
    
}
