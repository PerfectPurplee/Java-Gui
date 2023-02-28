package SWING08GAMEMENU;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame   {

    MenuPanel panel = new MenuPanel();
    JButton returnButton;

    GameFrame() {

        this.add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }


    public static void main(String[] args) {


        GameFrame frame = new GameFrame();


    }

}
