/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.Frame.NORMAL;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Pieter
 */
public class JavaApplication8 extends JFrame implements ActionListener {
    private final JLabel speedlabel; 
    private final JLabel label;
    private final JButton button;
    private final  JTextField x1Field;
    private final  JTextField y1Field;
    private final  JTextField x2Field;
    private final  JTextField y2Field;
    private final  JTextField fieldsperhour;
    private final JLabel x1Layout;
    private final JLabel x2Layout;
    private final JLabel y1Layout;
    private final JLabel y2Layout;
    public JavaApplication8 (){
        setLayout (new FlowLayout());
         
        x1Field = new JTextField("");
        fieldsperhour = new JTextField("");
        y1Field = new JTextField("");
        x2Field = new JTextField("");
        y2Field = new JTextField("");
        x1Layout = new JLabel("X1");
        y1Layout = new JLabel ("Y1");
        x2Layout = new JLabel ("X2");
        y2Layout = new JLabel ("Y2");
        
       x1Field.setColumns(4);
       x2Field.setColumns(4);
       y1Field.setColumns(4);
       y2Field.setColumns(4);
       fieldsperhour.setColumns (4);         
        add (x1Layout);
        add (x1Field);
        add (y1Layout);
        add (y1Field);
        add (x2Layout);
        add (x2Field);
        add (y2Layout);
        add (y2Field);
        
        button = new JButton ("Calculate Distance");
        add (button);
        label = new JLabel ("");
        add(label);
        speedlabel = new JLabel ("");
        add(speedlabel);
        button.addActionListener(this);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication8 object = new JavaApplication8();
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        object.setSize(420,170);
        object.setVisible(true);
        object.setTitle("P's Calulator");
        object.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String inputtedX1 = x1Field.getText();
        String inputtedY1 = y1Field.getText();
        String inputtedX2 = x2Field.getText();
        String inputtedY2 = y2Field.getText();
        String speed = fieldsperhour.getText();
        try {
            int x1 = Integer.valueOf(inputtedX1);
            int y1 = Integer.valueOf(inputtedY1);
            int x2 = Integer.valueOf(inputtedX2);
            int y2 = Integer.valueOf(inputtedY2);
            int speed1 = Integer.valueOf(speed);
            
            double distance = TravianMath.getDistance(x1, y1, x2, y2);
            double time = (distance/speed1) ;
            double timehours= time;
            int walking_ts = (int)(time*3600);
            int walking_h = (int)(walking_ts/3600);
            int walking_m = (int)((walking_ts%3600)/60);
            int walking_s = (int)(walking_ts%60.0);
            speedlabel.setText("time to travel"+walking_h + walking_m + walking_s);
            label.setText("The distance is: " + distance);
        } catch (Exception e) {
            label.setText("You did not input valid coordinates: " + e.getMessage());
        }
    }
    
}
