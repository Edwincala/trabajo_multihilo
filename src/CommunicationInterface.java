import java.io.IOException;

public interface CommunicationInterface {
    void sendMessage(String message) throws IOException;
    String receiveMessage() throws IOException;
}
