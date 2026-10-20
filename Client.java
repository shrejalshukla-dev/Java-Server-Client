
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader in = new BufferedReader(
                 new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(
                 socket.getOutputStream(), true);
             BufferedReader keyboard = new BufferedReader(
                 new InputStreamReader(System.in))) {

            System.out.print("Enter message: ");
            String message = keyboard.readLine();
            out.println(message);

            System.out.println("Server says: " + in.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

