/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.util.Scanner;
/**
 *
 * @author Pieter
 */
public class JavaApplication13 {
        
        

        
    /**
     * 
     * @result args
     */
    public static void main(String[] args) {
       Scanner goran = new Scanner(System.in);
       double no1,no2,no3, no4;
       System.out.println("input first number: ");
       no1 = goran.nextDouble();
       System.out.println("input second number: ");
       no2 = goran.nextDouble();
       no3 = no1 + no2;
       no4 = no1 * no2;
       
       System.out.println("result is:"+no3);
       System.out.println("in case u wanted it multiplied result is: "+no4);
       
      
    }
    
}
