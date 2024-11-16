public class ClientApp {
    public static void main(String[] args) {
        String host = "localhost"; // Cambia esto si el servidor está en otra máquina
        int port = 12345;
        String message = "Hola desde el cliente";

        ClientThread clientThread = new ClientThread(host, port, message);
        clientThread.start();

        System.out.println("Cliente conectado al servidor en " + host + ":" + port + "...");
    }
}
