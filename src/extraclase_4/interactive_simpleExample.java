package extraclase_4;

import java.util.Scanner;

public class interactive_simpleExample {

    // Ejemplo interactivo de Try-Catch y Finally desde la terminal
    // Para observar la excepción lanzada se debe de ejecutar este método main y seguir las indicaciones
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a este test, para que la excepción sea lanzada ingrese cualquier tipo de dato diferente de entero...\n");
        System.out.println("Ingrese un dato tipo entero: ");

        // Bloque de try
        try {
            int integer = scanner.nextInt();
            System.out.println("El dato ingresado fue: "+integer);

        // Bloque de catch: se realiza la captura de la excepción
        } catch (Exception e) {
            System.out.println("La excepción lanzada fue tipo: "+ e );

        // Bloque de finally para "limpiar el código" e indicar el final del run
        } finally {
            System.out.println("Test finalizado");
        }
    }
}
