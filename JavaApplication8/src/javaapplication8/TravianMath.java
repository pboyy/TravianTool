/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author PBoy
 */
public class TravianMath {
    
    public static double getDistance(int x1, int y1, int x2, int y2, int speed ) {
        double result;
        
        
        int xDifference = Math.abs(Math.abs(x1) - Math.abs(x2));
        int yDifference = Math.abs(Math.abs(y1) - Math.abs(y2));
        result = Math.sqrt((Math.pow(xDifference, 2) + Math.pow(yDifference, 2)));
        
       
        
       
        return result;
        

       
        
        
    }
    
}
