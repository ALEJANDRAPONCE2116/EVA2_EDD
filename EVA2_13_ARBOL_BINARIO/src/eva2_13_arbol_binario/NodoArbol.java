package eva2_13_arbol_binario;
public class NodoArbol {
    private int iVal;
    private NodoArbol izquierda; //Varaible que nos dice lo que haremos
    private NodoArbol derecha;
    
  public NodoArbol() { //El final de la lista reprecenta null
        this.izquierda = null;
        this.derecha = null;
    }

    public NodoArbol(int iVal) {
        this.iVal = iVal;
        this.izquierda = null;
        this.derecha = null;
    }

    

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public NodoArbol getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }

    
}
