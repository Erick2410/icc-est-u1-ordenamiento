import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        runEjemplosPrimitivos() ;
        runEjemplosObjetos() ;
        runComparators();
    }
    
    private static void runComparators() {
      Integer[] original = { 5, 6, 4, 1, 2, 3 };
      // Array.sort ordena arreglos por su orden natural
      Arrays.sort(original);
      for(int i = 0; i < original.length; i ++){
        System.err.println(original[i]);

      }

      Arrays.sort(original, Comparator.reverseOrder());
      for(int i = 0; i < original.length; i ++){
        System.err.println(original[i]);

      }

    }

    private static void runEjemplosObjetos() {
        Estudiante e1 = new Estudiante("Juan",10);
        Estudiante e2 = new Estudiante("Maria", 7.8);
        Estudiante e3 = new Estudiante("Diego", 3.5);
        
    }
    
    private static void runEjemplosPrimitivos() {
      int [] original = { 5, 6, 4, 1, 2, 3 };
        int [] b = original.clone();
        int [] c = original.clone();
        int [] d = original.clone();
        int [] e = original.clone();
        int [] a = original;
        
        // USAR EL METODO DEL ARCHIVO(clase) BUBBLE
        // INSTANCIAR EL ARCHIVO BUBBLE
        // INSTANCIA LA CLASE BUBBLE
        Bubble buuble = new Bubble();
        // Ejecutar codigo del archivo bubble uso la instancia
        printArreglo(b);
        buuble.sort(b);
        printArreglo(b);

        // USAR EL METODO DEL ARCHIVO(clase) SELECTION
        // INSTANCIAR EL ARCHIVO SELECTION
        Selection selection = new Selection();
        // Ejecutar codigo del archivo selection uso la instancia
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);
        
        // Instanciar Insertion
        //
        System.out.println("\n\n---Insertion Sort---");
        InsertionSort insertion = new InsertionSort();
        System.out.println("ORIGINAL");
        printArreglo(d);
        insertion.sort(d);
        System.out.println("ORDENADO ASCENDENTE");
        printArreglo(d);

        System.out.println("ORIGINAL");
        printArreglo(e);
        insertion.sort1(e);
        System.out.println("ORDENADO DESCENDENTE");
        printArreglo(e);
    }

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " - ");
        System.out.println();
    }

    public static void printArreglo(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length; i++)
            System.out.print(estudiantes[i] + " - ");
        System.out.println();
    }
}
