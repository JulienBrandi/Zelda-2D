package org.example;

import javax.swing.*;

public class Controller {

    private final JFrame window;

    public Controller(){
        this.window = new JFrame();
        this.window.setTitle("Zelda 2D");
        this.window.setSize(1920, 1080);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void startApp(){
        this.window.setVisible(true);
    }

}
