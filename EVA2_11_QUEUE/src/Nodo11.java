public class Nodo11 {
    private int iVal;
    private Nodo11 Siguiente; //Varaible que nos dice lo que haremos
    
  public Nodo11() { //El final de la lista reprecenta null
        this.Siguiente = null;

    }

    public Nodo11(int iVal) {
        this.iVal = iVal;
        this.Siguiente = null; //SIEMPRE VA 
    }
    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo11 getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo11 Siguiente) {
        this.Siguiente = Siguiente;
    } 
}
