// Isela Alejandra Ponce de Leon Carrasco  ||  18550720
package eva3_2_comparator;

import java.util.Comparator;
import java.util.LinkedList;

public class EVA3_2_COMPARATOR {
    public static void main(String[] args) {
        LinkedList <Integer> lListaEnla = new LinkedList <Integer> ();
        lListaEnla.add(10);
        lListaEnla.add(12);
        lListaEnla.add(20);
        lListaEnla.add(65);
        lListaEnla.add(82);
        lListaEnla.add(56);
        lListaEnla.add(75);
        lListaEnla.add(94);
        lListaEnla.add(25);
        lListaEnla.add(68);
        lListaEnla.add(23);
        lListaEnla.add(58);
        lListaEnla.add(82);
        lListaEnla.add(69);
        lListaEnla.add(11);
        System.out.println(lListaEnla);
        
        Comparator c = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) { // estoy creando un objeto y al mismo tiempo estoy creando un metodo
               int resu;
               //CERO --> IGUAL
               //POSITIVO --> MAYOR
               //NEGATIVO --> MENOR
                Integer val1, val2;
               val1 = (Integer) o1;
               val2 = (Integer) o2;
               resu = val1 - val2;
               return resu;
            }
        };  //{} defino una clase anonima   
        
        lListaEnla.sort(c); //regresa un valor +,-,0
        System.out.println(lListaEnla);
        
        LinkedList<String> listaStr = new LinkedList<>();
        listaStr.add ("hola");
        listaStr.add (" ");
        listaStr.add ("mundo");
        listaStr.add (" ");
        listaStr.add ("cruel");
        listaStr.add ("!");
        
        Comparator cmSrt = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String cade1 = (String) o1;
                String cade2= (String) o2;
                char c1 = cade1.charAt(0);
                char c2 = cade2.charAt(0);
                return  c1-c2;
            }
        };
        System.out.println(listaStr);
        listaStr.sort(cmSrt);
        System.out.println(listaStr);
    }
    
}
