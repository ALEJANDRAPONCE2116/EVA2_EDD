public class Lista {
    
    private Nodo inicio;
    private Nodo fin;
    
    public Lista(){
        this.inicio = null;
        this.fin = null;
    }

    //devuelve true si está vacia
    public boolean isEmpty(){
        if (inicio == null)
        return true;
        else 
        return false;
}
//AGREGAR NODO AL FINAL
public void add(Nodo nuevo){
if (isEmpty()){
    inicio = nuevo;
    fin = nuevo;
}else{
    
    /*Nodo temp = inicio;
    while(temp.getSiguiente() != null){
        temp = temp.getSiguiente();
    }
    temp.setSiguiente(nuevo);*/
    fin.setSiguiente(nuevo);
    fin = nuevo;
}
}
public void addBegin(Nodo nuevo){
  if (isEmpty()){
    inicio = nuevo;
    fin = nuevo;
}else{
      nuevo.setSiguiente(inicio);
      inicio = nuevo;
      
  }  
}
//imprimir lista
public void print(){
    Nodo temp = inicio;
    while(temp != null){
            System.out.print( temp.getiVal() +  " - "  );
            temp = temp.getSiguiente();
            
        }
    System.out.println();
}
//
public int size(){
    int iCont = 0;
    Nodo temp = inicio;
    while(temp != null){
            iCont++;
            temp = temp.getSiguiente();  
        }
    return iCont;
}
public void insertAt(int pos, Nodo nuevo) throws Exception{
    int iTama= size();
    if ((pos < 0)|| (pos >= iTama)){
        throw new Exception("La posicion es invalida");
    }if (pos == 0){
       addBegin(nuevo);
    }
else{
    int iCont = 0;
    Nodo temp = inicio;
    
    while(iCont < (pos - 1)){
        temp = temp.getSiguiente();
        iCont++;
    }
    nuevo.setSiguiente(temp.getSiguiente());
    temp.setSiguiente(nuevo);  
}    
}
public void clear (){ //Vaciar la lista 
    inicio = null;
    fin = null;
}
public void  deleteAt(int pos) throws Exception{
    // BORRAR LA PRIMERA
 if (isEmpty())
            
    throw new Exception("La lista est+a vacia");
    int iTama= size();
    if ((pos < 0)|| (pos >= iTama))
        throw new Exception("La posicion es invalida");
        if(iTama == 1){//solo hay un nodo
            clear();
        }else{// muchos nodos 
            if (pos == 0)// borrar el primer nodo
                inicio = inicio.getSiguiente();
            
        else{
       int iCont = 0;   
       Nodo temp = inicio;
        while(iCont < (pos - 1)){
        temp = temp.getSiguiente();
        iCont++;
    }
        temp.setSiguiente(temp.getSiguiente().getSiguiente());
        if(pos == iTama - 1)
                fin = temp;
            }
     
    
    // BORRAR LA ULTIMA
    // UN SOLO NODO       
            
    
}
}
public int findAt(int pos){
    //verificar
    int iCont = 0;   
       Nodo temp = inicio;
        while(iCont < pos){
        temp = temp.getSiguiente();
        iCont++;
    }
return temp.getiVal();
}

}