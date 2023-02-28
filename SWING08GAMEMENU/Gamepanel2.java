package SWING08GAMEMENU;

import javax.swing.*;
import java.awt.*;

public class Gamepanel2 extends JPanel {
    Dimension d = new Dimension(800,600);
    JLabel label;
    Gamepanel2() {

        label = new JLabel("I am a Game");
        label.setVerticalAlignment(JLabel.CENTER);
        this.add(label);
        this.setPreferredSize(d);
        this.setVisible(true);
        this.setBackground(Color.pink);
    }
}
