package SWING08GAMEMENU;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel implements ActionListener {

    JButton newgame;
    JButton options;
    JButton credits;
    JButton returnB;
    //    Gamepanel2 gamepanel2 = new Gamepanel2();
    Dimension d = new Dimension(800, 600);

    MenuPanel() {
        newgame = new JButton("new game");
        newgame.addActionListener(this);
        newgame.setBounds(50, 150, 200, 100);
        options = new JButton("options");
        options.setBounds(300, 150, 200, 100);
        credits = new JButton("credits");
        credits.setBounds(550, 150, 200, 100);
//        credits.setBackground(Color.black);
        returnB = new JButton("Return");
        returnB.setBounds(550,450,200,100);
        returnB.addActionListener(this);
        returnB.setVisible(false);

        this.setBackground(Color.black);
        this.setPreferredSize(d);
        this.setFocusable(true);
        this.setLayout(null);


        this.add(options);
        this.add(newgame);
        this.add(credits);
        this.add(returnB);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newgame) {
            newgame.setVisible(false);
            options.setVisible(false);
            credits.setVisible(false);
            returnB.setVisible(true);
        }
        if(e.getSource() == returnB) {
            newgame.setVisible(true);
            options.setVisible(true);
            credits.setVisible(true);
            returnB.setVisible(false);
        }
    }
}
