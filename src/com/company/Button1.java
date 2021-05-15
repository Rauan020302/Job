package com.company;

import javax.swing.*;
import java.awt.*;

public class Button1 {
    public static void main(String[] args) {
        Button1 gui = new Button1();
        //gui.go();
        gui.goes();
    }

    public void go(){
        JFrame frame = new JFrame();
        JButton button = new JButton("Click like you mean it");
        Font bigFont = new Font("serif",Font.BOLD,28);
        button.setFont(bigFont);

        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
    public void goes(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));


        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        panel.add(button);
        panel.add(buttonTwo);


        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250,200);
        frame.setVisible(true);
    }
}
