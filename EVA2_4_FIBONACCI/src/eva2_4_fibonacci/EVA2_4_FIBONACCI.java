//Isela Alejandra Ponce de León Carrasco  ||  18550720

// 0 1 2 3 4 5 6 7   8  9 
// 0 1 1 2 3 5 8 13 21 34
package eva2_4_fibonacci;
public class EVA2_4_FIBONACCI {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    } 
    public static int fibonacci (int posicion){
        //System.out.print(posicion+" ");
        if (posicion ==0){
            return 0;
        }else if(posicion ==1){
            return 1;
        }
        //aqui se aplica recursividad
        return fibonacci(posicion -1) + fibonacci(posicion-2);
        }
   
}
//estructuras lineales y no lineales 