/*
* Assignemnt 7.1
* 7.1 Design a class named MyDouble. The class contain:
* - A double data field named ’value’ that stores the double value represented 
*   by this object.
* - A constructor that creates a MyDouble object for the specified double value.
* - A getter method for the value field.
* - The method equals(MyDouble d) that returns true if the specified 
*   object’s value is equal to this object’s value.
*/
package assignment.pkg7;
    
public class MyDouble {
    // ---- Variables ---- //
    private double value;

        double getValue() {
            return value;
        }

    // ---- Constructor ---- //
    public MyDouble (double value){
        this.value = value; 
    }

    // ---- Methods ---- //
    public boolean equals(MyDouble d) {
        if(d.value == this.value) {
            return true;
        }
        return false;
    }    
}

