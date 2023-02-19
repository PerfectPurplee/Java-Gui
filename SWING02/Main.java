package SWING02;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        MyLabel label = new MyLabel();
        MyFrame window = new MyFrame();

        window.add(label);
        window.pack();


    }


}
