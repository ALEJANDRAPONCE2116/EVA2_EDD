public class Pila {
    public static void main(String[] args) {
        Pila miPila = new Pila();
        miPila.push(new NodoA (100));
        miPila.push(new NodoA (100));
        miPila.push(new NodoA (100));
        miPila.push(new NodoA (100));
        miPila.print();
        System.out.println("CIMA DE LA PILA "+ miPila.peek());
        
        try{
            System.out.println("CIMA DE LA PILA "+ miPila.pop());
        }catch (Exception ex){
            
        }
    }
    
    
}

