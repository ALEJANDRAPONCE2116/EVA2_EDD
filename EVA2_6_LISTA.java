public class Principal6 {
    public static void main(String[] args) {
        Nodo nobj1 = new Nodo (); //nobj1 es un nodo
        nobj1.valor= 100;
        nobj1.siguiente=new Nodo(); //DATA
        nobj1.siguiente.valor=200;//CADENA
        nobj1.siguiente.siguiente=new Nodo();//nodo apunta a otro nodo
        nobj1.siguiente.siguiente.valor=300;//REFERENCE
        
        System.out.println(nobj1.valor);
        System.out.println(nobj1.siguiente.valor);
        System.out.println(nobj1.siguiente.siguiente.valor);
    }
    
}
class Nodo{
//DATO ALMACENAR
    int valor;
            Nodo siguiente; //siguiente es un nodo
}
//listas son cadenas
//cada eslabon de la cadena se va a conocer como nodo
//referencias (direccion de memoria)
//para poder acceder al ultimo elemento, tenemos que pasar por el primero y asi hasta el final.