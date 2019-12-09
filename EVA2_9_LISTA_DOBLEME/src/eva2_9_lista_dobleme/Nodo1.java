package eva2_9_lista_dobleme;

public class Nodo1 {
    private int iVal;
    private Nodo1 Siguiente; //Varaible que nos dice lo que haremos
    private Nodo1 Previo;
    
  public Nodo1() { //El final de la lista reprecenta null
        this.Siguiente = null;
        this.Previo = null;
    }

    public Nodo1(int iVal) {
        this.iVal = iVal;
        this.Siguiente = null; //SIEMPRE VA 
        this.Previo=null;
    }
    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo1 getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo1 Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Nodo1 getPrevio() {
        return Previo;
    }

    public void setPrevio(Nodo1 Previo) {
        this.Previo = Previo;
    }
    
    
}
