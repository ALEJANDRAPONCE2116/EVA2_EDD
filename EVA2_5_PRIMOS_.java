package eva2_5_primos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sCap = new Scanner(System.in);
        System.out.println("Ingresa numero: ");
        int x = sCap.nextInt();          
        if(esPrim(x))
        System.out.println("Es primo");
        else
        System.out.println("No es primo");
    }
    public static boolean esPrim(int x){
        boolean resu = false;
        for (int i = 2; i < x; i++) {
            if ((x % 1)==0) {
            resu = true;
            break;
            }
        }
        return resu;
    }
    
}
