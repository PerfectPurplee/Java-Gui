package SWING07Game2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel implements KeyListener, Runnable {

    Ball ball;
    Paddles paddle1;
    Paddles paddle2;
    Dimension dimension = new Dimension(800, 600);
    Thread gamethread;
    int setpositionY = 0;
    int setdirectionY = 0;
    Random random;


    GamePanel() {

        random = new Random();
        paddle1 = new Paddles(0,200,50,100,1);
        paddle2 = new Paddles(750,200,50,100,2);
        ball = new Ball(400 - 20,random.nextInt(600 - 20),20,20);
        this.setFocusable(true);
        this.addKeyListener(this);
        this.setPreferredSize(dimension);


        gamethread = new Thread(this);
        gamethread.start();
    }

public void paint(Graphics g) {

        paddle1.paint(g);
        paddle2.paint(g);
        ball.paint(g);


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
        ball.move();
        paddle1.movePad1();
        paddle2.movePad2();
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


