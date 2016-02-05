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
public class GroundObject implements WeatherPart {
    //field called recipient
    public int water;
    
    //Getter for water field
    int getWater() {
        return water;
    }
    
    //Method receiveWater
    public void receiveWater(int element) {
        water = element; //collect the amount of water from element
    }
    //Method sendWater 
    public int sendWater(int element) {
        return element = water; //Send back the amount of water as element
    }
       
    @Override
    public void progress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
