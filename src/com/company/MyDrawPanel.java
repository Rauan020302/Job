package com.company;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    
    public void paintComponent1(Graphics g){
        g.setColor(Color.orange);

        g.fillRect(20,50,100,100);
    }
    public void paintComponent2(Graphics g){
        Image image = new ImageIcon("catzilla.jpg").getImage();
        g.drawImage(image,3,4,this);
    }
    public void paintComponent3(Graphics g){
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red,blue,green);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);
    }
    public void paintComponent4(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient = new GradientPaint(70,70,Color.BLUE,150,150,Color.orange);

        g2d.setPaint(gradient);

        g2d.fillOval(70,70,100,100);
    }
    public void paintComponent5(Graphics g){
        Graphics2D g2d = (Graphics2D)g;

        int red = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);
        Color startColor = new Color(red,blue,green);

        red = (int) (Math.random()*255);
        blue = (int) (Math.random()*255);
        green = (int) (Math.random()*255);
        Color endColor = new Color(red,blue,green);

        GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }
}
