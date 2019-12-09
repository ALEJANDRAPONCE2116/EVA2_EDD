package eva2_16_tipos_genericos;
public class EVA2_16_TIPOS_GENERICOS {
    public static void main(String[] args) {
       
        Nodo <String> nodo = new Nodo <String>();
        nodo.setValor("Hola mundo cruel !!!");
    }
    
}
class Nodo <T> {
    private T valor;
    Nodo siguiente;
    Nodo previo;

    public Nodo() {
        this.siguiente = siguiente;
        this.previo = previo;
    }
    
    public Nodo(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
}