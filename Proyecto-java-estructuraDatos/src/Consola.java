import java.util.Scanner;   
public class Consola {
    public static void main(String[] args) throws Exception {
        ///
        Scanner scanner = new Scanner(System.in);
        ///
        int[] arreglo = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8};
        int[] listado = arreglo.clone();
        MetodoBurbuja mB = new MetodoBurbuja();
        MetodoInsercion mI = new MetodoInsercion();
        MetodoSeleccion mS = new MetodoSeleccion();
        BurbujaMejorado mBM = new BurbujaMejorado();  
        //
        boolean continuar = true;
        //
        while (continuar){
            System.out.println("Seleccione el metodo de ordenamiento: ");
            System.out.println("Metodo burbuja (1)");
            System.out.println("Metodo seleccion (2)");
            System.out.println("Metodo insercion (3)");
            System.out.println("Burbuja mejorado (4)");
            System.out.println("Salir (5)");
            System.out.println(": ");
            int opcion = scanner.nextInt();
            //
            if (opcion==5) {
                System.out.println("Saliendo del programa...");
                continuar = false;
                break;
            }
            if (opcion<1 || opcion>5) {
                System.out.println("Opcion no valida, por favor seleccione una opcion valida.");
                continue;
            }
            //
            if(opcion==1){
                System.out.println("Metodo burbuja");
                System.out.print("Arreglo original--> ");
                mB.printArray(listado);
                scanner.nextLine();
                System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?: ");
                String orden= scanner.nextLine();
                while(!orden.equalsIgnoreCase("A") && !orden.equalsIgnoreCase("D")){
                    System.out.println("Opcion no valida, por favor seleccione una opcion valida.");
                    orden = scanner.nextLine();
                }
                if(orden.equalsIgnoreCase("A")){
                    mB.ordenarAscendente(arreglo);
                    System.out.print("Arreglo ordenado-->");
                    mB.printArray(arreglo); 
                    System.out.println("--FIN DEL METODO--");
                }
                else if(orden.equalsIgnoreCase("D")){
                    mB.ordenarDescendente(arreglo);
                    System.out.print("Arreglo ordenado-->");
                    mB.printArray(arreglo);
                    System.out.println("--FIN DEL METODO--");
                }
            }
            if(opcion==2){
                System.out.println("Metodo seleccion");
                System.out.print("Arreglo original--> ");
                mS.printArray(listado);
                scanner.nextLine();
                System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?: ");
                String orden= scanner.nextLine();
                while(!orden.equalsIgnoreCase("A") && !orden.equalsIgnoreCase("D")){
                    System.out.println("Opcion no valida, por favor seleccione una opcion valida.");
                    orden = scanner.nextLine();
                }
                if(orden.equalsIgnoreCase("A")){
                    mS.ordenarAscendente(arreglo);
                    System.out.print("Arreglo ordenado-->");
                    mS.printArray(arreglo);
                    System.out.println("--FIN DEL METODO--");
                }
                else if(orden.equalsIgnoreCase("D")){
                    mS.ordenarDescendente(arreglo);
                    System.out.print("Arreglo ordenado-->");
                    mS.printArray(arreglo);
                    System.out.println("--FIN DEL METODO--");
                }
            }
            if(opcion==3){
                System.out.println("Metodo insercion");
                mI.printArray(listado);
                scanner.nextLine();
                System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?: ");
                String orden= scanner.nextLine();
                while(!orden.equalsIgnoreCase("A") && !orden.equalsIgnoreCase("D")){
                    System.out.println("Opcion no valida, por favor seleccione una opcion valida.");
                    orden = scanner.nextLine();
                }
                if(orden.equalsIgnoreCase("A")){
                    mI.ordenarAscendente(arreglo);
                    System.out.print("Arreglo ordenado --> ");
                    mI.printArray(arreglo);
                    System.out.println("--FIN DEL METODO--");
                }
                else if(orden.equalsIgnoreCase("D")){
                    mI.ordenarDescendente(arreglo);
                    System.out.print("Arreglo ordenado -->");
                    mI.printArray(arreglo);
                    System.out.println("--FIN DEL METODO--");
                }
            }
            if(opcion==4){
                System.out.println("Metodo burbuja mejorado");
                mBM.printArray(listado);
                scanner.nextLine();
                System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?: ");
                String orden= scanner.nextLine();
                while(!orden.equalsIgnoreCase("A") && !orden.equalsIgnoreCase("D")){
                    System.out.println("Opcion no valida, por favor seleccione una opcion valida.");
                    orden = scanner.nextLine();
                }
                if(orden.equalsIgnoreCase("A")){
                    mBM.OrdenarAscendente(arreglo);
                    System.out.print("Arreglo ordenado --> ");
                    mBM.printArray(arreglo);
                    System.out.println("--FIN DEL METODO--");
                }
                else if(orden.equalsIgnoreCase("D")){
                    mBM.OrdenarDescendente(arreglo);
                    System.out.print("Arreglo ordenado -->");
                    mBM.printArray(arreglo);
                    System.out.println("--FIN DEL METODO--");
                }
            }
            
        }
        
    }
}
