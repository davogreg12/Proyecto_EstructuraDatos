public class MetodoBurbuja {
    public void ordenarAscendente(int[] arreglo) {   // Para ordenar de forma ascendente
        int contComparaciones=0;
        int contCambios=0;
        for (int i=0; i<arreglo.length - 1; i++) {
            for (int j=0; j<arreglo.length-1-i; j++) {
                contComparaciones++;
                System.out.println("Comparación "+contComparaciones+": "+arreglo[j]+"-->"+arreglo[j+1]);
                if (arreglo[j] > arreglo[j + 1]) {
                    contCambios++;
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
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
        for (int i=0; i<arreglo.length-1; i++) {
            for (int j=0; j<arreglo.length-1-i; j++) {
                contComparaciones++;
                System.out.println("Comparación "+contComparaciones+": "+arreglo[j] + "<--"+arreglo[j+1]);
                if (arreglo[j]<arreglo[j+1]) {
                    contCambios++;
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
                System.out.print("Estado actual: ");
                printArray(arreglo);
            }
        }
        System.out.println("Total de comparaciones: " + contComparaciones);
        System.out.println("Total de intercambios: " + contCambios);
    }

    public void ordenar(int[] arreglo, boolean isDes) {  
        if (isDes) {
            ordenarDescendente(arreglo);
        } else {
            ordenarAscendente(arreglo);
        }
    }
    public void printArray(int[] arreglo) {  
        for (int i = 0; i < arreglo.length; i++) {
            if (i == arreglo.length - 1) {
                System.out.println(arreglo[i]);
            } else {
                System.out.print(arreglo[i] + ",");
            }
        }
    }
}