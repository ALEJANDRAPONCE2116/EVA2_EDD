package eva2_14_collections;

import java.nio.file.Files;
import java.util.LinkedList;

public class EVA2_14_COLLECTIONS {
    public static void main(String[] args) {
        LinkedList <String> lListaEnla = new LinkedList <String> (); //Tipo de dato generico ---> <String>
        lListaEnla.add("Hola");
        lListaEnla.add(" ");
        lListaEnla.add("mundo");
        lListaEnla.add(" ");
        lListaEnla.add("cruel");
        lListaEnla.add("!!!");
        lListaEnla.add("xxxxx");
        System.out.println(lListaEnla);
        
        for (String string : lListaEnla) {
            System.out.print(string + " - ");  
        }
        System.out.println("");
        System.out.println("Cantidad de elementos " + lListaEnla.size());
        
        lListaEnla.remove(3);
        System.out.println(lListaEnla);
        
    }
    
}

class Algo {
    
}