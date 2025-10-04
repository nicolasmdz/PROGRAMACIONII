
package resoluciontrabajopractico2;

import java.util.Scanner;

public class ResolucionTrabajoPractico2 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        int opcion;

        do {
            System.out.println("\n=== MENÚ TRABAJO PRÁCTICO 2 ===");
            System.out.println("1. Ejecutar Punto 1");
            System.out.println("2. Ejecutar Punto 2");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> Ejercicio1.ejecutar();
                case 2 -> Ejercicio2.ejecutar();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
        
        
    
