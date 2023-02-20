package SWING03;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        MyLabel label = new MyLabel();
        label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(0,0,75,75);

        MyPanel redPanel = new MyPanel(Color.red,0,0);
        MyPanel greenPanel = new MyPanel(Color.green,250,0);
        MyPanel bluePanel = new MyPanel(Color.blue,500,0);

        MyFrame frame = new MyFrame();
        redPanel.add(label);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);






    }
}
