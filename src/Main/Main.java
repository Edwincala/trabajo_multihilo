package Main;


import javax.swing.*;

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
        SwingUtilities.invokeLater(new Frame());
        Thread consoleThread = new Thread(new ChatbotApp());
        consoleThread.start();
    }
}