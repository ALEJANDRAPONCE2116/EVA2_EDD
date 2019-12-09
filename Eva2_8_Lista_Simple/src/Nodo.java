public class Nodo {
    


    private int iVal;
    private Nodo Siguiente; //Varaible que nos dice lo que haremos
    
  public Nodo() { //El final de la lista reprecenta null
        this.Siguiente = null;

    }

    public Nodo(int iVal) {
        this.iVal = iVal;
        this.Siguiente = null; //SIEMPRE VA 
    }
    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }

  
    
    
}
