package Main;

public class Chatbot extends ChatbotBase{

    @Override
    public void respondToUser(String input) {
        switch (input.toLowerCase()) {
            case "reproducir música":
                System.out.println("Reproduciendo música...");
                new Thread(() -> Music.playMusic("C:\\Users\\edwin\\OneDrive\\Documentos\\FULL_2024\\2024-2\\maestria\\programacion_avanzada\\trabajo1\\TrabajoAppMultihilo\\src\\HAS-SIDO-HACKEADO.wav")).start();
                break;
            case "pausar música":
                System.out.println("Pausando música...");
                new Thread(Music::pauseMusic).start();
                break;
            case "reanudar música":
                System.out.println("Reanudar música");
                new Thread(Music::resumeMusic).start();
                break;
            case "detener música":
                System.out.println("Deteniendo música");
                new Thread(Music::stopMusic).start();
                break;
            default:
                System.out.println("Lo siento, no entiendo lo que me pides");
                break;
        }
    }
}
