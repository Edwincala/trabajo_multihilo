package Main;

import java.util.Scanner;

public class ChatbotApp implements Runnable{
    private final Chatbot chatbot = new Chatbot();

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(chatbot.getGreeting());
        boolean exit = false;
        while(!exit) {
            System.out.println("\nEscribe tu mensaje: ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("salir")) {
                exit = true;
                System.out.println(chatbot.getFarewell());
            } else {
                chatbot.respondToUser(input);
            }
        }
        scanner.close();
    }
}
