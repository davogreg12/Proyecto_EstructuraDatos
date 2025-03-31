public class MetodoSeleccion {
    public void ordenarAscendente(int[] arreglo) {
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                contComparaciones++;
                System.out.println("Comparación " + contComparaciones + ": " + arreglo[j] + "<--" + arreglo[minIndex]);
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arreglo[minIndex];
                arreglo[minIndex] = arreglo[i];
                arreglo[i] = temp;
                contCambios++;
                System.out.print("Estado actual: ");
                printArray(arreglo);
            }
        }
        System.out.println("Total de comparaciones: " + contComparaciones);
        System.out.println("Total de intercambios: " + contCambios);
    }

    public void ordenarDescendente(int[] arreglo) {
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                contComparaciones++;
                System.out.println("Comparación " + contComparaciones+": "+ arreglo[j] + "-->"+arreglo[maxIndex]);
                if (arreglo[j] > arreglo[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = arreglo[maxIndex];
                arreglo[maxIndex] = arreglo[i];
                arreglo[i] = temp;
                contCambios++;
                System.out.print("Estado actual: ");
                printArray(arreglo);
            }
        }
        System.out.println("Total de comparaciones: " + contComparaciones);
        System.out.println("Total de intercambios: " + contCambios);
    }
    public void printArray(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + ", ");
        }
        System.out.println(); 
    }
}
