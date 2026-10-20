
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            try (Socket socket = server.accept();
                 BufferedReader in = new BufferedReader(
                     new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(
                     socket.getOutputStream(), true)) {

                System.out.println("Client connected!");
                String message = in.readLine();
                System.out.println("Client says: " + message);

                out.println("Hello Client! Message received.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
