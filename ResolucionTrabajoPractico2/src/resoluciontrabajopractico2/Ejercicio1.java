
package resoluciontrabajopractico2;

import java.util.Scanner;


public class Ejercicio1 {

    static void ejecutar()  {
        try ( // Objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un año: ");
            int anio = scanner.nextInt();
            
            boolean esBisiesto;
            
            // Estructura condicional (IF/ELSE) con operadores lógicos
            // La condición aplica la regla: (Divisible por 4 Y NO por 100) O (Divisible por 400)
            esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
            
            if (esBisiesto) {
                System.out.println("El año " + anio + " es bisiesto."); // Ejemplo: 2024 [cite: 30]
            } else {
                System.out.println("El año " + anio + " no es bisiesto."); // Ejemplo: 1900 [cite: 32]
            }
        }
    }

}

