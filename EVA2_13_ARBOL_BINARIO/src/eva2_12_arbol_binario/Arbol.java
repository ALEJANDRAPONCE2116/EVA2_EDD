package eva2_12_arbol_binario;

public class Arbol {

    private Nodo root;

    public Arbol() {
        root = null;
    }

    public void agregarNodo(Nodo nuevo) {
        agregarNodoRec(root, nuevo);
    }

    private void agregarNodoRec(Nodo actual, Nodo nuevo) {
        if (root == null) { //Arbol vacio
            root = nuevo;
        } else {
            if (nuevo.getValor() > actual.getValor()) {//Mayor --> Derecha
                if (actual.getDerecha() == null) {//Vacio, hay espacio
                    actual.setDerecha(nuevo);
                } else {//Ya hay un nodo
                    agregarNodoRec(actual.getDerecha(), nuevo);
                }
            } else if (nuevo.getValor() < actual.getValor()) {//Menos --> Izquierda
                if (actual.getIzquierda() == null) {//Vacio, hay espacio
                    actual.setIzquierda(nuevo);
                } else {//Ya hay un nodo
                    agregarNodoRec(actual.getIzquierda(), nuevo);
                }
            } else {// El valor ya existe
                System.out.println("ya existe el valor "+nuevo.getValor());
            }
        }
    }
}
