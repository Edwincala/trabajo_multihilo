import java.io.IOException;
import java.net.ServerSocket;

public class ServerThread extends Thread{
    private CommunicationProxy proxy;

    public ServerThread(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            this.proxy = new CommunicationProxy(serverSocket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("Servidor esperando mensajes...");
            while(true){
                String message = proxy.receiveMessage();;
                if (message != null){
                    System.out.println("Servidor recibió: " + message);
                    proxy.sendMessage("Servidor responde: Mensaje recibido");
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        } finally {
            try{
                proxy.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
