package SWING06GameAttempt;

import javax.swing.*;

public class MyFrame extends JFrame {

    GamePanel panel;
    MyFrame() {

        panel = new GamePanel();
        this.add(panel);
        this.pack();
        this.setTitle("Simon Pong Game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
    public static void main(String[] args) {

        new MyFrame();

    }
}
