public class MetodoInsercion {
    public void ordenarAscendente(int[] arreglo) {
        int contComparaciones=0;
        int contCambios=0;
        for (int i = 1; i<arreglo.length; i++) {
            int actual = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > actual) {
                contComparaciones++;
                System.out.println("Comparación " + contComparaciones + ":" + arreglo[j] + "-->" + actual);
                arreglo[j+1] = arreglo[j];
                j--;
                contCambios++;
                System.out.print("estado actual: "); //aqui imprimo el listado como está actualmente
                printArray(arreglo);
            }
            arreglo[j+1] = actual;
        }
        System.out.println("Total de comparaciones: " + contComparaciones);
        System.out.println("Total de intercambios: " + contCambios);  //clave pa mostrar comparaciones y cambios
    }

    public void ordenarDescendente(int[] arreglo) {
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 1; i < arreglo.length; i++) {
            int actual = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] < actual) {
                contComparaciones++;
                System.out.println("Comparación " + contComparaciones + ": " + arreglo[j] + "<--" + actual);

                arreglo[j + 1] = arreglo[j];
                j--;
                contCambios++;
                System.out.print("Estado actual: ");
                printArray(arreglo);
            }
            arreglo[j + 1] = actual;
        }
        System.out.println("Total de comparaciones: " + contComparaciones);
        System.out.println("Total de intercambios: " + contCambios);
    }

    public void printArray(int[] arreglo) {  //con esta parte se imprime la lista
        for (int elemento : arreglo) {
            System.out.print(elemento + ", ");
        }
        System.out.println();
    }
}