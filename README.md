# Proyecto Multihilo con Chatbot, Reproducción de Archivos de Audio y GUI
La aplicación realizada fue codificada usando el lenguaje de programación Java, en la cual se implementaron bastantes aspectos propios de la programación orientada a objetos. El principal objetivo era el uso de Runnable y Threads para que de esta manera la aplicación tuviese 3 procesos simultáneos (multihilo):

- Una interfaz gráfica.
- La reproducción de un archivo de audio.
- Una aplicación de consola: Se implementó un chatbot con funcionalidades sencillas que permiten el control de la reproducción de un archivo de audio.

## Diagrama UML:

El diagrama UML de clases bajo el cual se desarrolló la aplicación se presenta a continuación:

```mermaid
ClassDiagram
    Main --> Chatbot : usa
    Main --> Frame : usa
    ChatbotApp --> Chatbot : usa
    Chatbot --> Music : usa
    
    class Main {
        +main()
    }
    
    class ChatbotApp {
        +run()
    }
    
    class Frame {
        +run()
        +panel : Panel
    }
    
    class Panel {
        +paint(graphics : Graphics)
        +actionPerformed(e : ActionEvent)
    }
    
    class ChatInteface {
        <<interface>>
        +respondToUser(input : String)
        +getGreeting()
        +getFarewell()
    }
    
    class ChatbotBase {
        +getGreeting()
        ´getFarewell()
    }
    
    class Chatbot {
        +respondToUser(input : String)
    }
    
    class Music {
        +playMusic(filename : String)
        +pauseMusic()
        +resumeMusic()
        +stopMusic()
    }
    
    ChatInterface <|-- ChatbotBase
    ChatbotBase <|-- Chatbot
    ChatbotApp --> Chatbot
    Chatbot : implements ChatInterface
    ChatbotApp : implements Runnable
    Frame : implements Runnable
    Frame o-- Panel
```