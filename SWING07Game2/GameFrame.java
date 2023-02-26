package SWING07Game2;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GamePanel panel;
    GameFrame() {

        panel = new GamePanel();
        this.add(panel);
        this.setResizable(false);
        this.setTitle("Simon Pong");
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {


        GameFrame MyFrame = new GameFrame();



    }
}
