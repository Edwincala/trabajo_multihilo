package Main;

public abstract class ChatbotBase implements ChatInterface{

    @Override
    public String getGreeting() {
        return "Hola, ¿Qué tal?, ¿En qué puedo ayudarte?";
    }

    public String getFarewell() {
        return "Adiós, ¡Fue un placer ayudarte!";
    }

    public abstract void respondToUser(String input);
}
