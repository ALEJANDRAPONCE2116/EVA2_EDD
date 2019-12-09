package eva2_12_arbol_binario;

public class Nodo {

    private int valor;
    private Nodo Izquierda;
    private Nodo Derecha;

    public Nodo() {
        this.Izquierda = null;
        this.Derecha = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.Izquierda = null;
        this.Derecha = null;
    }

    public Nodo getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo previo) {
        this.Derecha = previo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo siguiente) {
        this.Izquierda = siguiente;
    }
}
