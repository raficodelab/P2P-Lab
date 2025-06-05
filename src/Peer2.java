import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Peer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;

        try {
            while (true) {
                Socket socket = new Socket("localhost", 5000);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                System.out.print("Enter message (type 'exit' to quit): ");
                message = scanner.nextLine();
                out.println(message);

                socket.close();

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
