package PruebasIndividuales;

public class trycatchfinallyExample {
    public int r;

    public void moddiv (int n, Integer d) {

        try {
            System.out.println(":. Try Block .:");
            r = n%d;

        } catch (ArithmeticException e) {
            System.out.println("\n:. Catch Block Arith E .:");
            r = 0;
            System.out.println("La excepción lanzada es tipo: "+e);

        } catch (NullPointerException e) {
            System.out.println("\n:. Catch Block Null E .:");
            r = 1;
            System.out.println("La excepción lanzada es tipo: "+e);

        } finally {
            System.out.println("\n:. Finally Block .:");

            System.out.println("El resultado es: " + r);

            System.out.println("\n:. Fin .:");
        }
    }

    public static void main(String[] args) {
        trycatchfinallyExample tcfe = new trycatchfinallyExample();
        tcfe.moddiv(10, 0);
        //tcfe.moddiv(10, null);
    }

}
