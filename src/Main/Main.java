package Main;


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
        new Frame();
        String location = "C:\\Users\\edwin\\OneDrive\\Documentos\\FULL_2024\\2024-2\\maestria\\programacion_avanzada\\trabajo1\\TrabajoAppMultihilo\\src\\HAS-SIDO-HACKEADO.wav";
        Thread musicThread = new Thread(new Music(location));
        musicThread.start();
    }
}