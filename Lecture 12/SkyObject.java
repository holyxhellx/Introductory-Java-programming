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
public class SkyObject implements WeatherPart {
    //field called recipient
    public /*protected*/ GroundObject recipient;
    
    //Setter for recipient field
    void setRecipient(GroundObject x) {
        recipient = x;
    }
    
    //Method hasRecipient
    public boolean hasRecipient() {
        return recipient != null;
    }   

    @Override
    public void progress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
