public class NodoA {
    


    private int iVal;
    private NodoA Siguiente; //Varaible que nos dice lo que haremos
    
  public NodoA() { //El final de la lista reprecenta null
        this.Siguiente = null;

    }

    public NodoA(int iVal) {
        this.iVal = iVal;
        this.Siguiente = null; //SIEMPRE VA 
    }
    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public NodoA getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoA Siguiente) {
        this.Siguiente = Siguiente;
    }

  
    
    
}
