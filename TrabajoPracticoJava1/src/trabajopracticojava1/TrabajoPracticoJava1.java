package trabajopracticojava1;
import java.util.Locale;
import java.util.Scanner;

public class TrabajoPracticoJava1 {

    public static void main(String[] args) {
        
        // --- Ejercicio 2: Programa básico "Hola, Java!" ---
        System.out.println("\n--- Ejercicio 2 ---");
        System.out.println("¡Hola, Java!");
        System.out.println("¡Hola, soy un programa Java con múltiples ejercicios!");
        
        // --- Ejercicio 3 y 6: Declarar y mostrar variables ---
        System.out.println("\n--- Ejercicios 3 y 6 ---");
        String nombre = "Juan Perez";
        int edad = 30;
        double altura = 1.75;
        boolean estudiante = true;
        String direccion = "Calle Falsa 123";
        
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi edad es: " + edad);
        System.out.println("Mi altura es: " + altura);
        System.out.println("Soy estudiante: " + estudiante);
        System.out.println("Mi Direccciòn es: " + direccion);
        
        // --- Ejercicio 4: Leer datos con Scanner ---
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\n--- Ejercicio 4 ---");
        System.out.print("Ingresá tu nombre: ");
        String nombreUsuario = sc.nextLine();
        
        System.out.print("Ingresá tu edad: ");
        int edadUsuario = sc.nextInt();
        
        // Limpiamos el buffer del Scanner, para que la proxima lectura de texto funcione bien
        sc.nextLine();
        
        System.out.println("Hola, " + nombreUsuario + ". Tenés " + edadUsuario + " años.");
        
        // --- Ejercicios 5 y 8: Operaciones aritméticas y división con double ---
        System.out.println("\n--- Ejercicios 5 y 8 ---");
        System.out.print("Ingresá un número entero: ");
        int numero1 = sc.nextInt();
        
        System.out.print("Ingresá otro número entero: ");
        int numero2 = sc.nextInt();
        
        sc.nextLine(); //limpiamos el buffer para la siguiente lextura. 
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / numero2; 
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        
        // --- Ejercicio 7 
        System.out.println("\n--- Ejercicio 7 ---");
        System.out.println("""
                           Una exprecion es un fragmento de codigo que produce un valor.
                           En este ejercicio el fragmento (x + 5) es una expresi\u00f2n.
                           Y una instrucci\u00f2n es una orden completa que realiza una                                   acci\u00f2n y finaliza con un punto y coma.""");
        
        // ---- Ejercicio 9
        System.out.println("\n--- Ejercicio 9 ---");
        
       /* import java.util.Scanner;

       //public class ErrorEjemplo {

        // public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        */
        System.out.println("Ingresa tu nombre: ");
        String nombre1 = sc.nextLine(); // CORRECCIÖN
        //String nombre = scanner.nextInt(); // ERROR
        

        System.out.println("Hola, " + nombre1);
        
       /* El error que tenia el codigo es que La variable nombre fue declarada como String (una cadena de texto).
Sin embargo, se le está intentando asignar el valor que produce el método scanner.nextInt(), el cual está diseñado 
para leer y devolver un valor de tipo int (número entero).Java es estricto con los tipos de datos. No te permite 
guardar un número entero en una "caja" de texto, porque no son compatibles.
        
    }
}    
       */   
       
        sc.close();
    }    
}
    

