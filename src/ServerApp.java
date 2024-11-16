public class ServerApp {
    public static void main(String[] args) {
        int port = 12345;
        ServerThread serverThread = new ServerThread(port);
        serverThread.start();

        System.out.println("Servidor iniciado y escuchando en el puerto " + port + "...");
    }
}
