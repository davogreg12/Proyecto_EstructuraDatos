public class BurbujaMejorado {

    public int[] OrdenarAscendente(int[] arreglo) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                contComparaciones++;
                System.out.println("Comparación " + contComparaciones + ":" + arreglo[j] + "-->" + arreglo[j + 1]);

                if (arreglo[j] > arreglo[j + 1]) {
                    contCambios++;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
                System.out.print("Estado actual: ");
                printArray(arreglo);
            }
        }
        System.out.println("Total de comparaciones: " + contComparaciones);
        System.out.println("Total de intercambios: " + contCambios);
        return arreglo;
    }

    public int[] OrdenarDescendente(int[] arreglo) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                contComparaciones++;
                System.out.println("Comparación " + contComparaciones + ":" + arreglo[j] + "<--" + arreglo[j + 1]);
                if (arreglo[j] < arreglo[j + 1]) {
                    contCambios++;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
                System.out.print("Estado actual: ");
                printArray(arreglo);
            }
        }
        System.out.println("Total de comparaciones: " + contComparaciones);
        System.out.println("Total de intercambios: " + contCambios);
        return arreglo;
    }

    public void printArray(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + ",");
        }
        System.out.println(); // clave para poner en los otros metodos
    }
}

/* 
public class BurbujaMejorado {
    public void ordenarAscendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public void ordenarDescendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] < arreglo[j + 1]) { // Cambiar la condición para ordenar de mayor a menor
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public void printArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
} */
