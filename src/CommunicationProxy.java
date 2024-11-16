import java.io.*;
import java.net.*;

public class CommunicationProxy implements CommunicationInterface{
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public CommunicationProxy(String host, int port) throws IOException {
        this.socket = new Socket(host, port);
        this.out = new PrintWriter(socket.getOutputStream(), true);
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public CommunicationProxy(ServerSocket serverSocket) throws IOException {
        this.socket = serverSocket.accept();
        this.out = new PrintWriter(socket.getOutputStream(), true);
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    @Override
    public void sendMessage(String message) throws IOException {
        out.println(message);
    }

    @Override
    public String receiveMessage() throws IOException {
        return in.readLine();
    }

    public void close() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}
