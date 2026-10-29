import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.Estudiante;

public class Comparators {

    private List<Estudiante> estList;
    private Estudiante[] estArray;

    public Comparators(){
        Estudiante e1 = new Estudiante("Juan",10);
        estArray = new Estudiante[] {e1,
             new Estudiante("Pedro",6.8),
             new Estudiante("Maria",7.0),
             new Estudiante("Diego", 3.5),
             new Estudiante("Pedro", 7)
        };
        estList = new ArrayList<>(List.of(estArray));

        // llamadas a los ejemplos
        ejemplo1();
        ejemplo2();
        ejemplo3();
        ejemplo4();
        ejemplo5();
        ejemplo6();
        ejemplo7();
        ejemplo8();
        ejemplo9();
        ejemplo10();
    }

    

    private void print(List<Estudiante> list){
        //for est in list:
        for(Estudiante e : list) {
            System.out.println(e);
        }
    }
    
    /**
     * Lamba extractora directa: nota ascendente
     * Comparador -> por Valor
     */
    public void ejemplo1(){
        // copiar el arreglo global
        System.out.println("EJEMPLO 1");
        List<Estudiante> lista = new ArrayList<>(estList);
        // Compararator -> Obj != (Envolvente de primitivo ni String)
        Comparator<Estudiante> comparador =
        Comparator.comparingDouble(c -> c.getNota());
        lista.sort(comparador);
        // imprimir
        print(lista);
    }
    /**
     * Ordenar por nota Ascendente
     * comparator -> por valor
     * referencia
     */
    public void ejemplo2(){
        System.out.println("EJEMPLO 2");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota);
        lista.sort(comparator);
        print(lista);
    }
    /**
     * Ordenar por nota Descendente
     * comparator -> por valor
     * referencia
     */
    public void ejemplo3() {
        System.out.println("EJEMPLO 3");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota).reversed();
        lista.sort(comparator);
        print(lista);
    }
     /**
     * Ordenar por NOMBRE Descendente
     * comparator -> por valor
     * referencia
     */
    public void ejemplo4() {
        System.out.println("EJEMPLO 4");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparing(Estudiante :: getName);
        lista.sort(comparator);
        print(lista);
    }

    /**
     * Ordenar por nota ascendente
     * comparator -> por dos items
     * referencia
     */
    public void ejemplo5() {
        System.out.println("EJEMPLO 5");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = 
        (e1, e2) -> Double.compare(e1.getNota(), e2.getNota());
        lista.sort(comparator);
        print(lista);
    }
    /**
     * Ordenar por nombre ascendente
     * comparator -> por dos items
     * referencia
     */
    public void ejemplo6() {
        System.out.println("EJEMPLO 6");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = 
        (e1, e2) -> e1.getName().compareTo(e2.getName());
        lista.sort(comparator);
        print(lista);
    }
    /**
     * Ordenar por nota descendente
     * comparator -> por dos items
     * referencia
     */
    public void ejemplo7() {
        System.out.println("EJEMPLO 7");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = 
        (e1, e2) -> Double.compare(e2.getNota(), e1.getNota());
        lista.sort(comparator);
        print(lista);
    }
    /**
     * Ordenar por nota Asendente y Nombre descendente
     * comparator -> por dos items
     * referencia
     */
    public void ejemplo8() {
        System.out.println("EJEMPLO 8");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = 
        (e1, e2) -> {
            int comp = Double.compare(e2.getNota(), e1.getNota());
            if ( comp != 0)
                return comp;
            return e2.getName().compareTo(e1.getName());
        };
        lista.sort(comparator);
        print(lista);
    }
    /**
     * Ordenar por nota Asendente y Nombre asendente
     * comparator -> por valor
     * referencias 2 compararadores
     */
    public void ejemplo9() {
        System.out.println("EJEMPLO 9");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = 
        Comparator.comparingDouble(Estudiante::getNota)
        .thenComparing(Estudiante::getName);
        lista.sort(comparator);
        print(lista);
    }
    /**
     * Ordenar por nota descendente y Nombre asendente
     * comparator -> por valor
     *  1 comparadaor lambda
     *  2 compararador referencia
     */
    public void ejemplo10() {
        System.out.println("EJEMPLO 10");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator
        .<Estudiante>comparingDouble(e -> e.getNota())
        .reversed()
        .thenComparing(Estudiante::getName);
        lista.sort(comparator);
        print(lista);
    }
    //Actividad
    public void ejemplo11() {
        System.out.println("EJEMPLO 11");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator
        .<Estudiante>comparingDouble(e -> e.getNota())
        .thenComparing(Estudiante::getName)
        .reversed();
        lista.sort(comparator);
        print(lista);
    }


}
