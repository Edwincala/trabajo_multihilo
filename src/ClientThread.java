import java.io.IOException;

public class ClientThread extends Thread {
    private CommunicationProxy proxy;
    private String message;

    public ClientThread(String host, int port, String message){
        this.message = message;
        try{
            this.proxy = new CommunicationProxy(host, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("Cliente enviando mensaje: " + message);
            proxy.sendMessage(message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                proxy.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
