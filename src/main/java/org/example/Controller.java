package org.example;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.KeyListener;

public class Controller {

    private final JFrame window;
    private final double x = 1920;
    private final double y = 1080;

   // public Point playerPosition;

    public Controller(){
        this.window = new JFrame();
        this.window.setTitle("Zelda 2D");
        this.window.setSize((int)x, (int)y);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void startApp(){
        this.window.setVisible(true);
        JButton button = new JButton("Start game!");
        button.addActionListener(e -> this.startGame());
        button.setSize(100,50);
        button.setLocation((int)Math.round(x*0.40), (int)Math.round(y*0.60));
        JButton button2 = new JButton("Exit game!");
        button2.addActionListener(e -> this.closeGame());
        button2.setSize(100,50);
        button2.setLocation((int)Math.round(x*0.57),(int)Math.round(y*0.60));
        this.window.add(button);
        this.window.add(button2);
        this.window.addKeyListener(new ControlKey(new Object(), window));
    }

    public void closeGame(){
        this.window.setVisible(false);
        System.exit(0);
    }
    public void startGame(){
        Container contentPane = this.window.getContentPane();

        contentPane.removeAll();

        // Add new content here (if any)

        // Revalidate and repaint the window
        contentPane.revalidate();
        contentPane.repaint();
        System.out.print("Casse les couilles");
    }



}
