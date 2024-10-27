package Main;

import javax.swing.*;

public class Frame extends JFrame implements Runnable {
    Panel panel;

    public Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Aplicación Multihilo GUI");
    }

    public void run() {
        panel = new Panel();
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
