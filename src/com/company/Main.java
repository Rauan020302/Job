package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);

    }
}
