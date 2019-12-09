
import java.util.Scanner;

/*
 * 10/Oct/19
 *Recursividad de una funcion realizando el factorial.
 */

/**
 *
 * @author Diana Teresa Ogaz Escarpita 18550698
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Introduce un numero");
       int iVal = sCaptu.nextInt();
        System.out.println("Valor final: " + calFactorial(iVal)); 
    }
    public static int calFactorial(int iVal){
        System.out.println("Inicio: " + iVal);
        if (iVal == 0) {
        return 1; //Termina el metodo actual    
        }
        return iVal * calFactorial(iVal - 1);
        
    }
    
}
