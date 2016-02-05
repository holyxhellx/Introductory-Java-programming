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
public class Cloud extends SkyObject{
    //value field 
    public int cloud;
    Random number = new Random();
    
    //Getter cloud value
    public int getSize() {
        return cloud;
    }
    
    //Method isEmpty
    public boolean isEmpty() {
        return cloud == 0;
    }
    //Method rain
    public void rain(int element) {
        recipient.receiveWater(element); //The element(random number) of water delevered to a GoundObject
        cloud = cloud - element; //The size of the cloud shrinks correspondingly
    }
    
    //Method progress
    @Override
    public void progress() {
        rain(number.nextInt());
    }
    
    /*//Method toString
    public String toString() {

    }*/
    
}
