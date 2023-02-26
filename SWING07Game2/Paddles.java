package SWING07Game2;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Paddles extends Rectangle implements KeyListener {

    int id;
    int setPositionY = 0;
    int setDirectionY = 0;

    Paddles(int x, int setPositionY, int width, int height, int id) {
        super(x, setPositionY, width, height);
        this.id = id;


    }


    public void draw(Graphics g) {
        g.fillRect(x,setPositionY,width,height);
        g.setColor(Color.PINK);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }


    @Override
    public void keyPressed(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setDirectionY = -10;
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setDirectionY = 10;
                    move();
                }
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setDirectionY = -10;
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setDirectionY = 10;
                    move();
                }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setDirectionY = 0;
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setDirectionY = 0;
                    move();
                }
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setDirectionY = 0;
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setDirectionY = 0;
                    move();
                }
        }
    }

    public void move() {
        setPositionY = setPositionY + setDirectionY;
    }
}
