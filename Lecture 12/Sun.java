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
public class Sun extends SkyObject {
    //field waterInAir
    public int waterInAir;
    Random number = new Random();
    
    //getwaterInAir
    public int getWaterInAir() {
        return waterInAir;
    }
    
    //Method shine
    public void shine(int element) {
        waterInAir = recipient.sendWater(element);
    }
    
    //Method cloudFormed
    public void cloudFormed() {
        waterInAir = 0;
    }
    
    //Method process
    @Override
    public void progress() {
        shine(number.nextInt());  
    } 
    
    /*//Method toString
    public String toString() {

    }*/
}
