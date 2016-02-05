/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexam2014;


import static java.util.Collections.list;
import java.util.LinkedList;

/**
 *
 * @author Asger
 */
public class WeatherSystem {
    //Variable
    LinkedList<WeatherPart> list = new LinkedList<>();
    public Sun sun;
    public Cloud cloud;
    public Lake lastestLake;
    public Soil soil;
    public long Time;
    
    //Constructor
    public WeatherSystem() {
        //add to the linkedlist
        list.add(new Sun());
        list.add(new Cloud());
        list.add(new Lake());
        list.add(new Soil(lastestLake));
        
        //Time
        long time = System.currentTimeMillis();
    }
    
    //Method passTime
    public void passTime() {
        
    }
    
    //Method 
    
}
