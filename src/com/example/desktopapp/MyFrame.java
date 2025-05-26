package com.example.desktopapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class MyFrame extends JFrame {

    private JLabel myLabel;

    public MyFrame() {
        setTitle("First desktop app");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new java.awt.BorderLayout());

        myLabel = new JLabel("Shit lah",SwingConstants.CENTER);
        add(myLabel, java.awt.BorderLayout.CENTER);

        JButton myButton = new JButton("Heck man");
        add(myButton, java.awt.BorderLayout.SOUTH);

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                myLabel.setText("Heck man");
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyFrame();
            }
        });
    }
}
