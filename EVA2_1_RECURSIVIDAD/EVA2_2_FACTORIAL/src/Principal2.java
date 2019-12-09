//Isela Alejandra Ponce de Leon Carrasco  ||  18550720
//Calcula factorial
//factorial 5 -->  5*4*3*2*1
public class Principal2 {

    public static void main(String[] args) {
        System.out.println("Factorial 5 = "+calculaFactorial(5));

    }

    public static int calculaFactorial(int iVal) {
        System.out.println("Inicio "+iVal);
        //el punto para detener el programa es cuando recibimos un 0
        if (iVal == 0) {
            System.out.println("Fin ");
            return 1;
        } else {
            return iVal * calculaFactorial(iVal - 1);
        }
    }
}
