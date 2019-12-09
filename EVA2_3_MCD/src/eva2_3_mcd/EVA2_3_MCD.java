//Isela Alejandra Ponce de León Carrasco  ||  18550720
package eva2_3_mcd;
public class EVA2_3_MCD {
    public static void main(String[] args) {
        System.out.println(MCD( 180,48));
    }
    
    public static int MCD (int dividendo, int divisor){
        System.out.println(dividendo+"/"+divisor);
        //cuando detenemos recursión  ---> cuando el divisor sea 0
        if (divisor == 0){
            return dividendo;
        } else{
            int residuo = dividendo%divisor;
            return MCD(divisor, residuo);
        }
    }
}
