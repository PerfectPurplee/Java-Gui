package SWING03;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyPanel extends JPanel {

    Border border = BorderFactory.createLineBorder(Color.white,20,true);
    MyPanel(Color color,int x, int y) {

        this.setBounds(x,y,250,250);
        this.setBackground(color);
        this.setLayout(null);
        this.setBorder(border);



    }
}
