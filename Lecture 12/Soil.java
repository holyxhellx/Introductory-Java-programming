/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexam2014;

/**
 *
 * @author Asger
 */
public class Soil extends GroundObject {
    
    //Variable
    public Lake closestLake;
    
    //Constructor
    public Soil(Lake lake) { //Has to be near the closest lake (new Lake()) constructor
    this.closestLake = lake;
    }
            
    @Override        
    public void progress() {
        
        if (water > 0) {
            this.sendWater((int)(water*0.3));               //GoundObject(Soil) losses water
            closestLake.receiveWater((int) (water*0.3));    //GroundObject(Lake) collect water
        } else if (water < 0) {
            closestLake.sendWater((int)(water*0.3));
            this.receiveWater((int)(water*0.3));
        } else {
            //Nothing the lake and soil are balanced
        }
    }
    
    /*//Method toString
    public String toString() {

    }*/
}
