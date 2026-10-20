public class Selection {

    public void sort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++){
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++){
                if (arreglo[j] < arreglo[min]){
                    min = j;
                }
            if (min != i){
                int temp = arreglo[min];
                arreglo[min] = arreglo[i];
                arreglo[i] = temp;
                }
            }
        }
    }
}