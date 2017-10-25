/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.util.regex.Pattern.compile;
import static java.util.regex.Pattern.compile;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static jdk.nashorn.internal.objects.NativeRegExp.compile;


/**
 *
 * @author Pieter
 */


public class newClass extends JFrame  {
    private  JLabel label;
    private final JButton button;
    private final JTextField text;
    
    public newClass (){
    setLayout (new FlowLayout());
    button = new JButton ("Fix P's Spine");
    add (button);
    label = new JLabel ("");
    add(label);
    
    text = new JTextField (15);
    add (text);
    
    newclass2 g = new newclass2 ();
            
    button.addActionListener (g);
         
    
    }
    
    public class newclass2 implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent g)
        {
            label.setText("Sorry P, seems u die");
        }
        
    }
    public static void main (String args []){
    newClass object = new newClass();
   object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   object.setSize(270,370);
   object.setVisible(true);
   object.setTitle("P fundraising");
    }
    
}
