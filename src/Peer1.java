import java.io.*;
import java.net.*;

public class Peer1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Peer1 listening on port 5000...");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = in.readLine();
            if (message.equalsIgnoreCase("exit")) {
                System.out.println("Connection closed by client.");
                clientSocket.close();
                break;
            }
            System.out.println("Received: " + message);
            clientSocket.close();
        }

        serverSocket.close();
    }
}

 
