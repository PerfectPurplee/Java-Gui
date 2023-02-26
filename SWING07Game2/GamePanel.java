package SWING07Game2;

import SWING06GameAttempt.Ball;
import SWING06GameAttempt.Paddle;
import SWING06GameAttempt.Score;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel implements KeyListener, Runnable {

    Paddles paddle1;
    Paddles paddle2;
    Dimension dimension = new Dimension(800, 600);
    Thread gamethread;
    int setpositionY = 0;
    int setdirectionY = 0;


    GamePanel() {

        paddle1 = new Paddles(0,200,50,100,1);
        paddle2 = new Paddles(750,200,50,100,2);
        this.setFocusable(true);
        this.addKeyListener(this);
        this.setPreferredSize(dimension);


        gamethread = new Thread(this);
        gamethread.start();
    }

public void paint(Graphics g) {

        paddle1.draw(g);
        paddle2.draw(g);

}


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
      paddle1.keyPressed(e);
      paddle2.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
      paddle1.keyReleased(e);
      paddle2.keyReleased(e);
    }


    public void move() {
        paddle1.move();
        paddle2.move();
    }

    public void checkCollision() {


    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        while (true) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1) {
                move();
                repaint();
                delta--;
            }
        }
    }
}


