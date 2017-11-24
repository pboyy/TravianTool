/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.util.Scanner;
import static oracle.jrockit.jfr.events.Bits.intValue;
/**
 *
 * @author Pieter
 */
public class JavaApplication13 {
        
        

        
    /**
     * 
     
     */
   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      
       int LimitNumber = 3 ;
       Scanner goran = new Scanner(System.in);
       do {
       System.out.print("Please enter a number higher than 0 : ");
       String next = goran.next();
       try {
           
       LimitNumber = Integer.parseInt(next);
    } catch (NumberFormatException exp) {
       
       
       
    }
    } 
       while (LimitNumber < 0);
       System.out.println("This number is higher than 0 congrats");
       boolean PrimeNumbers = true;

       for(int i=1; i < LimitNumber; i++){

                    boolean isPrime = true;

                    
                    for(int j=2; j < i ; j++){

                            if(i % j == 0){
                                    isPrime = false;
                                    break;
                            }
                    }
                    
                    if(isPrime)
                            System.out.println(i+ " ");
}                           System.out.print("these are all prime numbers from 0 to selected");


    }

       
      
       
             
       
      
       
    }
    }
    

