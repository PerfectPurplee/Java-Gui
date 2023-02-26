package SWING07Game2;

import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {

    Random random;
    int directionX;
    int directionY;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 10;

    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();



    }
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(x,y,width,height);
    }

    public void setXdirection() {
        xVelocity += directionX + initialSpeed;
    }

    public void setYdirection() {
        yVelocity += directionY + initialSpeed;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }
}