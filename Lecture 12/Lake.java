/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexam2014;

import java.util.Random;

/**
 *
 * @author Asger
 */
public class Lake extends GroundObject {
    
    
    //---- Constructor ----//
    public Lake(){
        Random number   = new Random();
        this.water = number.nextInt();
    }
    
    //Method isDry
    public boolean isDry() {
       return water == 0; 
    }
    
    //Method progress
    @Override 
    public void progress() {
        
    }
    
    /*//Method toString
    public String toString() {

    }*/
}
