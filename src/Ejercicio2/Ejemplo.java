package Ejercicio2;

public class Ejemplo {

    public static void main(String[] args) {
        int[] arregloOrdenado = {1, 2, 3, 4, 5, 6};
        quicksort(arregloOrdenado, 0, arregloOrdenado.length - 1);

        for (int num : arregloOrdenado) {
            System.out.print(num + " ");
        }
    }

    public static void quicksort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pivoteIndex = particionar(arr, inicio, fin);
            quicksort(arr, inicio, pivoteIndex - 1);
            quicksort(arr, pivoteIndex + 1, fin);
        }
    }

    public static int particionar(int[] arr, int inicio, int fin) {
        int pivote = arr[inicio];
        int i = inicio + 1;

        for (int j = inicio + 1; j <= fin; j++) {
            if (arr[j] < pivote) {
                intercambiar(arr, i, j);
                i++;
            }
        }

        intercambiar(arr, inicio, i - 1);
        return i - 1;
    }

    public static void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

