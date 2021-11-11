package PruebasIndividuales;

public class throwExample {

    public static void verify (int year) {
        if (year < 2000) {
            throw new ArithmeticException("El año dado no se encuentra dentro de los límites establecidos");

        } else {
            System.out.println("El año dado se encuentra dentro de los límites establecidos");
        }
    }

    public static void main(String[] args) {
        verify(1998);
    }

}
