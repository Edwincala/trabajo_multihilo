package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {

    private final int panelWidth = 1600;
    private final int panelHeight = 800;

    String absolutePath = System.getProperty("user.dir");
    Image trollImg;
    Image backgroundImg;
    Timer timer;

    int xVelocity = 2;
    int yVelocity = 1;

    int x = 0;
    int y = 0;

    Panel() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.BLACK);
        trollImg = new ImageIcon(absolutePath + "\\src\\troll_face.png").getImage();
        backgroundImg = new ImageIcon(absolutePath + "\\src\\background.jpg").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        int width = this.getWidth();
        int height = this.getHeight();

        graphics2D.drawImage(backgroundImg, 0, 0, width, height, null);
        graphics2D.drawImage(trollImg, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= panelWidth - trollImg.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        if(y >= panelHeight - trollImg.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        x = x + xVelocity;
        y = y + yVelocity;
        repaint();
    }
}
