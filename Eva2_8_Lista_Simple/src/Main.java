
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {
    public static void main(String[] args) {
        Lista miLista = new Lista();
        miLista.add(new Nodo(45));
        miLista.add(new Nodo(40));
        miLista.add(new Nodo(60));
        miLista.add(new Nodo(80));
        miLista.add(new Nodo(50));
        miLista.add(new Nodo(4));
         miLista.addBegin(new Nodo(99999));
         miLista.print();
        try {
            miLista.deleteAt(0);
            miLista.print();
            miLista.add(new Nodo(200));
            miLista.print();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Posicion 3 en lista es: " + miLista.findAt(3));
       boolean Vacia = miLista.isEmpty();
       if(Vacia)
            System.out.println("Lista vacia");
       else 
            System.out.println("Lista no Vacia");
    }

    
}
