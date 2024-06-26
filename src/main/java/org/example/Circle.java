package org.example;

import java.awt.*;

public class Circle extends Component{
    private int x, y, diameter;
    private Color color;

    public Circle(int x, int y, int diameter, Color color) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, diameter, diameter);
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}