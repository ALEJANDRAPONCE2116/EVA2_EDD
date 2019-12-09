//Isela Alejandra Ponce de Le[on Carrasco

package eva2_9_lista_dobleme;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA2_9_LISTA_DOBLEME {
    public static void main(String[] args) {
        ListaDoble miLista = new ListaDoble();
        miLista.add(new Nodo1(45));
        miLista.add(new Nodo1(40));
        miLista.add(new Nodo1(60));
        miLista.add(new Nodo1(80));
        miLista.add(new Nodo1(50));
        miLista.add(new Nodo1(4));
         miLista.addBeginPrevio(new Nodo1(99999));
         miLista.addBeginSiguiente(new Nodo1(99999));
         miLista.print();
         try {
            miLista.deleteAtPrev(0);
            miLista.print();
            miLista.add(new Nodo1(200));
            miLista.print();
            
            miLista.deleteAtSiguiente(0);
            miLista.print();
            miLista.add(new Nodo1(200));
            miLista.print();
         }catch (Exception ex) {
            Logger.getLogger(EVA2_9_LISTA_DOBLEME.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Posicion 3 en lista es: " + miLista.findAtPrev(3));
        System.out.println("Posicion 3 en lista es: " + miLista.findAtSig(3));
            
        
       boolean Vacia = miLista.isEmpty();
       if(Vacia)
            System.out.println("Lista vacia");
       else 
            System.out.println("Lista no Vacia");
    }
    
}
