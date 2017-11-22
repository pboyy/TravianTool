/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Pieter
 */
public class NewClass {
public static int[] generateRandomNumbers() {
        int[] result = new int[10];
        for(int i = 10; i >= 1; i--) {
            result[i] = i*2;
        }
        return result;
    }
    
}
