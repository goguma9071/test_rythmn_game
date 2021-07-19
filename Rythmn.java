package javaprj;

import javax.swing.*;
import java.awt.*;

public class Rythmn extends JFrame {
    private Image screenImage;
    private Graphics screenGraphics;

    private Image menuBGBlue;

    public Rythmn() {
        setTitle("Rythmn");
        setSize(javaprogram.SCREEN_WIDTH, javaprogram.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        menuBGBlue = new ImageIcon(javaprogram.class.getResource("../images/menuBGBlue.png")).getImage();
    }
    public void paint(Graphics g) {
        screenImage = createImage(javaprogram.SCREEN_WIDTH, javaprogram.SCREEN_HEIGHT);
        screenGraphics = screenImage.getGraphics();
        screenDraw(screenGraphics);
        g.drawImage(screenImage, 0, 0, null);
    }
    public void screenDraw(Graphics g) {
        g.drawImage(menuBGBlue, 0, 0, null);
        this.repaint();
    }
}
