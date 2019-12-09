package eva2_9_lista_dobleme;

public class ListaDoble {

    private Nodo1 inicio;
    private Nodo1 fin;

    //CONSTRUCTOR
    public ListaDoble() {
        this.inicio = null;
        this.fin = null;
    }

    //devuelve true si está vacia
    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(Nodo1 nuevo) {
        //caso1 --> lista vacia 
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            //
            fin.setSiguiente(nuevo);//hacia adelante
            fin.setPrevio(nuevo); //hacia el fin
            fin = nuevo;
        }
    }

    public void addBeginSiguiente(Nodo1 nuevo) {
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;

        }
    }

    public void addBeginPrevio(Nodo1 nuevo) {
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setPrevio(fin);
            inicio = nuevo;

        }
    }

    //imprimir lista
    public void print() {
        Nodo1 temp = inicio;
        while (temp != null) {
            System.out.print(temp.getiVal() + " - ");
            temp = temp.getSiguiente();

        }
        System.out.println();
    }
    //imprimir la lista de fin a inicio

    public void printBack() {
        Nodo1 temp = fin;
        while (temp != null) {
            System.out.print(temp.getiVal() + " - ");
            temp = temp.getPrevio();

        }
        System.out.println();
    }

    public int size() {
        int iCont = 0;
        Nodo1 temp = inicio;
        while (temp != null) {
            iCont++;
            temp = temp.getSiguiente();
        }
        return iCont;
    }

    public void insertAtPrev(int pos, Nodo1 nuevo) throws Exception {
        int iTama = size();
        if ((pos < 0) || (pos <= iTama)) {
            throw new Exception("La posicion es invalida");
        }
        if (pos == 0) {
            addBeginPrevio(nuevo);
        } else {
            int iCont = 0;
            Nodo1 temp = fin;

            while (iCont > (pos - 1)) {
                temp = temp.getPrevio();
                iCont--;
            }
            nuevo.setSiguiente(temp.getPrevio());
            temp.setPrevio(nuevo);
        }
    }

    public void insertAtsig(int pos, Nodo1 nuevo) throws Exception {
        int iTama = size();
        if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es invalida");
        }
        if (pos == 0) {
            addBeginSiguiente(nuevo);
        } else {
            int iCont = 0;
            Nodo1 temp = inicio;

            while (iCont < (pos - 1)) {
                temp = temp.getSiguiente();
                iCont++;
            }
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
        }
    }

//Vaciar la lista 
    public void clear() {
        inicio = null;
        fin = null;
    }

    public void deleteAtSiguiente(int pos) throws Exception {
        if (isEmpty()) {
            if (isEmpty()) {
                throw new Exception("La lista esta vacia");
            }
        }
        int iTama = size();
        if ((pos < 0) || (pos >= iTama)) {
            throw new Exception("La posicion es invalida");
        }
        if (iTama == 1) {//solo hay un nodo
            clear();
        } else {// muchos nodos 
            if (pos == 0)// borrar el primer nodo
            {
                inicio = inicio.getSiguiente();
            } else {
                int iCont = 0;
                Nodo1 temp = inicio;
                while (iCont < (pos - 1)) {
                    temp = temp.getSiguiente();
                    iCont++;
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if (pos == iTama - 1) {
                    fin = temp;
                }
            }
        }
    }

    public void deleteAtPrev(int pos) throws Exception {
        if (isEmpty()) {
            if (isEmpty()) {
                throw new Exception("La lista esta vacia");
            }
        }
        int iTama = size();
        if ((pos > 0) || (pos <= iTama)) {
            throw new Exception("La posicion es invalida");
        }
        if (iTama == 1) {//solo hay un nodo
            clear();
        } else {// muchos nodos 
            if (pos == 0)// borrar el primer nodo
            {
                fin = fin.getPrevio();
            } else {
                int iCont = 0;
                Nodo1 temp = fin;
                while (iCont > (pos + 1)) {
                    temp = temp.getPrevio();
                    iCont--;
                }
                temp.setSiguiente(temp.getPrevio().getPrevio());
                if (pos == iTama + 1) {
                    inicio = temp;
                }
            }
        }
    }

    public int findAtSig(int pos) {
        //verificar
        int iCont = 0;
        Nodo1 temp = inicio;
        while (iCont < pos) {
            temp = temp.getSiguiente();
            iCont++;
        }
        return temp.getiVal();
    }

    public int findAtPrev(int pos) {
        //verificar
        int iCont = 0;
        Nodo1 temp = fin;
        while (iCont > pos) {
            temp = temp.getPrevio();
            iCont--;
        }
        return temp.getiVal();
    }

}
