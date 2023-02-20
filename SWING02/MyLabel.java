package SWING02;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JLabel {

    ImageIcon image = new ImageIcon("pengu.png");
    Border border = BorderFactory.createLineBorder(Color.pink, 15,true);
    MyLabel() {
        this.setText("Simon, do you even code?");
        this.setIcon(image);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setBorder(border);
        this.setFont(new Font("Times New Roman",Font.PLAIN, 20));
    }
}
