package org.example;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlKey implements KeyListener {

    private Object object;
    private final JFrame window;

    public ControlKey(Object object, JFrame window){
        this.object = object;
        this.window = window;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_LEFT:
                break;
            case KeyEvent.VK_RIGHT:
                break;
            case KeyEvent.VK_UP:
                break;
            case KeyEvent.VK_DOWN:
                break;
        }
        window.repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {}
}
