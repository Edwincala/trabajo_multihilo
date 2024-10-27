package Main;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Music{
    private static Clip clip;

    public static void playMusic(String location) {
        try {
            File musicPath = new File(location);
            if(musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            } else {
                System.out.println("No se puede encontrar el archivo de audio");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void pauseMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }


    public static void resumeMusic() {
        if (clip != null && !clip.isRunning()) {
            clip.start();
        }
    }

    public static void stopMusic() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }
}



