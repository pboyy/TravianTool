/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Pieter
 */
public class JavaApplication8 extends JFrame implements ActionListener {
    
    private JLabel label;
    private final JButton button;
    private final JTextField x1Field;
    private final JTextField y1Field;
    private final JTextField x2Field;
    private final JTextField y2Field;
    
    public JavaApplication8 (){
        setLayout (new FlowLayout());
        
        x1Field = new JTextField("x1");
        y1Field = new JTextField("y1");
        x2Field = new JTextField("x2");
        y2Field = new JTextField("y2");
        
        add (x1Field);
        add (y1Field);
        add (x2Field);
        add (y2Field);
        
        button = new JButton ("Calculate Distance");
        add (button);
        label = new JLabel ("");
        add(label);

        button.addActionListener(this);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication8 object = new JavaApplication8();
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        object.setSize(270,370);
        object.setVisible(true);
        object.setTitle("P's Calulator");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String inputtedX1 = x1Field.getText();
        String inputtedY1 = y1Field.getText();
        String inputtedX2 = x2Field.getText();
        String inputtedY2 = y2Field.getText();
        
        int x1 = Integer.valueOf(inputtedX1);
        int y1 = Integer.valueOf(inputtedY1);
        int x2 = Integer.valueOf(inputtedX2);
        int y2 = Integer.valueOf(inputtedY2);
        
        double distance = TravianMath.getDistance(x1, y1, x2, y2);
        
        label.setText("The distance is: " + distance);
    }
    
}
