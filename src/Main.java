import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*
            Aplicación de consola
            Interfaz gráfica
            Reproducir canción
            Implementando diagrama UML,
            Threads y Runnable,
            POO,
            JOptionPane
        * */

        if (GraphicsEnvironment.isHeadless()){
            System.out.println("Entorno headless detectado. La GUI no será ejecutada.");
            return;
        }

        SwingUtilities.invokeLater(new Frame());
        Thread consoleThread = new Thread(new ChatbotApp());
        consoleThread.start();
    }
}