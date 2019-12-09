//Isela Alejandra Ponce de León Carrasco   ||  18550720
package eva3_1_ordenamientos;

import java.time.Clock;

public class EVA3_1_ORDENAMIENTOS {

    public static void main(String[] args) {
        int[] datos = new int[6];
        long ini, fin;
       /* llenar(datos);
        System.out.println("Desordenados:  ");
        imprimir(datos);*/

        /*System.out.println();

        System.out.println("SelectionSort: ");
        llenar(datos);
        imprimir(datos);
        ini = System.nanoTime();
        SelectionSort(datos);
        fin = System.nanoTime();
        imprimir(datos);
        System.out.print("Tiempo= " + (fin - ini) + "\n");

        System.out.println("\nInsertionSort: ");
        llenar(datos);
        imprimir(datos);
        ini = System.nanoTime();
        insertionSort(datos);
        fin = System.nanoTime();
        imprimir(datos);
        System.out.print("Tiempo= " + (fin - ini) + "\n");

        System.out.println("\nBubbleSort: ");
        llenar(datos);
        imprimir(datos);
        ini = System.nanoTime();
        bubbleSort(datos);
        fin = System.nanoTime();
        imprimir(datos);
        System.out.print("Tiempo= " + (fin - ini) + "\n");*/

        /*  System.out.println();
        char a = 'A';
        char b = 'B';
        if (a<b){
            System.out.println("Menor");
        }*/
        
        llenar(datos);
        imprimir(datos);
        quickSort(datos);
        imprimir(datos);
    }

//metodo que nos permite llenar un arreglo con valores aleatoreos
    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

//Imprimir arreglo
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }

//-----------> ORDENAMIENTO POR SELECCIÓN <---------------
    // O(N^2)
    //La lista está dividida en dos sublistas
    //i empieza en posicion 0 (marca el inicio y siempre va a estar al principio del arreglo)   
    //Encontramos el elemento más pequeño de la sublista sin clasificar y lo intercambiamos con el elemento al comienzo de los datos sin clasificar.
    //están divididas por un muro imaginario. 
    //el muro imaginario entre las dos sublistas mueve un elemento hacia adelante, aumentando el número de elementos ordenados y disminuyendo el número de elementos sin clasificar
    //Cada vez que movemos un elemento de la sublista no ordenada a la sublista ordenada, decimos que hemos completado un pase de clasificación.    
    //n-1 pases para organiza los elementos (analiza todos menos a si mismo)   
    //j empieza en i+1
    //i-1???
    //intercambio ---> variable temporal
    public static void SelectionSort(int[] arreglo) {
        int min;
        //para i=1 hasta n-1
        for (int i = 0; i < arreglo.length; i++) {
            min = i;
            for (int j = i + 1; j < arreglo.length; j++) { //busca en los elementos restantes el mas pequeno
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            //SWAP 
            int intercambio = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = intercambio;
        }
    }

//-----------> ORDENAMIENTO POR INSERCIÓN <---------------
    // O(N^2)
    //divide el arreglo en dos partes, una ordenada y una en desorden
    //Va a tomar el primero de la parte en desorden y lo va a poner en la parte ordenada
    //Va hacia atras
    //VARIABLES: 
    //1 que recorra el elemento hacia adelante (i) que va a marcar el primer elemento desrdenado
    //punto donde lo vamos a insertar (punto de insersion) (insP) va a avanzar hacia atras y se va a detener donde este el punto de insersion 
    //valor previo que compara contra los valores hacia atras (prev)
    //comparamos previo contra temp
    //previo contra insertion point
    //selection sort hace mas comparaciones, pero menos intercambios
    //insertion sort hace mas intercambios, pero menos comparaciones
    public static void insertionSort(int[] arreglo) {
        int insertP;
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i];
            for (insertP = i; insertP > 0; insertP--) { //siempre el segundo for es donde voy a comparar
                int previo = insertP - 1; //if (j-1) > se hace el cambio de elementos y se mueve a la izquierda
                if (arreglo[previo] > temp) { //23>78 //if (j-1) > se hace el cambio de elementos y se mueve a la izquierda
                    //SWAP
                    arreglo[insertP] = arreglo[previo];
                } else {
                    break;//falta detenerlo e insertarlo donde quede insertionpoint (la variable insertP se va reduciendo) 
                }
            }
            arreglo[insertP] = temp;
        }
    }

    //-----------> ORDENAMIENTO POR BURBUJA <---------------
    public static void bubbleSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    //-----------> ORDENAMIENTO QUICK SORT<---------------
    //O(n*log2n)
    //Son recursivos
    //se bansan en dividir el proyecto en divide y venceras (partes mas peque;as y resolver el problema por separado y al final combinar las partes separadas)
    //pibote, los mas pequenios a la izquierda y los mas grandes a la derecha
    //el elemento seleccionado en el arreglo va a ser el pibote
    //se requieren dos indices, uno va a avanzar, el otro va a retoceder
    //van a mover los mas pequenios a la izquierda y los mas grandes a la derecha
    //nos detenemos cuando encontramos uno mas grande que el pibote y cuando ya llegamos al final
    //voy a ir haciendo avanzar el pibote hasta encontrar algo que no cumpla las condiciones
    //cuando se detengan y no se crucen hay que intercambiar
    //cuando llegan al punto de cruzarse los pibotes quedan los mas pequenios a la izquierda y los mas grandes a la derecha
    //cuando ya se tienen agrupados los e izquierda y derecha se parte el arreglo (divide y venceras)
    public static void quickSort(int[] arreglo) {
        //aplica el ordenamiento
        quickSortRecursivo(arreglo, 0, arreglo.length - 1);
    }

    public static void quickSortRecursivo(int[] arreglo, int ini, int fin) {
        if((ini < fin)&& (ini >= 0) && (fin < arreglo.length)){ //que se detenga 
        int pivote = ini;
        int too_big = ini + 1; //avanza
        int too_Small = fin; //retrocede
        int temp ;

        //el algoritmo se detienen cuando los dos se cruzan
        while (too_big < too_Small) {
            //while porque no se sabe cuando se va a detener 
            while ((too_big < fin) && (arreglo[too_big] < arreglo[pivote])) {
                too_big++;
            }
            while ((too_Small > (ini + 1)) && (arreglo[too_Small] > arreglo[pivote])) {
                too_Small--;
            }

            if (too_big < too_Small) { //no hay cruce
                temp = arreglo[too_big];
                arreglo[too_big] = arreglo[too_Small];
                arreglo[too_Small] = temp;
            } 
        }
        temp = arreglo[pivote];
        arreglo[pivote]=arreglo[too_Small];
        arreglo[too_Small]=temp;
        
        //hacer llamada recursiva (quick sort a la izquierda y a la derecha)
        quickSortRecursivo(arreglo, ini, too_Small-1); //izquierda
        quickSortRecursivo(arreglo, too_Small+1, fin); //derecha
        
        // detener la llamada recursiva
    }
    }
}
