import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjemplosPrimitivos() ;
       // runEjemplosObjetos() ;
        //runComparators();


        //runComparatorsObj();
        //runComparatorsObj2();

        Comparators comparators = new Comparators();

    }
    
    private static void runComparatorsObj2() {
        Estudiante e1 = new Estudiante("Juan",10);
        Estudiante[] estudiantes = {e1,
             new Estudiante("Pedro",6.8),
             new Estudiante("Maria",7.0),
             new Estudiante("Diego", 3.5)

        };

        Comparator.naturalOrder();
        Comparator.reverseOrder();
        Comparator<Estudiante> compNota = Comparator.comparingDouble(e -> e.getNota());

        Arrays.sort(estudiantes, compNota);
        System.out.println(Arrays.toString(estudiantes));






        List<Estudiante> estudiantesLista = new ArrayList<>(List.of(
             new Estudiante("Pedro",6.8),
             new Estudiante("Maria",7.0),
             new Estudiante("Diego", 3.5)));

             //Ordenar por la nota
             estudiantesLista.sort(compNota);
            
        

    }

    private static void runComparatorsObj() {
        List<Integer> numeros = new ArrayList<>(List.of(5, 6, 4, 1, 2, 3));

        // Orden de menor a mayor
        numeros.sort(null);
        numeros.sort(Comparator.naturalOrder());

        System.out.println(numeros);
        //Ordenar de mayor a menor
        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);



    }

    private static void runComparators() {
      Integer[] original = { 5, 6, 4, 1, 2, 3 };
      // Array.sort ordena arreglos por su orden natural
      Arrays.sort(original);
      for(int i = 0; i < original.length; i ++){
        System.out.println(original[i]);

      }

      Arrays.sort(original, Comparator.reverseOrder());
      for(int i = 0; i < original.length; i ++){
        System.out.println(original[i]);

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
