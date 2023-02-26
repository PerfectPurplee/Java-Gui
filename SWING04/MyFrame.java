package SWING04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    Dimension dimension = new Dimension(500,500);
    ImageIcon icon = new ImageIcon("Images/pengu.png");
    JButton button;
    JLabel label;

    MyFrame() {

        label = new JLabel();
        label.setIcon(icon);
        label.setBorder(BorderFactory.createBevelBorder(2));
        label.setVisible(false);
        label.setBounds(0,0,64,64);

        button = new JButton();
        button.setBounds(150,150,200,50);
        button.setVisible(true);
        button.addActionListener(this);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.CENTER);
        button.setText("Jestem przyciskiem!");

        this.setSize(dimension);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(button);
        this.setLayout(null);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("im button!");
            label.setVisible(true);

        }
    }
}
