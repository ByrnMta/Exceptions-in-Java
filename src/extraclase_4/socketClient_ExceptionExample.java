package extraclase_4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class socketClient_ExceptionExample {

    public static void main(String[] args) {

        try
        {
            Socket clientSocket = new Socket("LocalHost", 9999);
            Scanner scanner = new Scanner(System.in);
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            while(true)
            {
                //Envios
                System.out.println("Add msg: ");
                String msgC = scanner.nextLine();
                out.writeUTF(msgC);
                if (msgC.equals("EXIT"))
                {
                    System.out.println("Conexión realizada");
                    in.close();
                    out.close();
                    scanner.close();
                    clientSocket.close();
                    System.exit(0);
                }

                //Respuestas
                String msgS = in.readUTF();
                System.out.println("Client >>: "+msgS);
                if (msgS.equals("EXIT")) {
                    System.out.println("Desconexión realizada");
                    in.close();
                    out.close();
                    scanner.close();
                    clientSocket.close();
                    System.exit(0);
                }
            }

        } catch (UnknownHostException eo) {
            //eo.printStackTrace(); // Para ver la ruta que el error persigue en el código quite el "//" al inicio de "eo.printStackTrace();"
            System.out.println(eo);
        } catch (IOException es) {
            //es.printStackTrace(); // Para ver la ruta que el error persigue en el código quite el "//" al inicio de "es.printStackTrace();"
            System.out.println("\n>> System: Error de tipo "+"'"+es+"'"+ " capturado: ");
        } finally {
            System.out.println("\n>> System: Recuerde que para establecer conexión debe el servidor iniciar primero...");
        }

    }
}
