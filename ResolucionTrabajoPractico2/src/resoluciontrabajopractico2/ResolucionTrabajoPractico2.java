
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
            System.out.println("3. Ejecutar Punto 3");
            System.out.println("4. Ejecutar Punto 4");
            System.out.println("5. Ejecutar Punto 5");
            System.out.println("6. Ejecutar Punto 6");
            System.out.println("7. Ejecutar Punto 7");
            System.out.println("8. Ejecutar Punto 8");
            System.out.println("9. Ejecutar Punto 9");
            System.out.println("10. Ejecutar Punto 10");
            System.out.println("11. Ejecutar Punto 11");
            System.out.println("12. Ejecutar Punto 12");
            System.out.println("13. Ejecutar Punto 13");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> Ejercicio1.ejecutar();
                case 2 -> Ejercicio2.ejecutar();
                case 3 -> Ejercicio3.ejecutar();
                case 4 -> Ejercicio4.ejecutar();
                case 5 -> Ejercicio5.ejecutar();
                case 6 -> Ejercicio6.ejecutar();
                case 7 -> Ejercicio7.ejecutar();
                case 8 -> Ejercicio8.ejecutar();
                case 9 -> Ejercicio9.ejecutar();
                case 10 -> Ejercicio10.ejecutar();
                case 11-> Ejercicio11.ejecutar();
                case 12-> Ejercicio12.ejecutar();
                case 13-> Ejercicio13.ejecutar();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
        
        
    
