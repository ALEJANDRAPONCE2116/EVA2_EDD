package eva2_13_arbol_binario;

public class Arbol {

    private NodoArbol raiz;  //root

    public Arbol() {
        raiz = null;
    }

    //funcion no va a ser recursiva, punto de arranque
    public void agregarNodo(NodoArbol NuevoNodo) {
        agregarNodoRecursivo(raiz, NuevoNodo);
    }

    //funcion recursiva
    public void agregarNodoRecursivo(NodoArbol actual, NodoArbol NuevoNodoArbol) {
        if (raiz == null) { //arbol vacio  
            raiz = NuevoNodoArbol;
            //si el nodo no esta vacio
        } else {
            if (NuevoNodoArbol.getiVal() > actual.getiVal()) {
                if (actual.getDerecha() == null) {
                    actual.setDerecha(NuevoNodoArbol);
                } else {
                    agregarNodoRecursivo(actual.getDerecha(), NuevoNodoArbol);
                }
            } else if (NuevoNodoArbol.getiVal() < actual.getiVal()) {
                //izquerda
                if (actual.getIzquierda() == null) {
                    actual.setIzquierda(NuevoNodoArbol);
                } else {
                    agregarNodoRecursivo(actual.getIzquierda(), NuevoNodoArbol);
                }

            } else {
                System.out.println("Valor repetido");
            }
        }

    }

    public void imprimePostOrder() {
        postOrder(raiz);
    }

    //leer izquierda > leer derecha > imprimir
    private void postOrder(NodoArbol actual) {
//mientras actual sea diferente de null (recursividad)
        if (actual != null) {
            postOrder(actual.getIzquierda());
            postOrder(actual.getDerecha());
            System.out.print(actual.getiVal() + "  ");
        }
    }

    // imprimo > leer izquierda > leer derecha
    public void imprimePreOrder() {
        preOrder(raiz);
    }
    private void preOrder(NodoArbol actual) {
        if (actual != null) {
            System.out.print(actual.getiVal() + "  ");
            preOrder(actual.getIzquierda());
            preOrder(actual.getDerecha());
        }
    }

    //leer izquierda > imprimo > leer derecha
    public void imprimeInOrder() {
        inOrder(raiz);
    }

    private void inOrder(NodoArbol actual) {
        if (actual != null) {
            inOrder(actual.getIzquierda());
            System.out.print(actual.getiVal() + "  ");
            inOrder(actual.getDerecha());
        }
    }

}



//siempre empezamos en raiz
