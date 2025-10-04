
package resoluciontrabajopractico2;

import java.util.Scanner;


public class Ejercicio2 {
    
    public static void ejecutar() {
        
        // 1. Solicitar los tres números
        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Solicitar los tres números
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt(); // Ejemplo: 8
            
            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt(); // Ejemplo: 12
            
            System.out.print("Ingrese el tercer número: ");
            int num3 = scanner.nextInt(); // Ejemplo: 5
            
            int mayor;
            
            // 2. Determinar el mayor usando if-else if-else
            if (num1 >= num2 && num1 >= num3) {
                // num1 es mayor o igual que los otros dos
                mayor = num1;
            } else if (num2 >= num3) {
                // Si no entró en el primer if, y num2 es mayor o igual que num3,
                // entonces num2 es el mayor de los tres
                mayor = num2;
            } else {
                // Si no se cumplió ninguna de las condiciones anteriores, num3 es el mayor
                mayor = num3;
            }
            
            // 3. Mostrar el resultado
            System.out.println("El mayor es: " + mayor); // Salida esperada: 12
        }
    }

 
}

    
    

