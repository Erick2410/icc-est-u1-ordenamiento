public class InsertionSort {
    
    public void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
    }

    public void sort1(int[] nums) {
    int cambios = 0;
    int comparaciones = 0;

    for (int i = 1; i < nums.length; i++) {
        int key = nums[i];
        int j = i - 1;
        boolean huboCambio = false;
        int valorDesplazado = -1;
        System.out.print("Pasada= " + (i - 1) + " | ");
        comparaciones++; 
        while (j >= 0 && nums[j] < key) {
            valorDesplazado = nums[j];
            nums[j + 1] = nums[j];
            j = j - 1;
            
            cambios++;
            huboCambio = true;
            comparaciones++; 
        }
        nums[j + 1] = key;
        if (huboCambio) {
            System.out.println("cambio " + valorDesplazado + "<->" + key);
        } else {
            System.out.println("sin cambios");
            
        }
    }
    System.out.println("Cambios: " + cambios);
    System.out.println("Comparaciones: " + comparaciones);
}

}
