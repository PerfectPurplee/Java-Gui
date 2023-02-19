package SWING02;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("gieniu.png");

        Border border = BorderFactory.createLineBorder(Color.pink, 15,true);

        JLabel label = new JLabel();
        label.setText("Simon, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setBorder(border);
        label.setFont(new Font("Times New Roman",Font.PLAIN, 20));

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.PINK);
        window.setResizable(false);
        window.setVisible(true);
        window.add(label);
        window.pack();





    }


}
