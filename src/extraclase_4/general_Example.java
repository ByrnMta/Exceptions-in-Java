package extraclase_4;

import java.io.IOException;

public class general_Example {

    //Realiza una división iterativa hasta que el denominador llegue a ser 0 momento en el que se lanza la excepción
    public void generalExmp(int numerador) throws ArithmeticException, IOException {

        for (int denominador = 5; denominador >= 0; denominador--) { //loop de la división

            if (denominador == 0) { //condicional que detecta que el denominador es 0 y lanza la excepción
                throw new ArithmeticException();

            } else { //operación y print del resultado
                int result = numerador/denominador;
                System.out.println("El resultado de " + numerador + "/" + denominador + " es: " + result);
            }

        }

    }

    //Método principal para realizar la ejecución
    public static void main(String[] args) {
        general_Example GE = new general_Example();

        //Bloque de Try
        try {
            GE.generalExmp(10);

        //Bloque de Catch
        } catch (ArithmeticException | IOException e) {
            System.out.println("\nLa excepción lanzada es tipo: "+e);

        //Bloque Finally
        } finally {
            System.out.println("\nProceso terminado. Fin de la ejecución...");
        }
    }

}
