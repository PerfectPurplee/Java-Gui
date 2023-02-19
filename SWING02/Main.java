package SWING02;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("logo.png");
        JFrame window = new JFrame();
        JLabel label = new JLabel();

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.getContentPane().setBackground(Color.PINK);
        window.setResizable(false);

        label.setText("Simon, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setSize(window.getSize());

        window.add(label);





    }


}
